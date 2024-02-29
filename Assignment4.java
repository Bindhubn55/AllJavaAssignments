// Assignment 5 : write a program for constructor and method overloading in single program.

package basicprogram;

public class Assignment4 {
	
	Assignment4()
	{
		System.out.println("This is my constructor");
	}
	
	static void add(int a,double b)
	{
		System.out.println("This is method overloading for static method");
		double sum=a+b;
		System.out.println(sum);
		
	}
	
	void add (int a, int b)
	{
		System.out.println("This is method overloading for Non-static method");
		int sum=a+b;
		System.out.println(sum);
		
	}
	

	public static void main(String[] args) {
		
		Assignment4 a1=new Assignment4();
		add(10,20.2);  //static method
		a1.add(10, 20);// for Non-static method
	}

}
