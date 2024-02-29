//Assignment12: write a program for all input of OR operator.
package logicaloperators;

public class ORoperators {

	static void subtraction()
	{
		int a=40;
		int b=60;
		if(a<b || b>a)   //True&&True=True
		{
			int sum = a-b;
			System.out.println("Both the condition of OR operator is true"  +   sum);
		}
		if(b>a || a==b)   //True && false = True
		{
			int sum = a-b-40;
			System.out.println("Both the condition of OR operator is false"  +sum);
		}
		if(b>=a || a!=b)   //False && True = True
		{
			int sum = b-a;
			System.out.println("Both the condition of OR operator is false1"+sum);
		}
		if(b==a || a==b)    // False && False =False.
		{                   
			int sum = 100-a-b;
			System.out.println("Both the condition of OR operator is false2"  +   sum);
		}
	}

	public static void main(String[] args) {
		
		subtraction();
		
	}

}
