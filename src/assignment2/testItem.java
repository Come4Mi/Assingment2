package assignment2;

import method.rentMethods;
import method.returnMethods;
import method.purchaseMethods;
import method.printMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class testItem{
	public static void main(String[] args){
		//scan option
		Scanner scan = new Scanner(System.in);
		//scan title and type
		Scanner sear = new Scanner(System.in);
		
		ArrayList<CustomerInfo> customerinfo = new ArrayList<CustomerInfo>();
		ArrayList<CustomerSpent> customerspent = new ArrayList<CustomerSpent>();
		
		//Book arraylist
		Book book1 = new Book("Java,How to Program", "Paul Deitel", "IN", 2017, "IT");
		Book book2 = new Book("Mastering Java Machine Learning", "Krishna Choppella", "IN", 2016, "IT"); 
		Book book3 = new Book("Python Crash Course", "Eric Matthes", "IN", 2015, "IT"); 
		Book book4 = new Book("The life-changing Magic of Tidying Up", "Marie Kondo", "IN", 2014, "Sci-fi"); 
		Book book5 = new Book("Managing Stress", "tundefine", "IN", 2018, "Comic"); 
		Book book6 = new Book("Principles: Life and Work", "Ray Dalio", "IN", 2017, "Comic"); 
		ArrayList<Book> books=new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		
		//DVD arrayList
		DVDs dvd1 = new DVDs("Star Wars", 3.5, "Lucas", "Action", 2018, "IN");
		DVDs dvd2 = new DVDs("Deadth Note", 2.5, "Tarantino", "Thriller", 2014, "IN");
		DVDs dvd3 = new DVDs("Harry potter", 2.5, "Columbus", "Sci-fi", 2006, "IN");
		DVDs dvd4 = new DVDs("Shrek", 2, "Agogo", "Animation", 2011, "IN");
		DVDs dvd5 = new DVDs("Transformers", 3, "Michael.B", "Action", 2016, "IN");
		DVDs dvd6 = new DVDs("Avenger", 3, "Joss.W", "Action", 2018, "IN");
		ArrayList<DVDs> dvds = new ArrayList<DVDs>();
		dvds.add(dvd1);
		dvds.add(dvd2);
		dvds.add(dvd3);
		dvds.add(dvd4);
		dvds.add(dvd5);
		dvds.add(dvd6);
		
		//MusicCD arrayList
		MusicCD cd1 = new MusicCD("S.H.E", 3.5, "Rock Company\t", "Hip-pop", 2010, "IN");
		MusicCD cd2 = new MusicCD("Tank", 2.5, "Rock Company", "Blues", 2014, "IN");
		MusicCD cd3 = new MusicCD("One Ok Rock", 2.5, "\tOne Ok Rock ", "Rock", 2016, "IN");
		MusicCD cd4 = new MusicCD("ACDC", 2, "\t\tACDC", "Rock", 2011, "IN");
		MusicCD cd5 = new MusicCD("JJ Lim", 3, "\tRock Company ", "Classical", 2016, "IN");
		MusicCD cd6 = new MusicCD("Jay chou", 3, "\t\t JVR Music", "Classical", 2018, "IN");
		ArrayList<MusicCD> cds = new ArrayList<MusicCD>();
		cds.add(cd1);
		cds.add(cd2);
		cds.add(cd3);
		cds.add(cd4);
		cds.add(cd5);
		cds.add(cd6);
		
		//Hardware arrayList
		Hardware hardware1 = new Hardware("GTX 980", "GPU", "Nvidia",2014, "IN");
		Hardware hardware2 = new Hardware("GTX 1080", "GPU", "Nvidia",2018, "IN");
		Hardware hardware3 = new Hardware("GTX 1070", "GPU", "Nvidia",2017, "IN");
		Hardware hardware4 = new Hardware("RX 580", "GPU", "AMD",2017, "IN");
		Hardware hardware5 = new Hardware("i7", "CPU", "Intel",2018, "IN");
		Hardware hardware6 = new Hardware("CX 760", "PSU", "Cosair",2018, "IN");
		ArrayList<Hardware> hardware = new ArrayList<Hardware>();
		hardware.add(hardware1);
		hardware.add(hardware2);
		hardware.add(hardware3);
		hardware.add(hardware4);
		hardware.add(hardware5);
		hardware.add(hardware6);
				
		//Software arrayList
		Software software1 = new Software("Premier Pro", "Media Editor", "Adobe",2003, "IN");
		Software software2 = new Software("Final Cut Pro X 10.4.2", "Media Editor", "Apple",2018, "IN");
		Software software3 = new Software("CC 2018 (15.1.1.12)", "Media Editor", "Adobe",2018, "IN");
		Software software4 = new Software("Edge", "Web Browser", "Microsoft",2018, "IN");
		Software software5 = new Software("Kaspersky Lab", "Cybersecurity", "Kaspersky",1997, "IN");
		Software software6 = new Software("Word 2016", "Writing", "Microsoft",2016, "IN");
		ArrayList<Software> software = new ArrayList<Software>();
		software.add(software1);
		software.add(software2);
		software.add(software3);
		software.add(software4);
		software.add(software5);
		software.add(software6);
		
		//Stationary arrayList
		Stationary stationary1 = new Stationary("Blue Pen", "Pen", "Mossery\t",2014, "IN");
		Stationary stationary2 = new Stationary("Marker Pen", "Pen", "Mossery\t",2018, "IN");
		Stationary stationary3 = new Stationary("Colored pencil", "pencil", "Stickerrific\t",2017, "IN");
		Stationary stationary4 = new Stationary("Red Pen", "Pen", "Mossery\t",2017, "IN");
		Stationary stationary5 = new Stationary("Black Pen", "Pen", "Mossery\t",2018, "IN");
		Stationary stationary6 = new Stationary("Eraser", "Eraser", "Stickerrific\t",2018, "IN");
		ArrayList<Stationary> stationary = new ArrayList<Stationary>();
		stationary.add(stationary1);
		stationary.add(stationary2);
		stationary.add(stationary3);
		stationary.add(stationary4);
		stationary.add(stationary5);
		stationary.add(stationary6);
		
		//Methods
		rentMethods rent = new rentMethods();
		returnMethods returns = new returnMethods();
		purchaseMethods pur = new purchaseMethods();
		printMethods print = new printMethods();
		
		String option;
		String search;
		String genre;
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
    			System.out.println("Title  " + "\t\t\t\t\t\tType  ");
    			System.out.println("________________________________________________________________");
    			String formatBooks="%-48s%s%n";
    			//loop to print out arrayList
    			 while(itr.hasNext()){
    				   Book st=(Book)itr.next();  
    				   System.out.printf(formatBooks, st.getTitle(), st.getType());  
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
    					String ret = rent.rentMethod(search, genre, books, customerinfo);
    					System.out.println(ret);
    					break;
    					//Return
    				case "b":
    					//case 2: Returning a Book
    					System.out.println("Search Book for return");
    					search = sear.nextLine();
    					System.out.println("Search Type for returning");
    					genre = sear.nextLine();
    					String retu = returns.returnMethod(search, genre, books, customerinfo);
    					System.out.print(retu);
    				break;
    					//Purchase
    				case "c":
    					System.out.println("Search Book for purchase");
    					search = sear.nextLine();
    					System.out.println("Search Type for purchase");
    					genre = sear.nextLine();
    					String purchaseBook = pur.purchaseMethod(search, genre, books, customerinfo, customerspent);
    					
    					System.out.println(purchaseBook);

    				break;
    				//display
    				case "d":
    					print.Print(books);
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
    			
    			System.out.println("_______________________________________");
    			System.out.println("Title  " + "\t\t\tGenre  ");
    			System.out.println("_______________________________________");
    			String formatDVD="%-24s%s%n";
    			//loop to print out arrayList
   			 while(dvd.hasNext()){
   				   DVDs st=(DVDs)dvd.next();  
   				   
   				   System.out.printf(formatDVD, st.getTitle(), st.getGenre());  
   				   System.out.println("_______________________________________");
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
							String ret = rent.rentDVD(search, genre, dvds, customerinfo);
						System.out.println(ret);
					break;
						//Return
					case"b":
						//case 2: Returning a DVD
						System.out.println("Search DVD for return");
							search = sear.nextLine();
						System.out.println("Search Genre for returning");
							genre = sear.nextLine();
							String retu = returns.returnDVD(search, genre, dvds, customerinfo);
						System.out.print(retu);
					break;
				
					//Purchase DVD
					case "c":
						System.out.println("Search DVD for purchase");
							search= sear.nextLine();
						System.out.println("Search Genre for purchase");
							genre = sear.nextLine();
							String purchaseDVD = pur.purchaseDVD(search, genre, dvds, customerinfo, customerspent);
						System.out.println(purchaseDVD);
						
						break;
						//display
					case "d":
						print.PrintDVD(dvds);
						break;
						//Exit program
					case "e":
				System.exit(0);
				break;
				default:System.out.println("Please choose one");break;
			};break;
//....................................................................................................................................
    			
    		//Music CD
    		case "c":
    			//loop set CD price
    			for(int i = 0; i < cds.size(); i++){
    				if(cds.get(i).getGenre().equalsIgnoreCase("Classical")){
    				cds.get(i).setPrice(20.00);
    				}else if(cds.get(i).getGenre().equalsIgnoreCase("Rock")){
    					cds.get(i).setPrice(15.00);
    					}else if(cds.get(i).getGenre().equalsIgnoreCase("Hip-pop")){
    						cds.get(i).setPrice(10.00);
    					}else{
    						cds.get(i).setPrice(5.00);
    				}
    			}
    			
    			Iterator cd=cds.iterator();
    			
    			System.out.println("________________________________________________________________");
    			System.out.println("Title  " + "\t\t\t\tGenre  ");
    			System.out.println("________________________________________________________________");
    			
    			//loop to print out arrayList
   			 while(cd.hasNext()){
   				   MusicCD st=(MusicCD)cd.next();  
   				   
   				   System.out.println(st.getTitle() + "\t\t\t" + st.getGenre());  
   				   System.out.println("________________________________________________________________");
   			 } 
    			
   	            System.out.println("Options \n");
	            System.out.print("a.) Renting a MusicCD \n");
	            System.out.print("b.) Returning a MusicCD \n");
	            System.out.print("c.) Purchase a MusicCD\n");
	            System.out.print("d.) Print out information for all the MusicCDs\n");
	            System.out.print("e.) Exit program\n");
	            
	            choice = scan.next();
				//rent
				switch(choice){
					case "a":
						System.out.println("Search MusicCD for rent");
							search = sear.nextLine();
						System.out.println("Search Genre for rent");
							genre = sear.nextLine();
							String ret = rent.rentMusicCD(search, genre, cds, customerinfo);
						System.out.println(ret);
					break;
						//Return
					case"b":
						//case 2: Returning a MusicCD
						System.out.println("Search MusicCD for return");
							search = sear.nextLine();
						System.out.println("Search Genre for returning");
							genre = sear.nextLine();
							String retu = returns.returnMusicCD(search, genre, cds, customerinfo);
						System.out.print(retu);
					break;
				
					//Purchase DVD
					case "c":
						System.out.println("Search MusicCD for purchase");
							search= sear.nextLine();
						System.out.println("Search Genre for purchase");
							genre = sear.nextLine();
							String purchaseMusicCD = pur.purchaseMusicCD(search, genre, cds, customerinfo, customerspent);
						System.out.println(purchaseMusicCD);
						
						break;
						//display
					case "d":
						print.PrintMusicCD(cds);
						break;
						//Exit program
					case "e":
				System.exit(0);
				break;
				default:System.out.println("Please choose one");break;
			};break;
    		
    		
 //......................................................................................................................................
    		//Software
    		case "d":
    		
    		//loop set Software price
			for(int i = 0; i < software.size(); i++){
				if(software.get(i).getType().equalsIgnoreCase("Media Editor")){
				software.get(i).setPrice(380.00);
				}else if(software.get(i).getType().equalsIgnoreCase("Cybersecurity")){
					software.get(i).setPrice(285.00);
					}else if(software.get(i).getType().equalsIgnoreCase("Writing")){
						software.get(i).setPrice(800.00);
					}else{
						software.get(i).setPrice(5.00);
				}
			}
			
        Iterator Software=software.iterator();
			
			System.out.println("_________________________________________________");
			System.out.println("Title  " + "\t\t\t\tType  ");
			System.out.println("_________________________________________________");
			String formatSoftware="%-32s%s%n";
			//loop to print out arrayList
			 while(Software.hasNext()){
				   Software st=(Software)Software.next();  
				   
				   System.out.printf(formatSoftware, st.getTitle(), st.getType());  
				   System.out.println("_________________________________________________");
			 } 
			
	            System.out.println("Options \n");
            System.out.print("a.) Renting a Software \n");
            System.out.print("b.) Returning a Software \n");
            System.out.print("c.) Purchase a Software\n");
            System.out.print("d.) Print out information for all the Software\n");
            System.out.print("e.) Exit program\n");
            
            choice = scan.next();
			//rent
			switch(choice){
				case "a":
					System.out.println("Search Software for rent");
						search = sear.nextLine();
					System.out.println("Search Type for rent");
				        genre = sear.nextLine();
						String ret = rent.rentSoftware(search, genre, software, customerinfo);
					System.out.println(ret);
				break;
					//Return
				case"b":
					//case 2: Returning a Software
					System.out.println("Search Software for return");
						search = sear.nextLine();
					System.out.println("Search Type for returning");
						genre = sear.nextLine();
						String retu = returns.returnSoftware(search, genre, software, customerinfo);
					System.out.print(retu);
				break;
			
				//Purchase Software
				case "c":
					System.out.println("Search Software for purchase");
						search= sear.nextLine();
					System.out.println("Search Type for purchase");
						genre = sear.nextLine();
						String purchaseSoftware = pur.purchaseSoftware(search, genre, software, customerinfo, customerspent);
					System.out.println(purchaseSoftware);

					break;
					//display
				case "d":
					print.PrintSoftware(software);
					break;
					//Exit program
				case "e":
			System.exit(0);
			break;
			default:System.out.println("Please choose one");break;
		};break;
			
 
  //................................................................................................................................. 		
 //.................................................................................................................................
    		//Hardware
    		case "e":
    			//loop set Hardware price
    			for(int i = 0; i < hardware.size(); i++){
    				if(hardware.get(i).getType().equalsIgnoreCase("GPU")){
    				hardware.get(i).setPrice(3800.00);
    				}else if(hardware.get(i).getType().equalsIgnoreCase("CPU")){
    					hardware.get(i).setPrice(1200.00);
    					}else if(hardware.get(i).getType().equalsIgnoreCase("PSU")){
    						hardware.get(i).setPrice(650.00);
    					}else{
    						hardware.get(i).setPrice(5.00);
    				}
    			}
    			
            Iterator Hardware=hardware.iterator();
    			
    			System.out.println("______________________________________");
    			System.out.println("Title  " + "\t\t\t\tType  ");
    			System.out.println("______________________________________");
    			String formatHardware="%-32s%s%n";
    			//loop to print out arrayList
   			 while(Hardware.hasNext()){
   				   Hardware st=(Hardware)Hardware.next();  
   				   
   				   System.out.printf(formatHardware, st.getTitle(), st.getType());  
   				   System.out.println("______________________________________");
   			 } 
    			
   	            System.out.println("Options \n");
	            System.out.print("a.) Renting a Hardware \n");
	            System.out.print("b.) Returning a Hardware \n");
	            System.out.print("c.) Purchase a Hardware\n");
	            System.out.print("d.) Print out information for all the Hardware\n");
	            System.out.print("e.) Exit program\n");
	            
	            choice = scan.next();
				//rent
				switch(choice){
					case "a":
						System.out.println("Search Hardware for rent");
							search = sear.nextLine();
						System.out.println("Search Type for rent");
					        genre = sear.nextLine();
							String ret = rent.rentHardware(search, genre, hardware, customerinfo);
						System.out.println(ret);
					break;
						//Return
					case"b":
						//case 2: Returning a Hardware
						System.out.println("Search Hardware for return");
							search = sear.nextLine();
						System.out.println("Search Type for returning");
							genre = sear.nextLine();
							String retu = returns.returnHardware(search, genre, hardware, customerinfo);
						System.out.print(retu);
					break;
				
					//Purchase Hardware
					case "c":
						System.out.println("Search Hardware for purchase");
							search= sear.nextLine();
						System.out.println("Search Type for purchase");
							genre = sear.nextLine();
							String purchaseHardware = pur.purchaseHardware(search, genre, hardware, customerinfo, customerspent);
						System.out.println(purchaseHardware);
						
						break;
						//display
					case "d":
						print.PrintHardware(hardware);
						break;
						//Exit program
					case "e":
				System.exit(0);
				break;
				default:System.out.println("Please choose one");break;
			};break;
    			
 
    			
    			
    			
    			
    			
    			
    			
    			
 //.................................................................................................................................
    		//Stationary
    		case "f":
    			//loop set Stationary price
    			for(int i = 0; i < stationary.size(); i++){
    				if(stationary.get(i).getType().equalsIgnoreCase("Pen")){
    					stationary.get(i).setPrice(2.50);
    				}else if(stationary.get(i).getType().equalsIgnoreCase("Pencil")){
    					stationary.get(i).setPrice(1.50);
    					}else if(stationary.get(i).getType().equalsIgnoreCase("Eraser")){
    						stationary.get(i).setPrice(0.50);
    					}else{
    						stationary.get(i).setPrice(1);
    				}
    			}
    			
            Iterator Stationary=stationary.iterator();
    			
    			System.out.println("________________________________________________________________");
    			System.out.println("Title  " + "\t\t\t\tType  ");
    			System.out.println("________________________________________________________________");
    			
    			//loop to print out arrayList
   			 while(Stationary.hasNext()){
   				Stationary st=(Stationary)Stationary.next();  
   				   
   				   System.out.println(st.getTitle() + "\t\t\t" + st.getType());  
   				   System.out.println("________________________________________________________________");
   			 } 
    			
   	            System.out.println("Options \n");
	            System.out.print("a.) Renting a stationary Item \n");
	            System.out.print("b.) Returning a stationary Item \n");
	            System.out.print("c.) Purchase a stationary Item\n");
	            System.out.print("d.) Print out information for all the stationary Item\n");
	            System.out.print("e.) Exit program\n");
	            
	            choice = scan.next();
				//rent
				switch(choice){
					case "a":
						System.out.println("Search stationary Item for rent");
							search = sear.nextLine();
						System.out.println("Search Type for rent");
					        genre = sear.nextLine();
							String ret = rent.rentStationary(search, genre, stationary, customerinfo);
						System.out.println(ret);
					break;
						//Return
					case"b":
						//case 2: Returning a Stationary
						System.out.println("Search Stationary Item for return");
							search = sear.nextLine();
						System.out.println("Search Type for returning");
							genre = sear.nextLine();
							String retu = returns.returnStationary(search, genre, stationary, customerinfo);
						System.out.print(retu);
					break;
				
					//Purchase Hardware
					case "c":
						System.out.println("Search Stationary Item for purchase");
							search= sear.nextLine();
						System.out.println("Search Type for purchase");
							genre = sear.nextLine();
							String purchaseStationary = pur.purchaseStationary(search, genre, stationary, customerinfo, customerspent);
						System.out.println(purchaseStationary);
						
						break;
						//display
					case "d":
						print.PrintStationary(stationary);
						break;
						//Exit program
					case "e":
				System.exit(0);
				break;
				default:System.out.println("Please choose one");break;
			};break;
    		//Exit program
    		case "g":
   	            System.out.println("Options \n");
	            System.out.print("a.) Print Customer \n");
	            System.out.print("b.) Print Customer Spent \n");
	            
	            choice = scan.next();
    			switch(choice){
				case "a":print.PrintCustomer(customerinfo);break;
				case "b":print.PrintCustomerSpent(customerspent);break;
				}
    			break;
    		case "h":System.exit(0);break;
    		default:System.out.println("Please choose one");break;
    		}
    		

		}while(option != "e");
		
		
		scan.close();
		sear.close();

	}

}
