package unit2;
import java.util.Scanner;

/**
 * Description: Rolls 2 dice and compares the high scores
 * Date: 2024-11-25
 * @authorNathan Wood
 */
public class DoubleDiceContest {

	public static void main(String[] args) {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */
		
		Scanner in = new Scanner(System.in);
		int max = 6;
		int min = 1;
		int range = max - min + 1;
			
		System.out.println("Press enter to roll two dice");
		in.nextLine();
		System.out.println("Hope you roll higher than the computer");
		int rand = (int)(Math.random() * range) + min;
		System.out.println(rand);
		int rand2 = (int)(Math.random() * range) + min;
		System.out.println(rand2);
		System.out.println("You rolled " + (rand + rand2));

		int rand3 = (int)(Math.random() * range) + min;
		System.out.println(rand3);

		int rand4 = (int)(Math.random() * range) + min;
		System.out.println(rand4);
		System.out.println("The bot rolled " + (rand3 + rand4));

		if ((rand + rand2)<(rand3 +rand4)) {
			System.out.println("You lose");
		} else if ((rand + rand2)>(rand3 +rand4)) {
			System.out.println("You Win");
		} else if ((rand + rand2) == (rand3 +rand4)) {
			System.out.println("its a tie");
		}

		System.out.println("maybe try again!");
		in.close();
	}
}
