package Ass2;

public class Hardware extends item{
	private String status;
	private double price;
	private String type;
	private String brand;

	public Hardware() {
		status = "IN";
		price = 0.00;
		brand = null;
		type = null ;
		}
	
	public Hardware(String title, String type, String brand, int yearMade, String status) {
		super(title, yearMade);
		this.status = status;
		this.brand = brand;
		this.type=type;
	}
	public Hardware(String title, String type, String brand, int yearMade, String status, double price) {
		super(title, yearMade);
		this.status = status;
		this.price = price;
		this.brand = brand;
		this.type=type;
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
	
	
	public String getType(){
		return type;
	}
	
	public String getBrand(){
		return brand;
	}
	
	//toString
    public String toString() {
        return "Title : " + getTitle() + " "
        		    + "Type : " + getType() + " "
        		    + "Brand : " + getBrand() + " "
                + "Year Made : " + getYearMade() + " "
                	+ "Status : " + getStatus() + " "
                + "Price : " + getPrice() + "";
                
    }

	
}