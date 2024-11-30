package unit2;
import java.util.Scanner;
/**
 * Description: This code checks the value of a number across multiple criteria 
 * Date:2024-11-11
 * @author 
 */
public class IfChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your favourite number?");
		int number = in.nextInt();

		// Part 1: Negative Number
		if (number < 0) {
			System.out.println("You need to look on the bright side!");
		}

		// Part 2: Odd Number
		if (number % 2 == 1) {
			System.out.println("That's a bit strange");
		}

		// Part 3: Divisible by 2 and 3
		if (number % 2 == 0 && number % 3 == 0) {
			System.out.println("You should really consider thinking about 6");
		} else {
			System.out.println("You can keep wholesome");
		}

		// Part 4: Ones Digit Check
		int onesDigit = Math.abs(number) % 10;
		if (onesDigit == 8) {
			System.out.println("I too am full");
		} else if (onesDigit == 9) {
			System.out.println("Canada is a nice country");
		} else {
			System.out.println("Don't count on it");
			in.close();
		}
	}
}