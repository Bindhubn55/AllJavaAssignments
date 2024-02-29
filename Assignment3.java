//Assignment 4: for method Overloading

package methodoverloading;

public class Assignment3 
{
	void add(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println(sum);
	}

	void add(double a,int b,int c)
	{
		double sum=a+b+c;
		System.out.println(sum);
	}
	void add(int a,double b,int c)
	{
		double sum=a+c-b;
		System.out.println(sum);
	}
	
	static void add(String a,char b) 
	{
		System.out.println(a);
		System.out.println(b);
	}
	static void add(char a,String b) 
	{
	System.out.println(a);
	System.out.println(b);
	}
	public static void main(String[] args) {
		
	System.out.println("This is my main Method");
	 Assignment3 a1=new Assignment3();	
	 a1.add(10,20,30);
	 a1.add(10.1, 40, 50);
	 a1.add(60, 10.2, 70);
	 add("GroTchechmindze",'a');
	 add('b',"mindze");

	}

}
