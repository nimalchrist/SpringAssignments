package com.dayfour;

import java.util.Scanner;

public class User {
	public static void main(String args[]) {		
		Calculator object;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the type A/B: ");
		String type = input.nextLine();
		
		if(type.equals("A")) {
			object = new CalcA(10);
		}else {
			object = new CalcB(11);	
		}
		
		object.printSquare();
		
	}
}
