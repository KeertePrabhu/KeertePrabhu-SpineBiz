package JavaAssessment;

import java.util.Scanner;






public class Account implements Comparable<Account> {
Scanner scanner;
private  String account_number,name,password,phone ;
Double balance;
Account(){
	scanner= new Scanner(System.in);
}

public String getAccount_number() {
	return account_number;
}

public void setAccount_number(String account_number) {
	this.account_number = account_number;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public Double getBalance() {
	return balance;
}

public void setBalance(Double balance) {
	this.balance = balance;
}

Account(String account_number ,String name ,String password, String phone ,double balance){
	this.account_number=account_number;
	this.name=name;
	this.password=password;
	this.phone=phone;
	this.balance=balance;
}

void takeAccountDetailsFromUser() {
	System.out.println("Enter the Account_number");
	account_number=scanner.nextLine();
	System.out.println("Enter the Name");
	name=scanner.nextLine();
	System.out.println("Enter the password");
	password=scanner.nextLine();
	System.out.println("Enter the phone number");
	phone=scanner.nextLine();
	System.out.println("Enter the Account Balance");
	balance=scanner.nextDouble();

}

@Override
public String toString() {
	String data = "Account_number is  : "+account_number.replaceAll("\\d(?=\\d{2})", "*")+
			"\nAccounters name is :"+name+
			"\npassword is "+password.replaceAll("^[a-zA-Z0-9_]$", "***")+
			"\nAccounters phone is :"+phone.replaceAll("\\d(?=\\d{2})", "*")+
			"\n balance is "+balance;
	return data;
}

/*public boolean equals(Object obj) {
	if(this.toString().contentEquals(obj.toString()))
		return true;
	else
		return false;*/
@Override
public int compareTo(Account o) {
	// TODO Auto-generated method stub
	return this.getName().compareTo(o.getName());
}

	
}