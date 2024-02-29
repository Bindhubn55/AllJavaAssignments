//Assignment 12 : write a program for NOToperator.

package logicaloperators;

public class Notoperator {
	
	static void multiplication()
	{
		int a=40;
		int b=60;
		if(!(a<50 || b>a))   //True&&True=True  o/p : False
		{
			int sum = a*b;
			System.out.println("Both the condition of NOT operator is true "  +   sum);
		}
		if(!(b>a || a==b))   //True && false = True  o/p : False
		{
			int sum = a*40; 
			System.out.println("Both the condition of NOT operator is false "  +sum);
		}
		if(!(b>=a && a!=b))   //False && True = True o/p : False
		{
			int sum = b-a;
			System.out.println("Both the condition of NOT operator is false1 "+sum);
		}
		if(!(b==a && a==b))    // False && False =False.  o/p : true
		{                   
			int sum = 100-a-b;
			System.out.println("Both the condition of NOT operator is false2 "  +   sum);
		}
	}

	public static void main(String[] args) {
		
		multiplication();


	}

}
