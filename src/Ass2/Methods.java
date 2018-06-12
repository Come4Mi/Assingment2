package Ass2;

import java.util.ArrayList;
import java.util.Iterator;

public class Methods {
	//return Method
	//return Book's Status
	public String rentMethod(String titleSearch, String typeSearch, ArrayList<Book> arraylist) {
		//if (titleSearch == null) return "\n No Books Avaliable ";
		 for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().contains(titleSearch)){
		        	if(arraylist.get(i).getType().contains(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	System.out.println(avai);
		        	if(avai.equalsIgnoreCase("in")){
		        		arraylist.get(i).setStatus("OUT");
		        		return "Book is Rented out";
		        	}else{
		        		return "Book is not available";
		        	}
		        	}else{
		        		return "Type not Found\n";
		        	}
		        }
		        }
		 return "Book not Found\n";
	}
	
	//return Method
	//return Book's Status
	public String returnMethod(String titleSearch, String typeSearch, ArrayList<Book> arraylist) {
		//if (titleSearch == null) return "\n No Books Avaliable ";
		 for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	if(avai.equalsIgnoreCase("out")){
		        		arraylist.get(i).setStatus("IN");
		        		return "Book is returned\n";
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
	
	//Purchase Method
	//return Book's Status
	public String purchaseMethod(String titleSearch, String typeSearch, ArrayList<Book> arraylist) {
		//if (titleSearch == null) return "\n No Books Avaliable ";
		 for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
		        	String msg = arraylist.get(i).getStatus() ;
		        	return msg;
		        	}else{
		        		return "Type not Found\n";
		        	}
		        }
		        }
		 return "No Book Avaliable\n";
	}
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
//...............................................................................................................................
	//return Method
	//return Book's Status
	public String rentDVD(String titleSearch, String typeSearch, ArrayList<DVDs> arraylist) {
		 for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().contains(titleSearch)){
		        	if(arraylist.get(i).getGenre().contains(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	System.out.println(avai);
		        	if(avai.equalsIgnoreCase("in")){
		        		arraylist.get(i).setStatus("OUT");
		        		return "DVD is Rented out";
		        	}else{
		        		return "DVD is not available";
		        	}
		        	}else{
		        		return "Genre not Found\n";
		        	}
		        }
		        }
		 return "DVD not Found\n";
	}
	
	//return Method
	//return DVD's Status
	public String returnDVD(String titleSearch, String typeSearch, ArrayList<DVDs> arraylist) {
		 for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getGenre().equalsIgnoreCase(typeSearch)) {
		        	String avai = arraylist.get(i).getStatus();
		        	if(avai.equalsIgnoreCase("out")){
		        		arraylist.get(i).setStatus("IN");
		        		return "DVD is returned\n";
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
	
	//Purchase Method
	//return Book's Status
	public String purchaseDVD(String titleSearch, String typeSearch, ArrayList<DVDs> arraylist) {
		 for(int i = 0; i < arraylist.size(); i++){
		        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
		        	if(arraylist.get(i).getGenre().equalsIgnoreCase(typeSearch)) {
		        	String msg = arraylist.get(i).getStatus() ;
		        	return msg;
		        	}else{
		        		return "Genre not Found\n";
		        	}
		        }
		        }
		 return "No DVD Avaliable\n";
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
	//----------------------------------------------------------------------------------------------------
		
	
	//rent Hardware Status
		public String rentHardware(String titleSearch, String typeSearch, ArrayList<Hardware> arraylist) {
			 for(int i = 0; i < arraylist.size(); i++){
			        if(arraylist.get(i).getTitle().contains(titleSearch)){
			        	if(arraylist.get(i).getType().contains(typeSearch)) {
			        	String avai = arraylist.get(i).getStatus();
			        	System.out.println(avai);
			        	if(avai.equalsIgnoreCase("in")){
			        		arraylist.get(i).setStatus("OUT");
			        		return "Hardware is Rented out";
			        	}else{
			        		return "Hardware is not available";
			        	}
			        	}else{
			        		return "Item not Found\n";
			        	}
			        }
			        }
			 return "Hardware not Found\n";
		}
		
		//return Method
		//return Hardware Status
		public String returnHardware(String titleSearch, String typeSearch, ArrayList<Hardware> arraylist) {
			 for(int i = 0; i < arraylist.size(); i++){
			        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
			        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
			        	String avai = arraylist.get(i).getStatus();
			        	if(avai.equalsIgnoreCase("out")){
			        		arraylist.get(i).setStatus("IN");
			        		return "Hardware is returned\n";
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
		
		//Purchase Method
		//purchase Hardware Status
		public String purchaseHardware(String titleSearch, String typeSearch, ArrayList<Hardware> arraylist) {
			 for(int i = 0; i < arraylist.size(); i++){
			        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
			        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
			        	String msg = arraylist.get(i).getStatus() ;
			        	return msg;
			        	}else{
			        		return "Hardware not Found\n";
			        	}
			        }
			        }
			 return "No DVD Avaliable\n";
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
	
	
	
	
	

	//-----------------------------------------------------------------------------------------------------

		//rent Software Status
				public String rentSoftware(String titleSearch, String typeSearch, ArrayList<Software> arraylist) {
					 for(int i = 0; i < arraylist.size(); i++){
					        if(arraylist.get(i).getTitle().contains(titleSearch)){
					        	if(arraylist.get(i).getType().contains(typeSearch)) {
					        	String avai = arraylist.get(i).getStatus();
					        	System.out.println(avai);
					        	if(avai.equalsIgnoreCase("in")){
					        		arraylist.get(i).setStatus("OUT");
					        		return "Software is Rented out";
					        	}else{
					        		return "Software is not available";
					        	}
					        	}else{
					        		return "Item not Found\n";
					        	}
					        }
					        }
					 return "Software not Found\n";
				}
				
				//return Method
				//return Software Status
				public String returnSoftware(String titleSearch, String typeSearch, ArrayList<Software> arraylist) {
					 for(int i = 0; i < arraylist.size(); i++){
					        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
					        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
					        	String avai = arraylist.get(i).getStatus();
					        	if(avai.equalsIgnoreCase("out")){
					        		arraylist.get(i).setStatus("IN");
					        		return "Software is returned\n";
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
				
				//Purchase Method
				//purchase Software Status
				public String purchaseSoftware(String titleSearch, String typeSearch, ArrayList<Software> arraylist) {
					 for(int i = 0; i < arraylist.size(); i++){
					        if(arraylist.get(i).getTitle().equalsIgnoreCase(titleSearch)){
					        	if(arraylist.get(i).getType().equalsIgnoreCase(typeSearch)) {
					        	String msg = arraylist.get(i).getStatus() ;
					        	return msg;
					        	}else{
					        		return "Software not Found\n";
					        	}
					        }
					        }
					 return "No Software Avaliable\n";
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
			
		
		
		
	//------------------------------------------------------------------------------------------------------	
	//print Customer
	public void PrintCustomer(ArrayList<Customer> customer){
		Iterator cus =customer.iterator();
		double sum = 0;
		
		System.out.println("______________________________________________________________________________________________________________");
		System.out.println("Name  " + "\t\t\tAge  "+ "\tPhone Number  "+ "\tSpent  " + "\tItem");
		System.out.println("______________________________________________________________________________________________________________");
		 while(cus.hasNext()){
			   Customer str=(Customer)cus.next();  
			   
			   System.out.println(str.getName() + "\t\t\t"+ str.getAge() + "\t" +str.getPhoneNum() + "\t\tRM" + str.getSpent() + "\t" + str.getBuy() + "\t"); 
		 }
		 
			//total earn
			System.out.println("______________________________________________________________________________________________________________");
			System.out.println("\t\t\t\t\t\t\t\t\t\t\tTotal Amount");
			System.out.println("______________________________________________________________________________________________________________"); 
			for(int i = 0; i < customer.size(); i++){
				sum += customer.get(i).getSpent();
			}
			System.out.println("\t\t\t\t\t\t\t\t\t\t\tRM"+sum);
	}
//...............................................................................................................................
}
