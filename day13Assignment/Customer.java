package day13Assignment;



import java.util.Scanner;

public class Customer {
	private int id,age1;
	private String name,phone;
	
	
	Scanner scanner;
	
	//default
	Customer(){
		scanner = new Scanner(System.in);
	}
	//overloaded constructors
	Customer(String name,int age){
		scanner = new Scanner(System.in);
		this.name = name;
		this.age1 = age;
	}
	
	Customer(int id,String name, int age)
	{
		scanner = new Scanner(System.in);
		this.id = id;
		this.name = name;
		this.age1 = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge1() {
		return age1;
	}
	public void setAge(int age1) {
		this.age1 = age1;
	}
	void getCustomerDetailsFromUser() {
		System.out.println("Please enter the Customer id");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the Customer name");
		name = scanner.nextLine();
		System.out.println("Please enter the Customer age");
		age1 = scanner.nextInt();
	}
	/*void printMovieDetails() {
		System.out.println("Movie ID "+id+"\nMovie Name "+name+"\nMovie Duration "+duration);
		System.out.println("------------------------------------");
	}*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Movie ID "+id+"\nMovie Name "+name+"\nMovie age "+age1;
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer c2 = (Customer)obj;
        Customer c1 = this;
		if(c1.getName().equals(c2.getName()) && c1.getAge1()==c2.getAge1())
			return true;
		else
			return false;
	}
	private Object getAge() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPhone(String phone2) {
		// TODO Auto-generated method stub
		
	}
}
