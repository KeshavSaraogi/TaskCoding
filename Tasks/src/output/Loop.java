package output;

import java.util.Scanner;
import java.util.ArrayList;

public class Loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		String name;
		char option;
		
		do {
			System.out.print("Enter Name: ");
			name = sc.next();
			list.add(name);

			printList(list);
			System.out.print("Do You Wish To Continue (y/n): ");
			option = sc.next().charAt(0);
			
		} while (option != 'n');
		finalList(list);
		
	}
	
	public static void printList(ArrayList<String> li) {
		System.out.println("The Name List: ");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i) + " ");
		}
	}
	
	public static void finalList(ArrayList<String> li) {
		System.out.println("The Name List Is Below: ");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(i + 1 + ". " + li.get(i));
		}
	}
	
}