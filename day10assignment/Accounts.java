package day10assignment;


import  java.util.Scanner;
public class Accounts {
 String name,number,type;
 Float balance;
 Accounts(){
		number = "1900054457269";
		name = "Keerte";
		type = "current";
		balance = (float) 20000.23;
	}
 Accounts(String number,String name,String type,float balance){
		this.number = number;
		this.name = name;
		this.type = type;
		this.balance =balance;
 }

@Override
public String toString() {
	String data = "Number is : "+number+
			"\nName is : "+name+
			"\nType is : "+type+
			"\nbalance is "+balance;
	return data;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts account2 = new Accounts();
		System.out.println(account2);
	}

	
}
