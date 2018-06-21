package assignment2;
import interfaces.CommonItem;
public class item implements CommonItem{
	private String title;
	private double length;
	private String director;
	private String genre;
	private int yearMade;

	public item() {
		title = "";
		length = 0;
		director = "";
		genre = "";
		yearMade = 0;
	}
	public item(String title, double length, String director, String genre, int yearMade) {
		this.title = title;
		this.length = length;
		this.director = director; 
		this.genre = genre;
		this.yearMade = yearMade;
	}
	
	public item(String title, int yearMade) {
		this.yearMade = yearMade;
		this.title = title;
	}
	
	
	//set and get
	public void setTitle(String title){
		this.title = title;
	}
	public void setLength(double length){
		this.length = length;
	}
	public void setDirector(String director){
		this.director = director;
	}
	public void setGenre(String genre){
		this.genre = genre;
	}
	public void setYearMade(int yearMade){
		this.yearMade = yearMade;
	}
	
	public String getTitle(){
		return title;
	}
	public double getLength(){
		return length;
	}
	public String getDirector(){
		return director;
	}
	public String getGenre(){
		return genre;
	}
	public int getYearMade(){
		return yearMade;
	}
	
	//toString
    public String toString() {
        return "Title : " + this.title + " "
                + "Length : " + this.length + " "
                + "director : " + this.director + " " 
                + "Genre : " + this.genre + " "
                + "Year Made : " + this.yearMade + " ";
	
}
}
