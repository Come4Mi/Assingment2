package assignment2;

public class CustomerSpent extends Customer {
	private double spent;
	
	public CustomerSpent(){
		spent = 0;
	}
	public CustomerSpent(String name, int age, int phoneNum, double spent, String buy){
		super(name, age, phoneNum, buy);
		this.spent = spent;
	}
	
	
	//set values
	public void setSpent(double spent){
		this.spent = spent;
	}

	public double getSpent(){
		return spent;
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
