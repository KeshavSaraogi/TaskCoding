package SetTwo;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		//salesTax();
		//modifiedSalesTax();
		//basePayRate();
		//modifiedBasePayRate();
		//modifiedBasePayRateAlert();
		//inchesToCentimeter();
		//poundKilogram();
		//System.out.println(capitalize("this is keshav saraogi"));
		//hexValue("FF8");
		
	}
	
	public static void salesTax() {
		Scanner sc = new Scanner(System.in);
		double salesTax = 8.25;
		double price;
		
		System.out.print("Enter The Price Of The Product: $");
		price = sc.nextDouble();
		double totalPrice = ((100 + 8.25) * price) / 100;
		
		System.out.println("The final price of the product is: $" + totalPrice);
	}
	
	public static void modifiedSalesTax() {
		Scanner sc = new Scanner(System.in);
		double salesTax = 8.25;
		int number;
		System.out.print("Enter The Number of Prices You Wish To Enter: ");
		number = sc.nextInt();
		
		double totalPrice = 0; 
		double totalPriceAfterTax = 0;
		double[] prices = new double[number];
		for (int i = 0; i < prices.length; i++) {
			System.out.println("Enter The Price of The Product: $");
			double price = sc.nextDouble();
			prices[i] = price;
			totalPrice += price;
		}
		totalPriceAfterTax = ((100 + 8.25) * totalPrice) / 100;
		
		System.out.println("Total Price: $" + totalPrice);
		System.out.println("Total Price After Tax: $" + totalPriceAfterTax);
	}
	
	public static void basePayRate() {
		Scanner sc = new Scanner(System.in);
		int hours = 0;
		double baseRate = 0;
		
		System.out.println("Enter The Base Pay Rate: $");
		baseRate = sc.nextDouble();
		System.out.println("Enter The Number of Hours Worked: ");
		hours = sc.nextInt();
		
		double totalCompensation = baseRate * hours;
		System.out.println("The Total Compensation is: $" + totalCompensation);
	}
	
	public static void modifiedBasePayRate() {
		Scanner sc = new Scanner(System.in);
		int hours = 0;
		int extraHours = 0;
		double baseRate = 0;
		double extraCompensation = 0;
		
		System.out.println("Enter The Base Pay Rate: $");
		baseRate = sc.nextDouble();
		System.out.println("Enter The Number of Hours Worked: ");
		hours = sc.nextInt();
		
		if (hours > 40) {
			extraHours = hours - 40;
			extraCompensation = 1.5 * extraHours * baseRate;
		}
		
		double totalCompensation = ((hours - extraHours) * baseRate) + extraCompensation;
		System.out.println("The Total Compensation is: $" + totalCompensation);
	}
	
	public static void modifiedBasePayRateAlert() {
		Scanner sc = new Scanner(System.in);
		int hours = 0;
		int extraHours = 0;
		double baseRate = 0;
		double extraCompensation = 0;
		
		System.out.println("Enter The Base Pay Rate: $");
		baseRate = sc.nextDouble();
		
		if(baseRate <= 4.35) {
			System.out.println("The Minimum Base Pay Is $4.35. Match The Rate!");
		}
		
		System.out.println("Enter The Number of Hours Worked: ");
		hours = sc.nextInt();
		
		if (hours > 40) {
			extraHours = hours - 40;
			extraCompensation = 1.5 * extraHours * baseRate;
			System.out.println("The Employers Are Not Supposed To Work More Than 40 Hours A Week!");
		}
		
		double totalCompensation = ((hours - extraHours) * baseRate) + extraCompensation;
		System.out.println("The Total Compensation is: $" + totalCompensation);
	}
	
	public static void inchesToCentimeter() {
		Scanner sc = new Scanner(System.in);
		double inches = 0;
		System.out.println("Enter The Number Of Inches You Wish To Convert To Centimeter: ");
		inches = sc.nextDouble();
		double cm = inches * 2.54;
		System.out.println("The " + inches + " inches are " + cm + " centimeters.");
	}
	
	public static void centimeterToInches() {
		Scanner sc = new Scanner(System.in);
		double cm = 0;
		System.out.println("Enter The Numner of Centimeter You Wish To Convert To Inches: ");
		cm = sc.nextDouble();
		double inches = cm / 2.54;
		System.out.println("The " + cm + " centimeter are " + inches + " inches.");
	}
	
	public static void poundKilogram() {
		int poundWeight = 454;
		int kiloWeight = 1000;
		
		Scanner sc = new Scanner(System.in);
		double pounds;
		double poundToKilos;
		System.out.println("Enter The Number Of Pounds You Wish To Convert To Kilograms: ");
		pounds = sc.nextDouble();
		poundToKilos = pounds * poundWeight / kiloWeight;
		System.out.println(pounds + " Pounds in Kilos Are: " + poundToKilos);
		
		double kilos;
		double kilosToPounds;
		System.out.println("Enter The Number of Kilos You Wish To Convert To Pounds: ");
		kilos = sc.nextDouble();
		kilosToPounds = kilos * kiloWeight / poundWeight;
		System.out.println(kilos + " Kilos in Pounds Are: " + kilosToPounds);
	}
	
	public static String capitalize(String str) {
		String newString = "";
		Scanner line = new Scanner(str);
		while (line.hasNext()) {
			String word = line.next();
			newString += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		return newString.trim();
	}
	
	public static void hexValue(String str) {
		int value = 0;
		String digits = "0123456789ABCDEF";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int digit = digits.indexOf(ch);
			value = 16 * value + digit;
		}
		System.out.println(value);
	}
}