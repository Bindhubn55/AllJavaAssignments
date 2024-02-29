//Assignment 31: Multilevel Inheritance by creating 3 different class add 2 static methods in each program.
package inheritance;

public class Multilevel_State extends Multilevel_Country {
	
	static void Multiplication()
	
	{
		int a =100;
		int b=20;
		int c=a*b;
		System.out.println("multiplication :"+c);
		
		
	}

	static void Division()
	{
		int a =100;
		int b=50;
		int c=a/b;
		System.out.println("division :"+c);
		
		
	}
	
	public static void main(String[] args) 
	{
	
		add();
		subtraction();
		Multiplication();
		Division();
		
	}
}
