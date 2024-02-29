package methodoverloading;

public class Methodoverloading {
	
	static void add(int a, double b)
	{
		double c=a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void add(double c, int a)
	{ 
		double d=c*a;
		System.out.println(c);
		System.out.println(a);
		System.out.println(d);
	}
	public static void main(String[] args) {
		
		add(10,101.5);
		add(201.60,20);
		
		
		
	}

}
