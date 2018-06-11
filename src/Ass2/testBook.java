package Ass2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class testBook{
	public static void main(String[] args){
		//scan option
		Scanner scan = new Scanner(System.in);
		//scan title and type
		Scanner sear = new Scanner(System.in);
		
		ArrayList<Customer> customer = new ArrayList<Customer>();
		
		//Book arraylist
		Book book1 = new Book("Java,How to Program", "\t\tPaul Deitel\t", "IN", 2017, "IT");
		Book book2 = new Book("Mastering Java Machine Learning", "\tKrishna Choppella", "IN", 2016, "IT"); 
		Book book3 = new Book("Python Crash Course", "\t\tEric Matthes\t", "IN", 2015, "IT"); 
		Book book4 = new Book("The life-changing Magic of Tidying Up", "Marie Kondo\t", "IN", 2014, "Sci-fi"); 
		Book book5 = new Book("Managing Stress", "\t\t\tundefine\t", "IN", 2018, "Comic"); 
		Book book6 = new Book("Principles: Life and Work", "\tRay Dalio\t", "IN", 2017, "Comic"); 
		ArrayList<Book> books=new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		
		//DVD arrayList
		DVDs dvd1 = new DVDs("Star Wars", 3.5, "Lucas\t", "Action", 2018, "IN");
		DVDs dvd2 = new DVDs("Deadth Note", 2.5, "Tarantino", "Thriller", 2014, "IN");
		DVDs dvd3 = new DVDs("Harry potter", 2.5, "\t ", "Sci-fi", 2006, "IN");
		DVDs dvd4 = new DVDs("Shrek", 2, "\tAgogo\t", "Animation", 2011, "IN");
		DVDs dvd5 = new DVDs("Transformers", 3, "\t ", "Action", 2016, "IN");
		DVDs dvd6 = new DVDs("Avenger", 3, "\t\t ", "Action", 2018, "IN");
		ArrayList<DVDs> dvds = new ArrayList<DVDs>();
		dvds.add(dvd1);
		dvds.add(dvd2);
		dvds.add(dvd3);
		dvds.add(dvd4);
		dvds.add(dvd5);
		dvds.add(dvd6);
		
		Methods M = new Methods();
		
		//customer
		String name;
		int age;
		int phoneNum;
		
		String option;
		String search;
		String genre;
		String purchase;
		String choice;
		
		//loop menu
		do{
	        System.out.println("Options \n");
	        System.out.print("a.) Books \n");
	        System.out.print("b.) DVDs \n");
	        System.out.print("c.) MusicCD \n");
	        System.out.print("d.) Software\n");
	        System.out.print("e.) Hardware\n");
	        System.out.print("f.) Stationery\n");
	        System.out.print("g.) Print Customer\n");
	        System.out.print("h.) Exit program\n");
            
            //choose options
            System.out.println("Choose Option");
            option = scan.next();
//....................................................................................................................................
    		switch(option){
    		case "a":
    			//loop set Book price
    			for(int i = 0; i < books.size(); i++){
    				if(books.get(i).getType().equalsIgnoreCase("IT")){
    				books.get(i).setPrice(20.00);
    				}else if(books.get(i).getType().equalsIgnoreCase("Sci-fi")){
    					books.get(i).setPrice(15.00);
    					}else{
    						books.get(i).setPrice(10.00);
    				}
    			}
    			
    			Iterator itr=books.iterator();
    			
    			System.out.println("________________________________________________________________");
    			System.out.println("Title  " + "\t\t\t\t\t\t\tType  ");
    			System.out.println("________________________________________________________________");
    			
    			//loop to print out arrayList
    			 while(itr.hasNext()){
    				   Book st=(Book)itr.next();  
    				   
    				   System.out.println(st.getTitle() + "\t\t\t" + st.getType());  
    				   System.out.println("________________________________________________________________");
    			}  
    			 
    	            System.out.println("Options \n");
    	            System.out.print("a.) Renting a book \n");
    	            System.out.print("b.) Returning a book \n");
    	            System.out.print("c.) Purchase a book\n");
    	            System.out.print("d.) Print out information for all the books\n");
    	            System.out.print("e.) Exit program\n");
    	            
    	        //switch loop choice
    			choice = scan.next();
    			//rent
    			switch(choice){
    				case "a":
    					System.out.println("Search Book for rent");
    					search = sear.nextLine();
    					System.out.println("Search Type for rent");
    					genre = sear.nextLine();
    					String ret = M.rentMethod(search, genre, books);
    					System.out.println(ret);
    					break;
    					//Return
    				case "b":
    					//case 2: Returning a Book
    					System.out.println("Search Book for return");
    					search = sear.nextLine();
    					System.out.println("Search Type for returning");
    					genre = sear.nextLine();
    					String retu = M.returnMethod(search, genre, books);
    					System.out.print(retu);
    				break;
    					//Purchase
    				case "c":
    					System.out.println("Search Book for purchase");
    					search = sear.nextLine();
    					System.out.println("Search Type for purchase");
    					genre = sear.nextLine();
    					String purchaseBook = M.purchaseMethod(search, genre, books);
    					System.out.println("Status : " + purchaseBook);
    				
    					if(purchaseBook.equalsIgnoreCase("out") || purchaseBook.equalsIgnoreCase("purchased")){
    						System.out.println("Not Available");
    					
    					}else{
    						//purchase press Y
    						for(int i = 0; i < books.size(); i++){
    							if(books.get(i).getTitle().equalsIgnoreCase(search)){
    								if(books.get(i).getType().equalsIgnoreCase(genre)){
    									System.out.println("Book Available");
    									System.out.println("Purchase this Book?");
    							
    									purchase = scan.next();
    							
    									if(purchase.equalsIgnoreCase("y")){
    										//customer
    										System.out.println("Customer Name");
    										name = scan.next();
    										System.out.println("Customer Age");
    										age = scan.nextInt();
    										System.out.println("Customer Phone Number");
    										phoneNum = scan.nextInt();
    										
    										Customer cus = new Customer(name, age, phoneNum, books.get(i).getPrice(), books.get(i).getTitle());
    										customer.add(cus);
    										
    										books.get(i).setStatus("Purchased");
    										System.out.println("Purchased By " + name);
    									}else{}
    						
    								}
    							}
    						}
    					}
    				break;
    				//display
    				case "d":
    					M.Print(books);
    				break;
    				//Exit program
    				case "e":
    					System.exit(0);
    				default:
    					System.out.println("Please choose one");
    					break;
    				};
    				
    				//break loop
    				break;
    			
//....................................................................................................................................
    			
//....................................................................................................................................
    		//DVD
    		case "b":
    			//loop set DVD price
    			for(int i = 0; i < dvds.size(); i++){
    				if(dvds.get(i).getGenre().equalsIgnoreCase("Action")){
    				dvds.get(i).setPrice(20.00);
    				}else if(dvds.get(i).getGenre().equalsIgnoreCase("Thriller")){
    					dvds.get(i).setPrice(15.00);
    					}else if(dvds.get(i).getGenre().equalsIgnoreCase("Sci-fi")){
    						dvds.get(i).setPrice(10.00);
    					}else{
    						dvds.get(i).setPrice(5.00);
    				}
    			}
    			
    			Iterator dvd=dvds.iterator();
    			
    			System.out.println("________________________________________________________________");
    			System.out.println("Title  " + "\t\t\t\tGenre  ");
    			System.out.println("________________________________________________________________");
    			
    			//loop to print out arrayList
   			 while(dvd.hasNext()){
   				   DVDs st=(DVDs)dvd.next();  
   				   
   				   System.out.println(st.getTitle() + "\t\t\t" + st.getGenre());  
   				   System.out.println("________________________________________________________________");
   			 } 
    			
   	            System.out.println("Options \n");
	            System.out.print("a.) Renting a DVD \n");
	            System.out.print("b.) Returning a DVD \n");
	            System.out.print("c.) Purchase a DVD\n");
	            System.out.print("d.) Print out information for all the DVDs\n");
	            System.out.print("e.) Exit program\n");
	            
	            choice = scan.next();
				//rent
				switch(choice){
					case "a":
						System.out.println("Search DVD for rent");
							search = sear.nextLine();
						System.out.println("Search Genre for rent");
							genre = sear.nextLine();
							String ret = M.rentDVD(search, genre, dvds);
						System.out.println(ret);
					break;
						//Return
					case"b":
						//case 2: Returning a DVD
						System.out.println("Search DVD for return");
							search = sear.nextLine();
						System.out.println("Search Genre for returning");
							genre = sear.nextLine();
							String retu = M.returnDVD(search, genre, dvds);
						System.out.print(retu);
					break;
				
					//Purchase DVD
					case "c":
						System.out.println("Search DVD for purchase");
							search= sear.nextLine();
						System.out.println("Search Genre for purchase");
							genre = sear.nextLine();
							String purchaseDVD = M.purchaseDVD(search, genre, dvds);
						System.out.println("Status : " + purchaseDVD);
				
						if(purchaseDVD.equalsIgnoreCase("out") || purchaseDVD.equalsIgnoreCase("purchased")){
							System.out.println("Not Available");
					
						}else{
							//purchase press Y
							for(int i = 0; i < dvds.size(); i++){
								if(dvds.get(i).getTitle().equalsIgnoreCase(search)){
									if(dvds.get(i).getGenre().equalsIgnoreCase(genre)){
										System.out.println("DVD Available");
										System.out.println("Purchase this DVD?");
							
										purchase = scan.next();
							
										if(purchase.equalsIgnoreCase("y")){
    										//customer
    										System.out.println("Customer Name");
    										name = scan.next();
    										System.out.println("Customer Age");
    										age = scan.nextInt();
    										System.out.println("Customer Phone Number");
    										phoneNum = scan.nextInt();
    										
    										Customer cus = new Customer(name, age, phoneNum, dvds.get(i).getPrice(), dvds.get(i).getTitle());
    										customer.add(cus);
    										
											dvds.get(i).setStatus("Purchased");
											System.out.println("Purchased by " + name);
										}else{}
						
									}
								}
							}
						}
						break;
						//display
					case "d":
						M.PrintDVD(dvds);
						break;
						//Exit program
					case "e":
				System.exit(0);
				break;
				default:System.out.println("Please choose one");break;
			};break;
//....................................................................................................................................
    			
    		//Music CD
    		case "c":;break;
    		//Software
    		case "d":;break;
    		//Hardware
    		case "e":;break;
    		//Stationary
    		case "f":;break;
    		//Exit program
    		case "g":M.PrintCustomer(customer);break;
    		case "h":System.exit(0);break;
    		default:System.out.println("Please choose one");break;
    		}
    		

		}while(option != "e");
		
		
		scan.close();
		sear.close();

	}

}
