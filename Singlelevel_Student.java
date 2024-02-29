//Single level inheritance

package inheritance;

public class Singlelevel_Student extends Singlelevel_Teacher {
	
	static void Learning_Java() 
	{
		System.out.println("Learning java");
	}
	void Learning_Selenium() 
	{
		System.out.println("Learning Selenium");
	}
	public static void main(String[] args)
	
	{
		Singlelevel_Student s1= new Singlelevel_Student();
		s1.Teach_Java();
		Teach_Selenium();
		Learning_Java();
		s1.Learning_Selenium();
		
	}

}
