package com.n2sbasics;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.ArrayList;

public class TaskOne {

	public static void main(String[] args) {
		System.out.println("Hello Tasks");
		//details();
		//prime();
		//calculator();
		//grade();
		//reverseNumber();
		//factorial();
		//enhancedFor();
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter A Number For Fibonacci Sequence: ");
		//int fib = sc.nextInt();
		//int result = fibonacci(fib);
		//System.out.println(result);
		
		//error();
		//reverseString();
		//palindrome();
		
		int[] elements = {0,1,2,3,4,5,6,7,8,9,10};
		System.out.println("The Duplicates Are: " + duplicates(elements));
		//guessingGame();
		
		//char[] arr = new char[5];
		//arr[0] = 'a';
		//arr[1] = 'b';
		//arr[2] = 'c';
		//arr[3] = 'd';
		//arr[4] = 'e';
		//System.out.println(count(arr));
		
		//fizzbuzz();
	}
	
	// Write a java program to print a person first name, last name, phone number, address and age. 
	public static void details() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Details As Prompted ");
		System.out.println("Enter Your First Name: ");
		
		String firstName = sc.next();
		System.out.println("You Entered " + firstName);
		
		System.out.println("Enter Your Last Name: ");
		String lastName = sc.next();
		System.out.println("You Entered " + lastName);
		
		System.out.println("Enter Your Phone Number: ");
		long phoneNumber = sc.nextLong();
		System.out.println("You Entered " + phoneNumber);
		
		//System.out.println("Enter Your Address: ");
		//String address = sc();
		//System.out.println("You Entered " + address);
		
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		System.out.println("You Entered " + age);
		sc.close();
	}
	
	public static void prime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter A Number Between 1 and 100 (Both Inclusive)");
		int number = sc.nextInt();
		
		while (number > 100 || number < 1) {
			System.out.println("Enter A Number Within The Provided Range");
			number = sc.nextInt();
		}
		
		int count;
		
		for (int i = 2; i <= number; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				System.out.println(i + " ");
			}
			
		}
	}
	
	public static void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers That You Would Like To Perform Operations For");
		System.out.println("Enter First Number: ");
		int first = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int second = sc.nextInt();
		
		System.out.println("Enter the Operation You Wish To Conduct ");
		System.out.println("Press 1 for Addition       (+)");
		System.out.println("Press 2 for Subtraction    (-)");
		System.out.println("Press 3 for Division       (/)");
		System.out.println("Press 4 for Multiplication (*)");
		int choice = sc.nextInt();
		int result;
		
		switch(choice) {
		case 1: result = first + second;
				System.out.println("Your Result Is " + result);
				break;
		case 2: result = first - second;
				System.out.println("Your Result Is " + result);
				break;
		case 3: if (first == 0 || second == 0) {
				System.out.println("Please Try The Program Again with Either of Numbers Not Being Zero");
				} else {
					result = first / second;
					System.out.println("Your Result Is " + result);	
				}
				break;
		case 4: result = first * second;
				System.out.println("Your Result Is " + result);
				break;
		}
	}
	
	public static void grade() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Test Grade (Between 1 and 100): ");
		int score = sc.nextInt();
		int grade = score / 10;
		
		if (grade == 10) {
			System.out.print("Perfect Score");
		}
		else if (grade == 9) {
			System.out.print("Excellent");
		}
		else if (grade == 8) {
			System.out.print("Nice Job");
		}
		else if (grade == 7) {
			System.out.print("Average");
		}
		else {
			System.out.print("Below Average");
		}
	}
	
	public static void reverseNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number You Would Like To Reverse: ");
		int number = sc.nextInt();
		int newNumber = 0;
		
		while (number != 0) {
			int temp = number % 10;
			newNumber = newNumber * 10 + temp;
			number = number / 10;
		}
		System.out.println(newNumber);
	}
	
	public static void factorial() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number To Calculate The Factorial: ");
		int number = sc.nextInt();
		int result = 1;
		
		for(int i = number; i > 0; i--) {
			result = result * i;
		}
		System.out.print("The Factorial of " + number + " is " + result);
	}
	
	public static void enhancedFor() {
		Scanner sc = new Scanner(System.in);
		int[] number = {1,2,3,4,5,6,7,8,9, 10}; 
		int sum = 0;
		
		for (int count: number) {
			sum += count;
		}
		System.out.println("The Total Sum Is " + sum);
	}
	
	public static int fibonacci(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 0;
		}
		if (number == 1){
			return 1;
		}
		else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}
	
	public static void error() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number (0-9): ");
		int number = sc.nextInt();
		try {
			if (number > 9 || number < 0)
				throw new NumberFormatException();
		}
		catch (NumberFormatException e) {
			System.out.println("Enter Number Between 0 and 9");
		}
	}
	
	public static void reverseString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A String: ");
		String string = sc.nextLine();
		String newString = "";
		
		for(int i = string.length() - 1; i >= 0; i--) {
			char temp = string.charAt(i);
			newString += temp;
			}
		System.out.println(newString);
	}
	
	public static void palindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number To Check For Palindrome Number: ");
		int number = sc.nextInt();
		int numberLength = (int)Math.log10(number) + 1;
		int result = 0;
		int tempNumber = number;
		
		for (int i = numberLength - 1; i >= 0; i--) {
			int temp = tempNumber % 10;
			result = result * 10 + temp;
			tempNumber = tempNumber / 10;
		}
		System.out.println(number);
		System.out.println(result);
		if (number == result) {
			System.out.print("Palindrome Number");
		}
		else {
			System.out.print("Not A Palindrome Number");
		}
	}
	
	public static ArrayList<Integer> duplicates(int[] numbers) {
		Set<Integer> number = new HashSet<Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		
		for (int i: numbers) {
			if (number.contains(i)) {
				arr.add(i);
			}
			number.add(i);
		}
		return arr;
	}
	
	public static void guessingGame() {
		Random random = new Random();
		int number = 1 + random.nextInt(1000);
		int guess;
		int guesses = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter The Number (1 - 1000) To Guess Correctly: ");
			guess = sc.nextInt();
			guesses = guesses + 1;
			
			if (guess < number) {
				System.out.println("Too Low. Try Higher!");
			}
			else {
				System.out.println("Too High. Try Lower!");
			}
		}
		while(number != guess);
		
		System.out.println("Finally You Guessed The Correct Number " + number);
		System.out.println("It took you " + guesses + " guesses!");
	}
	
	public static int count(char[] arr) {
		return arr.length;
	}
	
	public static void fizzbuzz() {
		for(int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Fizz");
			}
			else if (i % 5 == 0 && i % 3 != 0) {
				System.out.println("Buzz");
			}
			else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
	
}