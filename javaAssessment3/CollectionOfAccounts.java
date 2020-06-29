package javaAssessment3;
import java.util.Scanner;

import java.util.ArrayList;

public class CollectionOfAccounts {
	Scanner scanner;
	ArrayList<Bank> accounts;
	public CollectionOfAccounts() {
		scanner=new Scanner(System.in);
		accounts = new ArrayList<Bank>();
	}
	
	void addaccount() {
		Bank bank = new Bank();
		bank.takeAccountDetailsFromUser();
		accounts.add(bank);
	}
	
public void addAccounts() {
		

		String choice = "No";
		do {
			addaccount();
			
			System.out.println("Do u want to Add Another Account?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
			
		} while (!choice.toLowerCase().equals("no"));
	}

public void printaccount() {
	for (Bank acc : accounts) {
		System.out.println(acc);
		System.out.println("--------------------");
	}
}

void transact() {
	int userChoice = 0;
	do {
		System.out.println("--------------------");
		System.out.println("1. Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.To exit");
		System.out.println("--------------------");
		userChoice  = scanner.nextInt();
		switch (userChoice ) {
		case 1:
		withdraw(userChoice, userChoice);
						
			break;
		case 2:
			deposite(userChoice, userChoice);			
			break;
		
		case 3:
			System.out.println("exiting.....");
			break;
		default:
			System.out.println("Invalid option.. Try again");
			break;
		}
		
	} while (userChoice!=3);
}
void deposite(double deposit,double balance) {
	try{
	System.out.println("enter amount to be deposite");
	
	deposit =scanner.nextDouble();
	
	 balance = balance + deposit;
	 System.out.println("deposit status");
	System.out.println("Your Money has been successfully deposited");
	System.out.println("Deposited amount  is"+balance);
}
catch(Exception e){
	
	System.out.println("some error occured");
	e.printStackTrace();
}}

void withdraw(double withdraw,float balance) {
	
	System.out.println("withdraw status");
	System.out.println("enter the amount to withdraw");
	withdraw=scanner.nextDouble();
	if((withdraw>balance)&&(withdraw==balance))
	System.out.println("Please collect your money");
	else
		System.out.println("you does not have sufficient balance");
	
	System.out.println("                                   ");
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionOfAccounts coa = new CollectionOfAccounts();
		coa.addAccounts();
		coa.printaccount();
		coa.transact();
	}

}