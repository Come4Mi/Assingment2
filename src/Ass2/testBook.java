package Ass2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class testBook{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Scanner sear = new Scanner(System.in);
		Scanner pur = new Scanner(System.in);
	 	
		Book book1 = new Book("Java,How to Program", "Paul Deitel", "IN", 2017, "IT");
		Book book2 = new Book("Mastering Java Machine Learning", "Krishna Choppella", "IN", 2016, "IT"); 
		Book book3 = new Book("Python Crash Course", "Eric Matthes", "IN", 2015, "IT"); 
		Book book4 = new Book("The life-changing Magic of Tidying Up", "Marie Kondo", "IN", 2014, "Sci-fi"); 
		Book book5 = new Book("Managing Stress", "undefine", "IN", 2018, "Comic"); 
		Book book6 = new Book("Principles: Life and Work", "Ray Dalio", "IN", 2017, "Comic"); 
		
		//Add to Array List
		ArrayList<Book> books=new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		
		Iterator itr=books.iterator();
		
		for(int i = 0; i < books.size(); i++){
			if(books.get(i).getType().equalsIgnoreCase("IT")){
			books.get(i).setPrice(20.00);
			}else if(books.get(i).getType().equalsIgnoreCase("Sci-fi")){
				books.get(i).setPrice(15.00);
				}else{
					books.get(i).setPrice(10.00);
			}
		}
		
		Methods M = new Methods();
		
		System.out.println("________________________________________________________________");
		System.out.println("Title  " + "\t\t\t\t\t\t\tPublish  ");
		System.out.println("________________________________________________________________");
		
		//loop to print out arrayList
		 while(itr.hasNext()){
			   Book st=(Book)itr.next();  
			   
			   System.out.println(st.getTitle() + "\t\t\t" + st.getPublish());  
			   System.out.println("________________________________________________________________");
		}  
		
		String option;
		String book;
		String type;
		String purchase;
		
		
		//loop menu
		do{
            System.out.println("Options \n");
            System.out.print("a.) Renting a book \n");
            System.out.print("b.) Returning a book \n");
            System.out.print("c.) Purchase a book\n");
            System.out.print("d.) Print out information for all the books\n");
            System.out.print("e.) Exit program\n");
            
            //choose options
            System.out.println("Choose Option");
            option = scan.next();

    		switch(option){
    		
    			//case 1: renting a Book
    			case "a": System.out.println("Search Book for rent");
    					
    					book = sear.nextLine();
    					
    					System.out.println("Search Type for rent");
    					type = sear.nextLine();
    					
    					String ret = M.rentMethod(book, type, books);
    					System.out.println(ret);

    				break;
    				
    			//case 2: Returning a Book
    			case "b": System.out.println("Search Book for return");
				
				book = sear.nextLine();
				
				System.out.println("Search Type for returning");
				type = sear.nextLine();

				String retu = M.returnMethod(book, type, books);
				System.out.print(retu);

			break;
    				
				//case 3: Purchase a Book
    			case "c": System.out.println("Search Book for purchase");
				
				book = sear.nextLine();
				
				System.out.println("Search Type for purchase");
				type = sear.nextLine();

				String purchaseBook = M.purchaseMethod(book, type, books);
				
				System.out.println("Status : " + purchaseBook);
				
				if(purchaseBook.equalsIgnoreCase("out")){
					System.out.println("Not Available");
					
				}else{
				//purchase press Y
				for(int i = 0; i < books.size(); i++){
					if(books.get(i).getTitle().equalsIgnoreCase(book)){
						if(books.get(i).getType().equalsIgnoreCase(type)){
							System.out.println("Book Available");
							System.out.println("Purchase this Book?");
							
							purchase = pur.next();
							
						if(purchase.equalsIgnoreCase("y")){
							books.get(i).setStatus("Purchased");
							System.out.println("Purchased");
						}else{}
						
					}
					}
				}
				}
				
				
			break;
    				
				//case 4: Print all Book's information
    			case "d" :		
    				
    				M.Print(books);

    				break;
    			
    			//case 5: Exit Program
    			case "e" :System.exit(0);
    				break;
    		
    		}

		}while(option != "e");
		
		
		scan.close();
		sear.close();
		pur.close();
	}

}
