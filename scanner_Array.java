//Array with scanner class withou for loop

package array_topic;

import java.util.Arrays;
import java.util.Scanner;

public class scanner_Array {

	public static void main(String[] args) {
		int rollno[] = new int[4];
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of  rollno 0");
		rollno[0]=s1.nextInt();
		System.out.println("enter the value of  rollno 1");
		rollno[1]=s1.nextInt();
		System.out.println("enter the value of  rollno 2");
		rollno[2]=s1.nextInt();
		System.out.println("enter the value of  rollno 3");
		rollno[3]=s1.nextInt();
		System.out.println(Arrays.toString(rollno));
		
		
	}
	

}
