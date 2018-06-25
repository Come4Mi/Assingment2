package assignment2;

public class Customer {
	private String name;
	private int age;
	private int phoneNum;
	private String buy;
	
	public Customer(){
		name = "";
		age = 0;
		phoneNum = 0;
		buy = "";
	}
	public Customer(String name, int age, int phoneNum, String buy){
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		this.buy = buy;
	}
	
	
	//set values
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setPhoneNum(int phoneNum){
		this.phoneNum = phoneNum;
	}
	public void setPurchase(String buy){
		this.buy = buy;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getPhoneNum(){
		return phoneNum;
	}
	public String getBuy(){
		return buy;
	}
	
	//toString
	public String toString(){
        return "Name : " + this.name + " "
                + "Age : " + this.age + " "
                + "Phone Number : " + this.phoneNum + " " 
                + "Purchase : " + this.buy + " ";
	}

}
