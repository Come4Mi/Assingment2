package assignment2;

public class CustomerInfo extends Customer {
	private String info;
	
	public CustomerInfo(){
		info = "";
	}
	public CustomerInfo(String name, int age, int phoneNum, String buy, String info){
		super(name, age, phoneNum, buy);
		this.info = info;
	}
	
	//set values
	public void setInfo(String info){
		this.info = info;
	}

	public String getInfo(){
		return info;
	}
	
	//toString
	public String toString(){
        return "Name : " + getName() + " "
                + "Age : " + getAge() + " "
                + "Phone Number : " + getPhoneNum() + " " 
                + "Purchase : " + getBuy() + " "
                + "Info : " + getInfo() + " ";
	}

}
