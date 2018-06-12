package Ass2;

public class Software extends item{

	private String status;
	private double price;
	private String type;
	private String company;
	
	

	//String company to declare which company created the software
	
	
	public Software() {
		status = "IN";
		price = 0.00;
		company = null;
		type = null ;
		}
	
	public Software(String title, String type, String company, int yearMade, String status) {
		super(title, yearMade);
		this.status = status;
		this.company = company;
		this.type = type;
	}
	public Software(String title, String type, String company, int yearMade, String status, double price) {
		super(title, yearMade);
		this.status = status;
		this.price = price;
		this.company = company;
		this.type = type;
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
	
	public String getCompany(){
		return company;
	}
	
	//toString
    public String toString() {
        return "Title : " + getTitle() + " "
        		    + "Type : " + getType() + " "
        		    + "Brand : " + getCompany() + " "
                + "Year Made : " + getYearMade() + " "
                	+ "Status : " + getStatus() + " "
                + "Price : " + getPrice() + "";
                
    }

}
