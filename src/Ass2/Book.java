package Ass2;

public class Book {
	private String title;
	private String author;
	private String status;
	private int publish;
	private String type;
	private double price;
	
	public Book(){
		title = "";
		author = "";
		status = "IN";
		publish = 0;
		type = "";
		price = 0;
	}
	public Book(String title, String author, String status, int publish, String type){
		this.title = title;
		this.author = author;
		this.status = status;
		this.publish = publish;
		this.type = type;
	}
	public Book(String title, String author, String status, int publish, String type, double price){
		this.title = title;
		this.author = author;
		this.status = status;
		this.publish = publish;
		this.type = type;
		this.price = price;
	}
	
	//set values
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public void setPublish(int publish){
		this.publish = publish;
	}
	public void setType(String type){
		this.type = type;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	//return values
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public String getStatus(){
		return status;
	}
	public int getPublish(){
		return publish;
	}
	public String getType(){
		return type;
	}
	public double getPrice(){
		return price;
	}
	
	//toString
    public String toString() {
        return "Title : " + this.title + " "
                + "Author : " + this.author + " "
                + "Published : " + this.publish + " " 
                + "Status : " + this.status
                + "Type : " + this.type + " "
                + "Price : " + this.price + "";
    }
	
}
