package method;

import java.util.ArrayList;
import java.util.Scanner;

import assignment2.Book;
import assignment2.DVDs;
import assignment2.CustomerInfo;
import assignment2.Hardware;
import assignment2.Software;

public class returnMethods {
	Scanner scan = new Scanner(System.in);
	String returning;
	
	//customer
	String name;
	int age;
	int phoneNum;
	
	//return Method
	//return Book
	public String returnMethod(String titleSearch, String typeSearch, ArrayList<Book> arraylist, ArrayList<CustomerInfo> customerinfo) {
		//if (titleSearch == null) return "\n No Books Avaliable ";
		 for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	if(avai.equalsIgnoreCase("out")){
		        		
						System.out.println("Return this Book? (Y/N)");
						returning = scan.next();
						if(returning.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Return", arraylist.get(i).getTitle());
							customerinfo.add(cus);
		        		
		        		arraylist.get(i).setStatus("IN");
		        		return "Book is returned\n";
						}else{}
		        	}else{
		        		return "Book Status is IN currently\n";
		        	}
		        	}else{
		        		return "Type not Found\n";
		        	}
		        }
		        }
		 return "Book not Found\n";
	}
	
	//return Method
	//return DVD
	public String returnDVD(String titleSearch, String typeSearch, ArrayList<DVDs> arraylist, ArrayList<CustomerInfo> customerinfo) {
		 for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getGenre().equalsIgnoreCase(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	if(avai.equalsIgnoreCase("out")){
		        		
						System.out.println("Return this Book? (Y/N)");
						returning = scan.next();
						if(returning.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Return", arraylist.get(i).getTitle());
							customerinfo.add(cus);
		        		
		        		arraylist.get(i).setStatus("IN");
		        		return "DVD is returned\n";
						}else{}
		        	}else{
		        		return "DVD Status is IN currently\n";
		        	}
		        	}else{
		        		return "Genre not Found\n";
		        	}
		        }
		        }
		 return "DVD not Found\n";
	}
	
	//return Method
	//return Hardware
	public String returnHardware(String titleSearch, String typeSearch, ArrayList<Hardware> arraylist, ArrayList<CustomerInfo> customerinfo) {
		 for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	if(avai.equalsIgnoreCase("out")){
		        		
						System.out.println("Return this Book? (Y/N)");
						returning = scan.next();
						if(returning.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Return", arraylist.get(i).getTitle());
							customerinfo.add(cus);
		        		
		        		arraylist.get(i).setStatus("IN");
		        		return "Hardware is returned\n";
						}else{}
		        	}else{
		        		return "Hardware Status is IN currently\n";
		        	}
		        	}else{
		        		return "Hardware not Found\n";
		        	}
		        }
		        }
		 return "Hardware not Found\n";
	}
	
	//return Method
	//return Software
	public String returnSoftware(String titleSearch, String typeSearch, ArrayList<Software> arraylist, ArrayList<CustomerInfo> customerinfo) {
		 for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	if(avai.equalsIgnoreCase("out")){
		        		
						System.out.println("Return this Book? (Y/N)");
						returning = scan.next();
						if(returning.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Return", arraylist.get(i).getTitle());
							customerinfo.add(cus);
		        		
		        		arraylist.get(i).setStatus("IN");
		        		return "Software is returned\n";
						}else{}
		        	}else{
		        		return "Software Status is IN currently\n";
		        	}
		        	}else{
		        		return "Software not Found\n";
		        	}
		        }
		        }
		 return "Software not Found\n";
	}

}
