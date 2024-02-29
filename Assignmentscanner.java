//Assignment 30: Create class and create 4 methods(add,sub,mul,div),add 2 variables in each method but the input should come from scanner class for all methods.

package scannerclass;

import java.util.Scanner;

public class Assignmentscanner {
	 
	static void add()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a =s1.nextInt();
		System.out.println("Enter the value of b:");
		int b =s1.nextInt();
		int sum = a+b;
		System.out.println("sum of two number is :" + sum);
		
	}
	static void subtraction()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a =s1.nextInt();
		System.out.println("Enter the value of b:");
		int b =s1.nextInt();
		int sum = a-b;
		System.out.println("sum of two number is :" + sum);
		
	}
	static void multiplication()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a =s1.nextInt();
		System.out.println("Enter the value of b:");
		int b =s1.nextInt();
		int sum = a*b;
		System.out.println("sum of two number is :" + sum);
		
	}
	static void division()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a =s1.nextInt();
		System.out.println("Enter the value of b:");
		int b =s1.nextInt();
		int sum = a/b;
		System.out.println("sum of two number is :" + sum);
		
	}

	public static void main(String[] args) 
	{
		add();
		subtraction();
		multiplication();
		division();

	}

}
