//Assignment 6 : Print the value of 1 to 10,Print the value of -10 to 0,Print the value of -100 to -110,Print the infinite loop
package forloop;

public class Assignment6 {
	
	static void positive()
	{
		for (int i=1;i<11;i++) //Print the value of 1 to 10
		{
			
			System.out.println(i);
			
		}
	}
	
	static void negative()
	{
		for (int i=-10;i<1;i++)  //Print the value of -10 to 0
		{
			System.out.println(i); 
		}
	}
	
	void decrement()
	{
		for(int i=-100;i>-111;i--) //Print the value of -100 to -110
		{
			System.out.println(i);   
		}
	}
	void infinite()
	{
		for(int i=0;i>-100;i++) //Print the infinite loop
		{
		  System.out.println(i);	
		}
	}
	
	public static void main(String[] args) 
	
	{
		System.out.println("Print the value of 1 to 10"); 
		positive();
		System.out.println("Print the value of -10 to 0");
		negative();
		Assignment6 n1 = new Assignment6();
		System.out.println("Print the value of -100 to -110");
		n1.decrement();
		//System.out.println("Print the infinite loop");
		//n1.infinite();


	}

}
