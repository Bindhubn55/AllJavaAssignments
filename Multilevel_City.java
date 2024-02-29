//Assignment 31: Multilevel Inheritance by creating 3 different class add 2 static methods in each program.

package inheritance;

public class Multilevel_City extends Multilevel_State {
	
	static void modulas()
	{
		int a =200;
		int b=150;
		int c=a%b;
		System.out.println("Mod :"+c);
	}
	static void Add()
	{
		int a =100;
		int b=200;
		int c=a+b;
		System.out.println("sum :"+c);
		
	}
	public static void main(String[] args) 
	{
		modulas();
		Add();
		Division();
		Multiplication();
		
	}
}
