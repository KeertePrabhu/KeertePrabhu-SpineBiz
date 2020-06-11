package day13Assignment;


import java.util.*;
public class Accounts {
	ArrayList<AccountMethod> accounts;
	Scanner scanner;
	
	Accounts(){
		scanner = new Scanner(System.in);
		accounts = new ArrayList<AccountMethod>();
	}
	public void addAccount() {
		AccountMethod account  = new AccountMethod();
		account.GetAccountDetails();
		accounts.add(account);
	}
	public void addAccountss() {
		
		String choice = "No";
		do {
			addAccount();
			System.out.println("Do u want to add more Account details?? ");
			System.out.println("Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
		} while (!choice.toLowerCase().equals("no") );
		
		System.out.println("Account details added");
		System.out.println("--------------------");
	}
	
	void printMenu() {
		int userChoice = 0;
		do {
			System.out.println("--------------------");
			System.out.println("1. Adding a new customer");
			System.out.println("2. exit");
			System.out.println("--------------------");
			userChoice  = scanner.nextInt();
			switch (userChoice ) {
			case 1:
			
				addAccountss();				
				break;
			
			case 2:
				System.out.println("exiting.....");
				break;
			default:
				System.out.println("Invalid option.. Try again");
				break;
			}
			
		} while (userChoice!=2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts ac = new Accounts();
		ac.addAccountss();
		ac.printMenu();
	}

}