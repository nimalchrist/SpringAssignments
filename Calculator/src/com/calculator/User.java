package com.calculator;
import java.util.Scanner;
public class User {
	public static void main(String args[]) {		
		Calculator object;

		Scanner input = new Scanner(System.in);
		String type = input.nextLine();
		
		if(type.equals("A")) {
			object = new CalcA(10);
		}else {
			object = new CalcB(11);	
		}
		
		object.printSquare();
		
	}
}
