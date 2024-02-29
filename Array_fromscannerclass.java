// How to take the value of the Array from scanner class(human input while run time)

package array_topic;

import java.util.Arrays;
import java.util.Scanner;

public class Array_fromscannerclass {

	public static void main(String[] args) 
	{
		int rollno[] = new int[4];
		Scanner s1 = new Scanner(System.in);
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter the value of " +i);
		rollno[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		
	}

}
