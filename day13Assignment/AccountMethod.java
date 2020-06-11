package day13Assignment;

import java.util.Scanner;

public class AccountMethod {

String name,number,phone;
float balance;
Scanner scanner;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
AccountMethod(){
	scanner = new Scanner(System.in);
}
AccountMethod(String name,String number,float balance,String phone){
	scanner = new Scanner(System.in);
	
	this.number = number;
	this.name = name;
	this.phone=phone;
	this.balance = balance;
}
void GetAccountDetails() {
	
	System.out.println("please enter the Account number");
	number = scanner.nextLine();
	System.out.println("please enter the Accounter name");
	name = scanner.nextLine();
	System.out.println("please enter the Accounter phone");
	phone = scanner.nextLine();
	System.out.println("please enter the balance");
	balance=scanner.nextFloat();

}
void PrintAccountDetils() {
	
	System.out.println("Account number is :"+number);
	System.out.println("Account name is :"+name);
	System.out.println("Account phone number is :"+phone);
	System.out.println("Account balance is :"+balance);
}
}