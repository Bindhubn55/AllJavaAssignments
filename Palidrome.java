package array_topic;

public class Palidrome {

	public static void main(String[] args) {
		String input = "madam";
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--)
		{
			char char1 = input.charAt(i);
			output = output + char1;
		}
		System.out.println(output);

		if (input.equalsIgnoreCase(output)) {
			System.out.println("given input is  palindrome");
		}

	}

}
