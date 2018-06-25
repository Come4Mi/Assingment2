package method;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;

import assignment2.Book;
import assignment2.CustomerInfo;
import assignment2.DVDs;
import assignment2.MusicCD;
import assignment2.Stationary;
import assignment2.Hardware;
import assignment2.Software;

public class rentMethods {
	Scanner scan = new Scanner(System.in);
	String renting;
	
	//customer
	String name;
	int age;
	int phoneNum;
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();
    String dateToday = formatter.format(date);
	
	//rent Method
	//rent Book
	public String rentMethod(String titleSearch, String typeSearch, ArrayList<Book> arraylist, ArrayList<CustomerInfo> customerinfo) throws ArithmeticException {
		//if (titleSearch == null) return "\n No Books Avaliable ";
		try{
		for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().contains(titleSearch)){
		        	if(arraylist.get(i).getType().contains(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	System.out.println(avai);
		        	if(avai.equalsIgnoreCase("in")){
		        		
						System.out.println("Book is Available, rent this Book? (Y/N)");
						renting = scan.next();
						if(renting.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Rent", arraylist.get(i).getTitle(), dateToday);
							customerinfo.add(cus);
							
		        		arraylist.get(i).setStatus("OUT");
		        		return "Book is Rented out";
						}else{}
		        	}else{
		        		return "Book is not available";
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
	
	//rent Method
	//rent DVD
	public String rentDVD(String titleSearch, String typeSearch, ArrayList<DVDs> arraylist, ArrayList<CustomerInfo> customerinfo) throws ArithmeticException {
		try{ 
		for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().contains(titleSearch)){
		        	if(arraylist.get(i).getGenre().contains(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	System.out.println(avai);
		        	if(avai.equalsIgnoreCase("in")){
		        		
						System.out.println("DVD is Available, rent this DVD? (Y/N)");
						renting = scan.next();
						if(renting.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Rent", arraylist.get(i).getTitle(), dateToday);
							customerinfo.add(cus);
							
		        		arraylist.get(i).setStatus("OUT");
		        		return "DVD is Rented out";
						}else{}
		        	}else{
		        		return "DVD is not available";
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
	
	//rent Method
	//rent MusicCD
	public String rentMusicCD(String titleSearch, String typeSearch, ArrayList<MusicCD> arraylist, ArrayList<CustomerInfo> customerinfo) throws ArithmeticException {
		try{ 
		for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().contains(titleSearch)){
		        	if(arraylist.get(i).getGenre().contains(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	System.out.println(avai);
		        	if(avai.equalsIgnoreCase("in")){
		        		
						System.out.println("MusicCD is Available, rent this MusicCD? (Y/N)");
						renting = scan.next();
						if(renting.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Rent", arraylist.get(i).getTitle(), dateToday);
							customerinfo.add(cus);
							
		        		arraylist.get(i).setStatus("OUT");
		        		return "MusicCD is Rented out";
						}else{}
		        	}else{
		        		return "MusicCD is not available";
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
	
	//rent 
	//rent Hardware
	public String rentHardware(String titleSearch, String typeSearch, ArrayList<Hardware> arraylist, ArrayList<CustomerInfo> customerinfo) throws ArithmeticException {
		try{
		for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().contains(titleSearch)){
		        	if(arraylist.get(i).getType().contains(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	System.out.println(avai);
		        	if(avai.equalsIgnoreCase("in")){
		        		
						System.out.println("Hardware is Available, rent this Hardware? (Y/N)");
						renting = scan.next();
						if(renting.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Rent", arraylist.get(i).getTitle(), dateToday);
							customerinfo.add(cus);
		        		
		        		arraylist.get(i).setStatus("OUT");
		        		return "Hardware is Rented out";
						}else{}
		        	}else{
		        		return "Hardware is not available";
		        	}
		        	}else{
		        		return "Item not Found\n";
		        	}
		        }
		        }
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
		 return "Hardware not Found\n";
	}
	
	//rent 
	//rent Stationary
	public String rentStationary(String titleSearch, String typeSearch, ArrayList<Stationary> arraylist, ArrayList<CustomerInfo> customerinfo) throws ArithmeticException {
		try{
		for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().contains(titleSearch)){
		        	if(arraylist.get(i).getType().contains(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	System.out.println(avai);
		        	if(avai.equalsIgnoreCase("in")){
		        		
						System.out.println("Stationary Item is Available, rent this Item? (Y/N)");
						renting = scan.next();
						if(renting.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Rent", arraylist.get(i).getTitle(), dateToday);
							customerinfo.add(cus);
		        		
		        		arraylist.get(i).setStatus("OUT");
		        		return "Stationary Item is Rented out";
						}else{}
		        	}else{
		        		return "Stationary Item is not available";
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
	
	//rent
	//rent Software
	public String rentSoftware(String titleSearch, String typeSearch, ArrayList<Software> arraylist, ArrayList<CustomerInfo> customerinfo) throws ArithmeticException {
		try{
		for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().contains(titleSearch)){
		        	if(arraylist.get(i).getType().contains(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	System.out.println(avai);
		        	if(avai.equalsIgnoreCase("in")){
		        		
						System.out.println("Software is Available, rent this Software? (Y/N)");
						renting = scan.next();
						if(renting.equalsIgnoreCase("y")){
							//customer
							System.out.println("Customer Name");
							name = scan.next();
							System.out.println("Customer Age");
							age = scan.nextInt();
							System.out.println("Customer Phone Number");
							phoneNum = scan.nextInt();
							
							CustomerInfo cus = new CustomerInfo(name, age, phoneNum, "Rent", arraylist.get(i).getTitle(), dateToday);
							customerinfo.add(cus);
		        		
		        		arraylist.get(i).setStatus("OUT");
		        		return "Software is Rented out";
						}else{}
		        	}else{
		        		return "Software is not available";
		        	}
		        	}else{
		        		return "Item not Found\n";
		        	}
		        }
		        }
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
		 return "Software not Found\n";
	}
}
