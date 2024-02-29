//Non parameterized super calling statement

package inheritance;

class grandparent
{
	grandparent()
	{
		System.out.println("grandparent constructor");
	}
}
class parentclass extends grandparent
{
	parentclass()  
	{// here super calling statement written implicitly
		System.out.println("parentclass constructor");
	}
}

public class supercallingstatement extends parentclass
{
	supercallingstatement()
	{
		super(); //here super calling statement written in explicit way.
		System.out.println("childclass constructor");
	}
	public static void main(String[] args) {
		
		supercallingstatement s1=new supercallingstatement();
		
		
	}

}
