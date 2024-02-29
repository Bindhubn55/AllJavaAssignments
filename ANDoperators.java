//Assignment 12: Write a program for all the input of AND operator.

package logicaloperators;

public class ANDoperators {
	static void add()
	{
		int a=40;
		int b=60;
		if(a<b && b>=a)   //True&&True=True
		{
			int sum = a+b;
			System.out.println("Both the condition of AND operator is true"  +   sum);
		}
		if(b>a&&a==b)   //True && false = False
		{
			int sum = a-b+40;
			System.out.println("Both the condition of AND operator is false"  +sum);
		}
		if(b==a&&a!=b)   //False && True = False
		{
			int sum = a+b+40;
			System.out.println("Both the condition of AND operator is false1"+sum);
		}
		if(b==a&&a<=b)   // False && False =False  but block is executing.
		{
			int sum = a-b+40;
			System.out.println("Both the condition of AND operator is false2"  +   sum);
		}
	}

	public static void main(String[] args) {
		
		add();
		

	}

}
