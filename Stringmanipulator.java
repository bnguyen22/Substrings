import java.util.Scanner;

public class Stringmanipulator {

	public static void main(String[] args) {
		
		Scanner oj = new Scanner(System.in);
		System.out.print("Please enter a string");
		String string1 = oj.nextLine();
		System.out.println("The length of your string is  " + string1.length() + "characters.");
		System.out.println("The first lettere of your string is " + string1.charAt(0));
	}

}
