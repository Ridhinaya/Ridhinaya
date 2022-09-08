package com.bct.java8features.methodreferences;

import java.util.function.BiFunction;

interface MyInterface{
	// A method-- abstract method
	public void display();
}

//--> make reference to the abstract method and instance method
//method reference to an instance method of an object- object::instanceMethod

/*
 * Method reference to static method of the class
 */

class Addition{
	static int add(int number1, int number2) {
		System.out.println(number1+number2);
		return number1+number2;
	}
}

public class Student {
	/*
	 * Method references is the short hand notation of lambda expression to call a method
	 * str-> System.out.println(str);
	 * System.out::println
	 */
	
	//Method reference to an instance method of an object-object::instanceMethod
	public void myMethod() {
		System.out.println("Instance method");
		System.out.println("------ I have referenced by the abstract----");
	}

	public static void main(String[] args) {
		//create an object to class-student
		Student object=new Student();
		
		//method reference using the object of the class
		MyInterface ref=object::myMethod;
		
		//calling the method of function Interface
		ref.display();
		
		System.out.println("------");
		
		//If I wanted to call the instance method directly....!!
		object.myMethod();// instance method 
		
		//  create an object to class addition
		BiFunction<Integer,Integer,Integer> addition = Addition::add;
		int sum=addition.apply(11, 5);
		System.out.println("Addition of given number is:"+sum);
	}

}
