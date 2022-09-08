package com.bct.java8features;

import java.util.ArrayList;

public class LambdaCollections {

	public static void main(String[] args) {
		
		// create the collection list
		ArrayList<String> ll= new ArrayList<String>();
		ll.add("Violet");
		ll.add("Orange");
		ll.add("Pink");
		ll.add("Indigo");
		
		ll.forEach((colours)->  System.out.println(colours));
		
	}

}
