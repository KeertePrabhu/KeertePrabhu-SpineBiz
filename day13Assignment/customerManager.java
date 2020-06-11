package day13Assignment;



import java.util.*;
public class customerManager {
	ArrayList<Customer> customers1;
	Scanner scanner;
	
	customerManager(){
		scanner = new Scanner(System.in);
		customers1 = new ArrayList<Customer>();
	}
	public void addCustomer() {
		Customer customer  = new Customer();
		customer.getCustomerDetailsFromUser();
		customers1.add(customer);
	}
	public void addCustomerss() {
		
		String choice = "No";
		do {
			addCustomer();
			System.out.println("Do u want to add more customer details?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
		} while (!choice.toLowerCase().equals("no") );
		
		System.out.println("customer details added");
		System.out.println("--------------------");
	}
	Customer findcustomerIndex(int age1)
	{
		for(Customer customer : customers1) {
			if(customer != null)
			{
				if(customer.getAge1()==age1) {
					return customer;
				}
			}
		}
		return  null;
	}
	Customer findcustomerrIndex(int id)
	{
		for(Customer customer : customers1) {
			if(customer != null)
			{
				if(customer.getId()==id)
				{
					return customer;
				}
			}
		}
		return null;
	}
	public void comparecustomers1() {
		int id1=0,id2=0;
		Customer m1,m2;
		
		System.out.println("Please enter the first customer id to be compared");
		id1 = scanner.nextInt();
		m1= findcustomerrIndex(id1);
		if(m1==null)
		{
			System.out.println("No such customer details please try again from start");
			comparecustomers1();
		}
		System.out.println("Please enter the second customer id to be compared");
		id2 = scanner.nextInt();
		m2= findcustomerrIndex(id2);
		if(m2==null)
		{
			System.out.println("No such customer details please try again from start");
			comparecustomers1();
		}
		if(m1.equals(m2))
			System.out.println("The customers are just the same");
		else
			System.out.println("Not same");
		System.out.println("--------------------");
	}
	public void deletecustomerDetails() {
		int id1=0;
		System.out.println("Please enter the customer  id to be deleted");
		id1 = scanner.nextInt();
		Customer m1 = findcustomerrIndex(id1);
		if(m1 == null)
		{
			System.out.println("No such customer");
			System.out.println("No customer deleted");
		}
		else	
		{
			System.out.println("The customer to be deleted is ");
			System.out.println(m1);
		customers1.remove(m1);
			System.out.println("customer details deleted");
			System.out.println("--------------------");
		}
			
	}
	public void updatecustomerDetails() {
		int age1=0;
		System.out.println("Please enter the customer age to be updated");
		age1 = scanner.nextInt();
		Customer m1 = findcustomerIndex(age1);
		System.out.println("The customer details for updation");
		if(m1==null)
		{
			System.out.println("No such details");
		}
		else
		{
			System.out.println(m1);
			System.out.println("--------------------");
			
			System.out.println("Please enter the customer phone for updation");
			String phone = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Please enter the customer age for updation");
			int age = scanner.nextInt();
	    	m1.setAge(age);
			m1.setPhone(phone);
			System.out.println("Update success");
			System.out.println("The updated movie details");
			System.out.println(m1);
			System.out.println("--------------------");
			
		}
	}
	public void printMovie() {
		int id1=0;
		System.out.println("Please enter the customer  id to be printed");
		id1 = scanner.nextInt();
		Customer m1 = findcustomerrIndex(id1);
		System.out.println("The selected Movie details");
		if(m1==null)
		{
			System.out.println("No such movie");
		}
		else
			System.out.println(m1);
		System.out.println("--------------------");
	}
	
	public void printAllMovies() {
		for (Customer customer : customers1) {
			System.out.println(customer);
			System.out.println("--------------------");
		}
	}
	void printMenu() {
		int userChoice = 0;
		do {
			System.out.println("--------------------");
			System.out.println("1. Adding a new customer");
			System.out.println("2. Updating the customer details");
			System.out.println("3. Deleting a customer");
			System.out.println("4. Compare customers");
			System.out.println("5. print customers");
			System.out.println("6. exit");
			System.out.println("--------------------");
			userChoice  = scanner.nextInt();
			switch (userChoice ) {
			case 1:
			
				addCustomerss();				
				break;
			case 2:
				updatecustomerDetails();
				break;
			case 3:
				deletecustomerDetails();
				break;
			
			case 4:
				comparecustomers1();
				break;
			case 5:
				printAllMovies();
				break;
			case 6:
				System.out.println("exiting.....");
				break;
			default:
				System.out.println("Invalid option.. Try again");
				break;
			}
			
		} while (userChoice!=6);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customerManager customermanager = new customerManager();
		customermanager.addCustomerss();
		customermanager.printMenu();
	}

}
