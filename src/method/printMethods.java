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
	public void Print(ArrayList<Book> books){
		Iterator itr1=books.iterator();
		
		System.out.println("__________________________________________________________________________________________________________________________");
		System.out.println("Title  " + "\t\t\t\t\t\t\tAuthor  "+ "\t\tPublish  "+ " Status  " + "Type" + "\tPrice");
		System.out.println("__________________________________________________________________________________________________________________________");
		 while(itr1.hasNext()){  
			   Book str=(Book)itr1.next();  
			   
			   System.out.println(str.getTitle() + "\t\t\t"+ str.getAuthor() + "\t" +str.getPublish() + "\t" + str.getStatus() + "\t" + str.getType() + "\tRM" + str.getPrice());  
			   System.out.println("__________________________________________________________________________________________________________________________");
		}  
	}
	
	//print
	public void PrintDVD(ArrayList<DVDs> dvds){
		Iterator dvd=dvds.iterator();
		
		System.out.println("______________________________________________________________________________________________________________");
		System.out.println("Title  " + "\t\t\t\tLenth  "+ "\tDirector  "+ "\tYear Made  " + "\tStatus" + "\tGenre" + "\tPrice");
		System.out.println("______________________________________________________________________________________________________________");
		 while(dvd.hasNext()){  
			   DVDs str=(DVDs)dvd.next();  
			   
			   System.out.println(str.getTitle() + "\t\t\t"+ str.getLength() + "\t" +str.getDirector() + "\t\t" + str.getYearMade() + "\t" + str.getStatus() + "\t" + str.getGenre() + "\tRM" + str.getPrice());  
			   System.out.println("______________________________________________________________________________________________________________");
		}  
	}
	
	//print
	public void PrintHardware(ArrayList<Hardware> hardware){
		Iterator Hardware=hardware.iterator();
		
		System.out.println("______________________________________________________________________________________________________________");
		System.out.println("Title  " + "\t\t\t\tType  "+ "\tBrand  "+ "\tYear Made  " + "\tStatus" + "\tPrice");
		System.out.println("______________________________________________________________________________________________________________");
		 while(Hardware.hasNext()){  
			   Hardware str=(Hardware)Hardware.next();  
			   
			   System.out.println(str.getTitle() + "\t\t\t"+ str.getType() + "\t" +str.getBrand() + "\t\t" + str.getYearMade() + "\t" + str.getStatus() + "\t" +  "\tRM" + str.getPrice());  
			   System.out.println("______________________________________________________________________________________________________________");
		}  
	}
	
	//print
	public void PrintSoftware(ArrayList<Software> software){
		Iterator Software=software.iterator();
		
		System.out.println("______________________________________________________________________________________________________________");
		System.out.println("Title  " + "\t\t\t\tType "+ "\tCompany  "+ "\tYear Made  " + "\tStatus" + "\tPrice");
		System.out.println("______________________________________________________________________________________________________________");
		 while(Software.hasNext()){  
			   Software str=(Software)Software.next();  
			   
			   System.out.println(str.getTitle() + "\t\t\t"+ str.getType() + "\t" +str.getCompany() + "\t\t" + str.getYearMade() + "\t" + str.getStatus() + "\t" +  "\tRM" + str.getPrice());  
			   System.out.println("______________________________________________________________________________________________________________");
		}  
	}
	
	//................................................................................................................................

	//print Customer
	public void PrintCustomer(ArrayList<CustomerInfo> customerinfo){
		Iterator cus =customerinfo.iterator();
		
		System.out.println("______________________________________________________________________________________________________________");
		System.out.println("Name  " + "\t\t\tAge  "+ "\tPhone Number  "+ "\tInfo  " + "\tItem");
		System.out.println("______________________________________________________________________________________________________________");
		 while(cus.hasNext()){
			   CustomerInfo str=(CustomerInfo)cus.next();  
			   
			   System.out.println(str.getName() + "\t\t\t"+ str.getAge() + "\t" +str.getPhoneNum() + "\t\t" + str.getBuy() + "\t" + str.getInfo() + "\t"); 
		 }
		 
			System.out.println("______________________________________________________________________________________________________________");

	}
	
	//print Customer
	public void PrintCustomerSpent(ArrayList<CustomerSpent> customerspent){
		Iterator cus =customerspent.iterator();
		double sum = 0;
		
		System.out.println("______________________________________________________________________________________________________________");
		System.out.println("Name  " + "\t\t\tAge  "+ "\tPhone Number  "+ "\tSpent  " + "\tItem");
		System.out.println("______________________________________________________________________________________________________________");
		 while(cus.hasNext()){
			   CustomerSpent str=(CustomerSpent)cus.next();  
			   
			   System.out.println(str.getName() + "\t\t\t"+ str.getAge() + "\t" +str.getPhoneNum() + "\t\tRM" + str.getSpent() + "\t" + str.getBuy() + "\t"); 
		 }
		 
			//total earn
			System.out.println("______________________________________________________________________________________________________________");
			System.out.println("\t\t\t\t\t\t\t\t\t\t\tTotal Amount");
			System.out.println("______________________________________________________________________________________________________________"); 
			for(int i = 0; i < customerspent.size(); i++){
				sum += customerspent.get(i).getSpent();
			}
			System.out.println("\t\t\t\t\t\t\t\t\t\t\tRM"+sum);
	}

}
