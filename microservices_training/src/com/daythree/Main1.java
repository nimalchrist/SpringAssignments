package com.daythree;

import java.util.HashSet;
import java.util.Iterator;
 
class Main1 {
	public static void main(String[] args) {
		HashSet<String>cities=new HashSet<>();
		cities.add("Chennai");
		cities.add("Delhi");
		cities.add("Mumbai");
		Iterator <String> city=cities.iterator();
		while(city.hasNext()) {
			System.out.println(city.next());
		}
		for(String ct:cities) {
			System.out.println(ct.length());
		}
	}
}
