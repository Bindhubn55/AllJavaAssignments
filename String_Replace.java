//Question: In the given string Replace the a with n and replace given name Bindhu with name sharma.

package array_topic;

public class String_Replace {

	public static void main(String[] args) 
	{
		String name ="Bhanavi";
		String name1="Bindhu Kumari";
		
	String output =name.replace('a', 'n');  ////Replaced All 'a' with 'n' ,o/p: Bhnnnvi.
	System.out.println(output);
	String output1 = name1.replaceAll("Bindhu", "Sahrma");   // replace Bindhu with sharma
	System.out.println(output1); 
	String output2 = name1.replaceAll("[A-Z]", "");   // Remove uppercase letters
	System.out.println(output2); 
	String output3 = name1.replaceAll("[a-z]", "");   // Remove lowercase letters
	System.out.println(output3);
	
	}

}
