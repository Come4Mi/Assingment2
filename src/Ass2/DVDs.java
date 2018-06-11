package Ass2;

public class DVDs extends item{
	private String status;
	private double price;

	public DVDs() {
		status = "IN";
		price = 0;
	}
	public DVDs(String title, double length, String director, String genre, int yearMade, String status) {
		super(title, length, director, genre, yearMade);
		this.status = status;
	}
	public DVDs(String title, double length, String director, String genre, int yearMade, String status, double price) {
		super(title, length, director, genre, yearMade);
		this.status = status;
		this.price = price;
	}
	//set and get
	public void setStatus(String status){
		this.status = status;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getStatus(){
		return status;
	}
	public double getPrice(){
		return price;
	}
	
	//toString
    public String toString() {
        return "Title : " + getTitle() + " "
                + "Length : " + getLength() + " "
                + "director : " + getDirector() + " " 
                + "Genre : " + getGenre() + " "
                + "Year Made : " + getYearMade() + " "
                + "Status : " + getStatus() + " "
                + "Price : " + getPrice() + "";
    }
	
}
