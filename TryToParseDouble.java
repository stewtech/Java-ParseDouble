package TryToParseDouble;

// Import Scanner
import java.util.Scanner;

public class TryToParseDouble {

	public static void main(String[] args) {
		// Create Scanner Object
		Scanner scan = new Scanner(System.in);
		// Create Variable
		double num = 0;
		String input = "";
		// Try block that outputs to console the instructions for the user and stores
		// input
		try {
			System.out.println("Enter a number that includes a decimal: ");
			input = scan.nextLine();
			num = Double.parseDouble(input);

		}
		// Catches a numberFormatException
		catch (NumberFormatException e) {
			System.out.println("You entered an invalid number.");
			num = 0;
		} finally {
			// Closes scanner
			scan.close();
		}

		System.out.println("The number is:" + num);

	}
}
