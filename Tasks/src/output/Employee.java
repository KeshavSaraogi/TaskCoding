package output;

import java.util.Scanner;

public class Employee {
	
	private String name;
	private String email;
	private String designation;
	
	private static final int count  = 5;

	Employee(){
		name = "";
		email = "";
		designation = "";
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number; 
		
		Employee one =new Employee();
		Employee two =new Employee();
		Employee three =new Employee();
		Employee four =new Employee();
		Employee five =new Employee();
	
		System.out.println("###-###-####");
		//one.printDetails();
		//two.printDetails();
		//three.printDetails();
		//four.printDetails();
		//five.printDetails();
		
		int i = 1;
		
		while (i <= count) {
			if (i == 1) {
				//one.getDetails();
				i++;
			}
			if (i == 2) {
				//two.getDetails();
				i++;
			}
			if (i == 3) {
				//three.getDetails();
				i++;
			}
			if (i == 4) {
				//four.getDetails();
				i++;
			}
			if (i == 5) {
				five.getDetails();
				System.out.println("Stop Adding More Details");
				System.out.println("Maximum Details Addition Are Reached");
				i++;
			}
		}
		five.printDetails();
		
	}

	private void setName(String name) {
		this.name = name;
	}
	
	private void setEmail(String email) {
		this.email = email;
	}
	
	private void setDesignation(String designation) {
		this.designation = designation;
	}
	
	private String getName() {
		return this.name;
	}
	
	private String getEmail() {
		return this.email;
	}
	
	private String getDesignation() {
		return this.designation;
	}
	
	private void getDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Name: ");
		String person = sc.nextLine();
		this.name = person;
		
		System.out.print("Enter The Email: ");
		String email = sc.nextLine();
		this.email = email;
		
		System.out.print("Enter The Designation: ");
		String designation = sc.nextLine();
		this.designation = designation;
	}
	
	private void printDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Email: " + this.email);
		System.out.println("Designation: " + this.designation);
	}

}
