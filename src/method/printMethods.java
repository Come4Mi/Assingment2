package method;

import java.util.ArrayList;
import java.util.Iterator;

import assignment2.Book;
import assignment2.CustomerInfo;
import assignment2.CustomerSpent;
import assignment2.DVDs;
import assignment2.Hardware;
import assignment2.Software;

public class printMethods {
	int counter=0;
	public void Print(ArrayList<Book> books) throws ArithmeticException{
		try{
		Iterator itr1=books.iterator();
		counter=0;
		String formatTitle = "%25s%32s%20s%12s%8s%15s%n";
		String formatList = "%-40s%-20s%-20s%-10s%-10s%-10s%n";
		 while(itr1.hasNext()){  
			   Book str=(Book)itr1.next();  
			   if (counter==0){
				   System.out.printf(formatTitle, "Book Title", "Author name", "Publish Date", "Status", "Type", "Price(RM)");
				   System.out.println("-----------------------------------------------------------------------------------------------------------------");
			   }
			   System.out.printf(formatList, "| "+str.getTitle(), " | "+str.getAuthor(), " | "+str.getPublish(), " | "+str.getStatus(), " | "+str.getType(), " | "+str.getPrice()+"     |");  
			   System.out.println("-----------------------------------------------------------------------------------------------------------------");
			   counter++;
		}  
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
	}
	
	//print
	public void PrintDVD(ArrayList<DVDs> dvds) throws ArithmeticException{
		try{
		Iterator dvd=dvds.iterator();
		counter=0;
		String formatTitle = "%10s%14s%12s%12s%8s%10s%15s%n";
		String formatList = "%-15s%-10s%-12s%-10s%-10s%-12s%-11s%s%n";
		 while(dvd.hasNext()){  
			   DVDs str=(DVDs)dvd.next();  
			   if (counter==0){
				   System.out.printf(formatTitle, "Title", "Length", "Director", "Year Made", "Status", "Genre", "Price(RM)");
				   System.out.println("----------------------------------------------------------------------------------");
				   }
			   System.out.printf(formatList, "| "+str.getTitle(), " | "+str.getLength(), " | "+str.getDirector(), " | "+str.getYearMade(), " | "+str.getStatus(), " | "+str.getGenre(), " | "+str.getPrice(), " |");
			   System.out.println("----------------------------------------------------------------------------------");
			   counter++;
		}  
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
	}
	
	//print
	public void PrintHardware(ArrayList<Hardware> hardware) throws ArithmeticException{
		try{
		Iterator Hardware=hardware.iterator();
		counter=0;
		String formatTitle = "%8s%14s%12s%15s%9s%12s%n";
		String formatList = "%-15s%-10s%-12s%-12s%-10s%-10s%s%n";
		 while(Hardware.hasNext()){  
			   Hardware str=(Hardware)Hardware.next();  
			   if (counter==0){
				   System.out.printf(formatTitle, "Title", "Type", "Brand", "Year Made", "Status", "Price(RM)");
				   System.out.println("----------------------------------------------------------------------");
				   }
			   System.out.printf(formatList, "| "+str.getTitle(), " | "+str.getType(), " | "+str.getBrand(), " | "+str.getYearMade(), " | "+str.getStatus(), " | "+str.getPrice(), " |");  
			   System.out.println("----------------------------------------------------------------------");
			   counter++;
		}  
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
	}
	
	//print
	public void PrintSoftware(ArrayList<Software> software) throws ArithmeticException{
		try{
		Iterator Software=software.iterator();
		counter=0;
		String formatTitle = "%15s%22s%17s%13s%9s%12s%n";
		String formatList = "%-25s%-18s%-12s%-12s%-10s%-10s%s%n";
		 while(Software.hasNext()){  
			   Software str=(Software)Software.next();  
			   if (counter==0){
				   System.out.printf(formatTitle, "Title", "Type", "Company", "Year Made", "Status", "Price(RM)");
				   System.out.println("-----------------------------------------------------------------------------------------");
				   }
			   System.out.printf(formatList, "| "+str.getTitle(), " | "+str.getType(), " | "+str.getCompany(), " | "+str.getYearMade(), " | "+str.getStatus(), " | "+str.getPrice(), " |");  
			   System.out.println("-----------------------------------------------------------------------------------------");
			   counter++;
		}  
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
	}
	
	//................................................................................................................................

	//print Customer
	public void PrintCustomer(ArrayList<CustomerInfo> customerinfo) throws ArithmeticException{
		try{
		Iterator cus =customerinfo.iterator();
		counter=0;
		String formatTitle = "%12s%10s%18s%12s%16s%25s%n";
		String formatList = "%-15s%-10s%-18s%-12s%-15s%-30s%s%n";
		 while(cus.hasNext()){
			   CustomerInfo str=(CustomerInfo)cus.next();  
			   if (counter==0){
				   System.out.printf(formatTitle, "Name", "Age", "Phone Number", "Info", "Date", "Item");
				   System.out.println("-------------------------------------------------------------------------------------------------------------");
				   }
			   System.out.printf(formatList, "| "+str.getName(), " | "+str.getAge(), " | "+str.getPhoneNum(), " | "+str.getBuy(), " | "+str.getDate(), " | "+str.getInfo(), " |"); 
			   System.out.println("-------------------------------------------------------------------------------------------------------------");
			   counter++;
		 	}
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
	}
	
	//print Customer
	public void PrintCustomerSpent(ArrayList<CustomerSpent> customerspent) throws ArithmeticException{
		try{
		Iterator cus =customerspent.iterator();
		double sum = 0;
		counter=0;
		String formatTitle = "%12s%10s%18s%15s%14s%25s%n";
		String formatList = "%-15s%-10s%-18s%-12s%-15s%-30s%s%n";
		 while(cus.hasNext()){
			   CustomerSpent str=(CustomerSpent)cus.next();  
			   if (counter==0){
				   System.out.printf(formatTitle, "Name", "Age", "Phone Number", "Spent(RM)", "Date", "Item");
				   System.out.println("-------------------------------------------------------------------------------------------------------------");
				   }
			   System.out.printf(formatList, "| "+str.getName(), " | "+str.getAge(), " | "+str.getPhoneNum(), " | "+str.getSpent(), " | "+str.getDate(), " | "+str.getBuy(), " |"); 
			   System.out.println("-------------------------------------------------------------------------------------------------------------");
			   counter++;
		 }
			//total earn
			System.out.println("\t\t\t\t\t\t\t\t\t\t\tTotal Amount");
			System.out.println("-------------------------------------------------------------------------------------------------------------"); 
			for(int i = 0; i < customerspent.size(); i++){
				sum += customerspent.get(i).getSpent();
			}
			System.out.println("\t\t\t\t\t\t\t\t\t\t\tRM "+sum);
		}catch(ArithmeticException e){
			e.getLocalizedMessage();
		}
	}

}
