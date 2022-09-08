package com.bct.java8features;

import java.util.ArrayList;
//Java lambda expression with no parameter
interface Mymethod{
	//a method with no parameter
	public String sayHello();
}
public class AnotherExample {
	
	
	//concrete/regular method
	public void display() {
		System.out.println("Hello world...!");
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(80);
		al.add(70);
		al.add(60);
		al.add(50);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al);
			
		}
		al.forEach((result)->{System.out.println(result);});
		
		//lambda expression for the method which has no parameter
		Mymethod display=()-> {System.out.println("Hello");
		return "Hello in return";};
		System.out.println(display.sayHello());
		}
		

	}
	


