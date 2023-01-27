package output;

public class Student {
	
	private int rollNumber;
	private String name;
	private int age;
	private static String collegeName = "Temple University";

	public static void main(String[] args) {
		Student one = new Student();
		Student two = new Student();
		
		one.setAge(23);
		one.setName("Keshav Saraogi");
		one.setRollNumber(1);
		one.printDetails();
		System.out.println("");
		two.setAge(18);
		two.setName("Keshav");
		two.setRollNumber(2);
		two.printDetails();
	}
	
	Student(){
		rollNumber = 0;
		name = "";
		age  = 0;
	}
	
	Student(int roll){
		rollNumber = roll;
		name = "";
		age  = 0;
	}
	
	Student(int roll, String person){
		rollNumber = roll;
		name = person;
		age  = 0;
	}
	
	Student(int roll, String person, int years){
		rollNumber = roll;
		name = person;
		age  = years;
	}
	
	
	private void setRollNumber(int roll) {
		this.rollNumber = roll;
	}
	
	private int getRollNumber() {
		return rollNumber;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	private String getName() {
		return name;
	}
	
	private void setAge(int age) {
		this.age = age;
	}
	
	private int getAge() {
		return age;
	}
	
	private void printDetails() {
		System.out.println("Roll Number: " + this.rollNumber);
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("College Name: " + this.collegeName);
	}

}
