package Ass2;

+public class Hardware extends item{
	private String status;
	private double price;
	private String title;
	private String type;
	private String brand;
	private int yearMade;

	public Hardware() {
		status = "IN";
		price = 0;
	}
	public Hardware(String title, String type, String brand, int yearMade, String status) {
		super(title, yearMade);
		this.status = status;
	}
	public Hardware(String title, String type, String brand, int yearMade, String status, double price) {
		super(title, yearMade);
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
	
	public String getTitle(){
		return title;
	}
	
	public int getYearMade(){
		return yearMade;
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