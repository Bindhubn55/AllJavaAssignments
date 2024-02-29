// Assignment 3 : Develop 5 Constructor to create constructor Overloading  with different data types.

package constructor;

public class Constoverloading

{
	Constoverloading()
	{
		System.out.println("This is constrcutor with no arguments");
	} 
	
	
	Constoverloading(int a)
	{
		System.out.println("This is constrcutor with arguments int a");
	}
	
	Constoverloading(char a)
	{
		System.out.println("This is constrcutor with arguments char b");
	}

	Constoverloading(boolean a)
	{
		System.out.println("This is constrcutor with arguments boolean true");
	}
	
	Constoverloading(String a)
	{
		System.out.println("This is constrcutor with arguments string bindhu");
	}
	
	public static void main(String[] args) 
	
	{
		System.out.println("This is main method");
		new Constoverloading();
		new Constoverloading(1);
		new Constoverloading('b');
		new Constoverloading(true);
		new Constoverloading("bindhu");

	}

}
