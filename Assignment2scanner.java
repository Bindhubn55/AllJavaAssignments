//Assignment 30 : Create class and create 4 methods(add,sub,mul,div),add 2 variables but the input should come from scanner class by creating only one  object.
package scannerclass;

import java.util.Scanner;

public class Assignment2scanner {
	
	static int a;
	static int b;
	
	static void add()
	{

 
		int sum = a+b;
		System.out.println("sum of two number is :" + sum);
		
	}
	static void subtraction()
	{


		int sum = a-b;
		System.out.println("sum of two number is :" + sum);
		
	}
	static void multiple()
	{


		int sum = a*b;
		System.out.println("sum of two number is :" + sum);
		
	}
	static void division()
	{


		int sum = a%b;
		System.out.println("sum of two number is :" + sum);
		
	}

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		 a =s1.nextInt();
		System.out.println("Enter the value of b:");
		 b =s1.nextInt();
		add();
		subtraction();
		multiple();
		division();
		
	}

}
