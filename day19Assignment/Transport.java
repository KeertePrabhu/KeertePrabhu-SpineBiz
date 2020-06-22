package day19Assignment;


import java.util.Scanner;
import java.util.ArrayList;
public class Transport extends Employee{
Scanner scanner;
ArrayList<Transport> trans;
 Transport(){
	scanner = new Scanner(System.in);
	trans = new ArrayList<Transport>();
}
void ChooseActionForUser() {
	int userChoice = 0;
	do {
		System.out.println("--------------------");
		System.out.println("Press 1 Add Driver");
		System.out.println("Press 2 to Add Bus");
		System.out.println("Press 3 to Add Employee");
		System.out.println("Press 4 to Edit Driver Details");
		System.out.println("Press 5 to Edit Bus Details");
		System.out.println("Press 6 to Delete Driver");
		System.out.println("Press 7 to Delete Bus");
		System.out.println("Press 8 to DeleteEmployee");
		System.out.println("Press 9 to Assign Driver For Bus");
		System.out.println("Press 10 to AssignBusForEmployee");
		System.out.println("Press 11 to Print bus details");
		System.out.println("Press 12 to print driver details");
		System.out.println("Press 13 to print Employee details");
		System.out.println("Press 0 Exit");
	
		System.out.println("--------------------");
		userChoice  = scanner.nextInt();
		switch (userChoice ) {
		case 1:	
			adddriverAccounts();
			break;
		case 2:	
			addbusAccounts();
			break;
		case 3:	
			addEmployeeAccounts();
			break;
		case 4:	
			editDriver();
			break;
		case 5:
			editbus();
			break;
		case 6:	
			deletecustomerDetails();
			break;
		case 7:	
			deleteBusDetails();
			break;
		case 8:
			deleteEmployeeDetails();
			break;
		case 9:	
			getBusDetils();
			break;
		case 10:
			getEmployeeDetailsfromUser();
			break;
		case 11:
			printbusaccount();
			break;
		case 12:
			printdriveraccount();
			break;
		case 13:
			printEmloyeeaccount();
		case 0:
			System.out.println("Exiting..... Thankyou");
			break;
		default:
			System.out.println("Invalid option.. Please press the correct number");
			break;
		}
		
	} while (userChoice!=0);
	
}


public static void main(String[] args) {
	Transport obj= new Transport();
	/*obj.adddriverAccounts();
	obj.addbusAccounts();	
	obj.addEmployeeAccounts();*/
	obj.printdriveraccount();
	obj.printbusaccount();
	obj.printEmloyeeaccount();
	obj.ChooseActionForUser();
	
}

}
