package com.bct.java8features;

interface Myfunction{
	 //a method with single parameter
	public int incrementbyFive(int number);
}
interface addition{
	//a method with multiple parameter
	public int addition(int num,int numb);
}
	
	

public class LambdSingleParameter {

	public static void main(String[] args) {
		
		//lambda expression with single parameter number
		Myfunction f = (number)-> number+5;
		System.out.println(f.incrementbyFive(23));
		

		addition addition = (num,numb)-> num+numb;
		System.out.println(addition.addition(2, 2));
		
		addition subtraction = (num,numb)-> num-numb;
		System.out.println(addition.addition(3, 9));
		
		addition multiplication = (num,numb)-> num*numb;
		System.out.println(addition.addition(2, 5));
		
		addition division = (num,numb)-> num/numb;
		System.out.println(addition.addition(7, 2));

	}

}
