//Assignment No : 1 Create 2 static method & 2 Non-static method and call 2 method inside main Method.

package basicprogram;

public class Assignment1 {
	
	static void add() 
	{
		 System.out.println("This is static method Add");
	}

	static void multiplication() 
	{
		 System.out.println("This is static method Multiplication");
	}
	 void subtracting() 
	{
		 System.out.println("This is Non static method subtracting");
	}
	 void division() 
		{
			 System.out.println("This is Non static method division");
		}
	public static void main(String[] args)
	
	{
		
		System.out.println("This is Main Method");
		add();
		multiplication();
		Assignment1 A1 = new Assignment1();
		A1.subtracting();
		A1.division();
	}

}
