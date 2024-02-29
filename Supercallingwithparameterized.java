package inheritance;
class Manish
{
	Manish(String s)
	{
		System.out.println("grandparent constructor");
	}
}
class Bindhu extends Manish
{
	Bindhu(char a)  
	{
		super("bindhu");
		System.out.println("parentclass constructor");
	}
}

public class Supercallingwithparameterized extends Bindhu
{
	Supercallingwithparameterized()
	{
		super('b'); //here super calling statement written in explicit way.
		System.out.println("childclass constructor");
	}
	public static void main(String[] args) {
		
		Supercallingwithparameterized s1=new Supercallingwithparameterized();
		
		
	}

}


