package assignment2;

public class CustomerInfo extends Customer {
	private String info;
	private String date;
	
	public CustomerInfo(){
		info = "";
		date = "";
	}
	public CustomerInfo(String name, int age, int phoneNum, String buy, String info){
		super(name, age, phoneNum, buy);
		this.info = info;
	}
	public CustomerInfo(String name, int age, int phoneNum, String buy, String info, String date){
		super(name, age, phoneNum, buy);
		this.info = info; 
		this.date = date;
	}
	
	//set values
	public void setInfo(String info){
		this.info = info;
	}

	public String getInfo(){
		return info;
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
                + "Purchase : " + getBuy() + " "
                + "Info : " + getInfo() + " ";
	}

}
