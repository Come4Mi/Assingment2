package assignment2;

import interfaces.DVD18;
import interfaces.DVDR;
import interfaces.DVDRAM;
public class MusicCD extends item implements DVD18, DVDR, DVDRAM{
	private String status;
	private double price;
	private int sides;
	private int layers;
	private int diameter;
	private double capacity;
	
	public MusicCD() {
		status = "IN";
		price = 0;
	}
	public void DVD18(){
		sides = 2;
		layers = 4;
		diameter = 12;
		capacity = 15.90;
	}
	public void DVDR(){
		sides = 1;
		layers = 2;
		diameter = 12;
		capacity = 7.96;
	}
	public void DVDRAM(){
		sides = 2;
		layers = 1;
		diameter = 12;
		capacity = 8.75;
	}
	
	public MusicCD(String title, double length, String director, String genre, int yearMade, String status) {
		super(title, length, director, genre, yearMade);
		this.status = status;
	}
	public MusicCD(String title, double length, String director, String genre, int yearMade, String status, double price) {
		super(title, length, director, genre, yearMade);
		this.status = status;
		this.price = price;
	}
	//set and get
	public void setDirector(String director){
		super.setDirector(director);
	}
	public void setStatus(String status){
		this.status = status;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public String getDirector(){
		return super.getDirector();
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
