package assignment2;

public class CustomerSpent extends Customer {
	private double spent;
	private String date;
	
	public CustomerSpent(){
		spent = 0;
		date = "";
	}
	public CustomerSpent(String name, int age, int phoneNum, double spent, String buy){
		super(name, age, phoneNum, buy);
		this.spent = spent;
	}
	public CustomerSpent(String name, int age, int phoneNum, double spent, String buy, String date){
		super(name, age, phoneNum, buy);
		this.spent = spent;
		this.date = date; 
	}
	
	
	//set values
	public void setSpent(double spent){
		this.spent = spent;
	}

	public double getSpent(){
		return spent;
	}
	public void setDate(String date){
		this.date= date;
	}

	public String getDate(){
		return date;
	}
	
	//toString
	public String toString(){
        return "Name : " + getName() + " "
                + "Age : " + getAge() + " "
                + "Phone Number : " + getPhoneNum() + " " 
                + "spent : " + this.spent + " "
                + "Purchase : " + getBuy() + " ";
	}

}
