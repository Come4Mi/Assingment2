package method;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;

import assignment2.Book;
import assignment2.CustomerInfo;
import assignment2.CustomerSpent;
import assignment2.DVDs;
import assignment2.Hardware;
import assignment2.Software;

public class purchaseMethods {
	Scanner scan = new Scanner(System.in);
	String purchase;
	
	//customer
	String name;
	int age;
	int phoneNum;
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();
    String dateToday = formatter.format(date); 
	
	//Purchase Method
	//Purchase Book
	public String purchaseMethod(String titleSearch, String typeSearch, ArrayList<Book> arraylist, ArrayList<CustomerInfo> customerinfo, ArrayList<CustomerSpent> customerspent) throws ArithmeticException {
		//if (titleSearch == null) return "\n No Books Avaliable ";
		try{ 
		for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
		        	String msg = arraylist.get(i).getStatus() ;
					if(msg.equalsIgnoreCase("out") || msg.equalsIgnoreCase("purchased")){
						return "Not Available";
					}else{
						System.out.println("Book is Available, purchase this Book? (Y/N)");
						purchase = scan.next();
						if(purchase.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerSpent cus = new CustomerSpent(name, age, phoneNum, arraylist.get(i).getPrice(), arraylist.get(i).getTitle(), dateToday);
							customerspent.add(cus);
							
							CustomerInfo info = new CustomerInfo(name, age, phoneNum, "Purchase", arraylist.get(i).getTitle(), dateToday);
							customerinfo.add(info);
							
						arraylist.get(i).setStatus("Purchased");
						return "Book is Purchased";
						}else{}
					}
		        	/*
		        	return msg;
		        	*/
		        	}else{
		        		return "Type not Found\n";
		        	}
		        }
		        }
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
		 return "No Book Avaliable\n";
	}
	
	//Purchase Method
	//Purchase DVD
	public String purchaseDVD(String titleSearch, String typeSearch, ArrayList<DVDs> arraylist, ArrayList<CustomerInfo> customerinfo, ArrayList<CustomerSpent> customerspent) throws ArithmeticException {
		try{ 
		for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getGenre().equalsIgnoreCase(typeSearch)) {
		        	String msg = arraylist.get(i).getStatus() ;
					if(msg.equalsIgnoreCase("out") || msg.equalsIgnoreCase("purchased")){
						return "Not Available";
					}else{
						System.out.println("DVD is Available, purchase this DVD? (Y/N)");
						purchase = scan.next();
						if(purchase.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerSpent cus = new CustomerSpent(name, age, phoneNum, arraylist.get(i).getPrice(), arraylist.get(i).getTitle(), dateToday);
							customerspent.add(cus);
							
							CustomerInfo info = new CustomerInfo(name, age, phoneNum, "Purchase", arraylist.get(i).getTitle(), dateToday);
							customerinfo.add(info);
							
						arraylist.get(i).setStatus("Purchased");
						return "DVD is Purchased";
						}else{}
					}
		        	}else{
		        		return "Genre not Found\n";
		        	}
		        }
		        }
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
		 return "No DVD Avaliable\n";
	}
	
	//Purchase Method
	//purchase Hardware
	public String purchaseHardware(String titleSearch, String typeSearch, ArrayList<Hardware> arraylist, ArrayList<CustomerInfo> customerinfo, ArrayList<CustomerSpent> customerspent) throws ArithmeticException {
		try{ 
		for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
		        	String msg = arraylist.get(i).getStatus() ;
					if(msg.equalsIgnoreCase("out") || msg.equalsIgnoreCase("purchased")){
						return "Not Available";
					}else{
						System.out.println("Hardware is Available, purchase this Hardware? (Y/N)");
						purchase = scan.next();
						if(purchase.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerSpent cus = new CustomerSpent(name, age, phoneNum, arraylist.get(i).getPrice(), arraylist.get(i).getTitle(), dateToday);
							customerspent.add(cus);
							
							CustomerInfo info = new CustomerInfo(name, age, phoneNum, "Purchase", arraylist.get(i).getTitle(), dateToday);
							customerinfo.add(info);
							
						arraylist.get(i).setStatus("Purchased");
						return "Hardware is Purchased";
						}else{}
					}
		        	}else{
		        		return "Hardware not Found\n";
		        	}
		        }
		        }
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
		 return "No Hardware Avaliable\n";
	}
	
	//Purchase Method
	//purchase Software
	public String purchaseSoftware(String titleSearch, String typeSearch, ArrayList<Software> arraylist, ArrayList<CustomerInfo> customerinfo, ArrayList<CustomerSpent> customerspent) throws ArithmeticException {
		try{ 
		for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
		        	String msg = arraylist.get(i).getStatus() ;
					if(msg.equalsIgnoreCase("out") || msg.equalsIgnoreCase("purchased")){
						return "Not Available";
					}else{
						System.out.println("Software is Available, purchase this Software? (Y/N)");
						purchase = scan.next();
						if(purchase.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerSpent cus = new CustomerSpent(name, age, phoneNum, arraylist.get(i).getPrice(), arraylist.get(i).getTitle(), dateToday);
							customerspent.add(cus);
							
							CustomerInfo info = new CustomerInfo(name, age, phoneNum, "Purchase", arraylist.get(i).getTitle(), dateToday);
							customerinfo.add(info);
							
						arraylist.get(i).setStatus("Purchased");
						return "Software is Purchased";
						}else{}
					}
		        	}else{
		        		return "Software not Found\n";
		        	}
		        }
		        }
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
		 return "No Software Avaliable\n";
	}

}
