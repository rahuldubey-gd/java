package exceptionhandling;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number -1");
		int num1 = sc.nextInt();
		System.out.println("Enter Number -2");
		int num2 = sc.nextInt();
		
		System.out.println("Before Exception");
		float result =0 ;
		
		try {
			result = num1/num2;
		}
		
		catch(Exception e) {System.out.println(e);}
		

		System.out.println("After Exception");
		System.out.println("Div Result - "+result);
		
	}

}
