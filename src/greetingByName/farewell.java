
package greetingByName;
import java.util.Scanner;

public class farewell {
	static Scanner scanner = new Scanner (System.in);

	public static void main(String[] args){
		String name;
		System.out.println("Hello, and welcome to SQA Selenium bootcamp");

		System.out.println("Could I please get your name?");
	
		name = scanner.nextLine();
		System.out.println("I am excited to learn more about you "+ name + "!");
		System.out.println("bye! "+name);
		
		
		System.out.println("\nThanks you for using the SQA Greeting Application!");
		
		System.exit(0);
	}
}