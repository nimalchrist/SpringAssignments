package com.daythree;

import java.util.ArrayList;
import java.util.Iterator;
public class Main2 {
	public static void main(String[] args) {
		ArrayList<String>listofcities=new ArrayList<>();
		listofcities.add("Chennai");
		listofcities.add("Delhi");
		listofcities.add("Mumbai");
		Iterator <String> city=listofcities.iterator();
		while(city.hasNext()) {
			System.out.println(city.next());
		}
		for(String list:listofcities) {
			System.out.println(list.length());
		}
	}
 
}
