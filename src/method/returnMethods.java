package method;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;

import assignment2.Book;
import assignment2.DVDs;
import assignment2.MusicCD;
import assignment2.Stationary;
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
	public String returnMethod(String titleSearch, String typeSearch, ArrayList<Book> arraylist, ArrayList<CustomerInfo> customerinfo) throws ArithmeticException {
		//if (titleSearch == null) return "\n No Books Avaliable ";
		try{
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();
		    String dateToday = formatter.format(date);
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
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Return", arraylist.get(i).getTitle(), dateToday);
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
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
		 return "Book not Found\n";
	}
	
	//return Method
	//return DVD
	public String returnDVD(String titleSearch, String typeSearch, ArrayList<DVDs> arraylist, ArrayList<CustomerInfo> customerinfo) throws ArithmeticException {
		try{ 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();
		    String dateToday = formatter.format(date);
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
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Return", arraylist.get(i).getTitle(), dateToday);
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
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
		 return "DVD not Found\n";
	}
	
	//return Method
	//return MusicCD
	public String returnMusicCD(String titleSearch, String typeSearch, ArrayList<MusicCD> arraylist, ArrayList<CustomerInfo> customerinfo) throws ArithmeticException {
		try{ 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();
		    String dateToday = formatter.format(date);
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
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Return", arraylist.get(i).getTitle(), dateToday);
							customerinfo.add(cus);
		        		
		        		arraylist.get(i).setStatus("IN");
		        		return "MusicCD is returned\n";
						}else{}
		        	}else{
		        		return "MusicCD Status is IN currently\n";
		        	}
		        	}else{
		        		return "Genre not Found\n";
		        	}
		        }
		        }
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
		 return "MusicCD not Found\n";
	}
	
	//return Method
	//return Hardware
	public String returnHardware(String titleSearch, String typeSearch, ArrayList<Hardware> arraylist, ArrayList<CustomerInfo> customerinfo) throws ArithmeticException {
		try{
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();
		    String dateToday = formatter.format(date);
		for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	if(avai.equalsIgnoreCase("out")){
		        		
						System.out.println("Return this Hardware? (Y/N)");
						returning = scan.next();
						if(returning.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Return", arraylist.get(i).getTitle(), dateToday);
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
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
		 return "Hardware not Found\n";
	}
	
	//return Method
	//return Stationary
	public String returnStationary(String titleSearch, String typeSearch, ArrayList<Stationary> arraylist, ArrayList<CustomerInfo> customerinfo) throws ArithmeticException {
		try{
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();
		    String dateToday = formatter.format(date);
		for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	if(avai.equalsIgnoreCase("out")){
		        		
						System.out.println("Return this Stationary Item? (Y/N)");
						returning = scan.next();
						if(returning.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Return", arraylist.get(i).getTitle(), dateToday);
							customerinfo.add(cus);
		        		
		        		arraylist.get(i).setStatus("IN");
		        		return "Stationary Item is returned\n";
						}else{}
		        	}else{
		        		return "Stationary Item Status is IN currently\n";
		        	}
		        	}else{
		        		return "Item not Found\n";
		        	}
		        }
		        }
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
		 return "Item not Found\n";
	}
	
	//return Method
	//return Software
	public String returnSoftware(String titleSearch, String typeSearch, ArrayList<Software> arraylist, ArrayList<CustomerInfo> customerinfo) throws ArithmeticException {
		try{ 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();
		    String dateToday = formatter.format(date);
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
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Return", arraylist.get(i).getTitle(), dateToday);
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
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
		 return "Software not Found\n";
	}

}
