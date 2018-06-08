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
		
		System.out.println("______________________________________________________________________________________________________________");
		System.out.println("Title  " + "\t\t\t\tAuthor  "+ "\tPublish  "+ "\tStatus  " + "\tType" + "\tPrice");
		System.out.println("______________________________________________________________________________________________________________");
		 while(itr1.hasNext()){  
			   Book str=(Book)itr1.next();  
			   
			   System.out.println(str.getTitle() + "\t\t\t"+ str.getAuthor() + "\t" +str.getPublish() + "\t" + str.getStatus() + "\t" + str.getType() + "\tRM" + str.getPrice());  
			   System.out.println("______________________________________________________________________________________________________________");
		}  
	}
}
