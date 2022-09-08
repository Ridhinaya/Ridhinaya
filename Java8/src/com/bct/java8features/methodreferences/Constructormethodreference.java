package com.bct.java8features.methodreferences;

@FunctionalInterface
interface ConstructorInterface{
	
	Hello display(String say);
	
}

class Hello{
	
	//constructor
	Hello(String say) {
		System.out.println(" Good morning guys"+say);
		
		
	}
}

public class Constructormethodreference {

	public static void main(String[] args) {
		//method reference to a constructor
		
		ConstructorInterface ref = Hello::new ;
		
		ref.display("How are you doing...!!");
		
	}

}
