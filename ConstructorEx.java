//Assignment 2: Create  constructor,1 static and 1 Non-static Method.

	package constructor;

	public class ConstructorEx 
{
	ConstructorEx()  //constructor class
{
	
	System.out.println("This is my constructor");
}
	
	static void Add() //Static Method
{
	System.out.println("This is static method");	
}
	void subtracting() // Non Static Method
	{
		System.out.println("This is static is Non static subtracting method");	
	} 
	public static void main(String[] args) 
	{

        System.out.println("This is Main Method");
         
        ConstructorEx c1 = new ConstructorEx();
        Add();
        c1.subtracting();

	}

}
