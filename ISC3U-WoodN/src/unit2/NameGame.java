package unit2;
import java.util.Scanner;

/**
 * Description:Random Insult
 * Date: 2024-11-27
 * @author Nathan Wood
 */
public class NameGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */

		System.out.println("What is your name");
		String name = in.nextLine();	
		int rand = (int)(Math.random() * 10) + 1; // range for the random 

		if(rand <= 3) {					//numbers for 30%
			System.out.println("I dont like that name"); 

		}else 
			System.out.println("I like that name");







	}

}
