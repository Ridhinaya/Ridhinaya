package com.bct.java8features.methodreferences;

import java.util.Arrays;

//method reference to an instance method of an arbitrary object of a particular type

public class Example {

	public static void main(String[] args) {
		//create an collection
		String[] stringArray= {
				"Ridhinaya","Ganesh","Java","Programming","Java8","Method","reference"
				};
		        
		        /*
		         * Method reference to an instance method of an arbitrary object of a particular type
		         */
		         Arrays.sort(stringArray, String::compareToIgnoreCase);
		         
		         for(String data:stringArray) {
		             System.out.println(data);
		         }
		 

	}

}
