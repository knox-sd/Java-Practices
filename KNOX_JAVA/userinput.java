
import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //create scanner object
		
		System.out.println("What is your Name? ");
		String name = scanner.nextLine();
		
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine(); // clear scanner for new line
		
		System.out.println("What is your favorite food? ");
		String food = scanner.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("Your age "+age+" years old");
		System.out.println("You like "+food);
	}

}
