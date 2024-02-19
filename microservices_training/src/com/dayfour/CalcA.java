package com.dayfour;

public class CalcA implements Calculator{
	int number;
	
	
	public CalcA(int number) {
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
