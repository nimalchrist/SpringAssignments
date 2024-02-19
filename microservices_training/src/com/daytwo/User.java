package com.daytwo;


class Cat extends Animal implements Printable{
	public Cat() {
		super();
	}
 
	@Override
	public void sound() {
		System.out.println("purs..");
	}
	
	@Override
	public void print() {
		System.out.println("");
	}
}

class Dog extends Animal implements Printable{
	public Dog() {
		super();
	}
	
	@Override
	public void sound() {
		System.out.println("barks...");
	}
 
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("");
		
	}
}

public class User {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog1 = new Dog();
		Animal dog2 = new Dog();
		
		Animal[] animals = new Animal[3];
		animals[0] = cat;
		animals[1] = dog1;
		animals[2] = dog2;
		
		for(Animal animal : animals) {
			animal.sound();
		}
		
		
		
		Printable[] printables = new Printable[3];
		printables[0] = new Dog();
		printables[1] = new Dog();
		printables[2] = new Cat();
		
		printAll(printables);
		
		
		
	}
	
	public static void printAll(Printable[] arr) {
		for(Printable p : arr)
			p.print();
	}
}

