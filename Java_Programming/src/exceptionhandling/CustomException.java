package exceptionhandling;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:-");
		int age = sc.nextInt();
		
		if(age<18) {
			
			System.out.println("Before - You can't apply for Driving License");
			throw new ArithmeticException("You can't apply for Driving License");
			
		}
		
		else
		{
			System.out.println("You are eligible for Driving License");
		}
		
		System.out.println("After - You can't apply for Driving License");

	}

}
