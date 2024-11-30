package unit2;
import java.util.Scanner;
public class StringChallenge {

	public static void main(String[] args) {

		/**
		 * Description: Experimenting with conditional statments
		 * Date: 2024-11-21
		 * @author Nathan Wood
		 */

		//This is for the portfolio

		/*
		    Create a program that demonstrates the use of .equals(), .equalsIgnorecase(), .compareTo().  You should be using if statements for this program.

		    Also, include an example of explicit and implicit casting.

		    Comment to explain:
		      -when you use the different String functions
		      -when you are casting and how the value is changed
		 */
		Scanner in = new Scanner(System.in);



		String Nathanage2 = "fifteen";

		String Nathanage = "15";
		String ca1 = "LPCI";
		String ca2 = "Lawrence Park";
		String ca3 = "Lawrence Park Collegiate Institute";
		String ca4 = "LP";
		int Score = 3;
		int Score2 =1;
		int points = 2;

		while (Score > 0) { //repeat question until correct answer

			System.out.println("What highschool does Nathan Wood attend?");
			String HS = in.nextLine();

			if (HS.equals(ca1) || HS.equals(ca2) || HS.equals(ca3) || HS.equals(ca4)) {
				Score = 0;
				System.out.println("Good job, You are SMART");


			} else if( HS.equalsIgnoreCase(ca1) || HS.equalsIgnoreCase(ca2) || HS.equalsIgnoreCase(ca3)|| HS.equals(ca4)) {  	
				Score = 1;
				System.out.println("maybe change your capitals");

			} else {
				Score = 2;
				System.out.println("Maybe just try Again");
				points -= 1;


			}
		}



		while (Score2 > 0) { //repeat question until correct answer

			System.out.println("What age do you think Nathan was when he started high school");
			String age = in.nextLine();

			//		System.out.println(age.compareTo(Nathanage));
			if(0 == age.compareTo(Nathanage) || 0 == (age.compareTo(Nathanage2))) {
				Score2 = 0;
				System.out.println("Great!");
			} else if( age.equalsIgnoreCase(Nathanage) || age.equalsIgnoreCase(Nathanage2)) {  	
				Score = 1;
				System.out.println("maybe change your capitals");

			}else{
				Score2 = 2;
				System.out.println("Maybe just try Again");
				points -= 1;

			}

		}

		//Quiz Result
		//multiply a double and an intiger for the other type of casting
		System.out.println("You got " + ((points/2)* 100) + "% correct!");
		System.out.println("Thankyou for learning about Nathan");
		in.close();


	}

}
