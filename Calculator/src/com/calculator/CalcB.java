package com.calculator;

public class CalcB implements Calculator {
	int number;
	
	
	public CalcB(int number) {
		this.number = number;
	}


	@Override
	public int findSquare() {
		return number * number;
	}
	
	@Override
	public void printSquare() {
		System.out.println("Squre of " + number + " is " + findSquare());
	}
}
