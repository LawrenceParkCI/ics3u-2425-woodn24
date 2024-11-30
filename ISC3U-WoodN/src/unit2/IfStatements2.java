package unit2;
import java.util.Scanner;
/**
 * Description: This is the second worksheet where I had to troubleshoot
 * Date: 2024-11-05
 * @author Nathan Wood
 */
public class IfStatements2 {

	public static void main(String[] args) {
		//		    Scanner in = new Scanner(System.in);
		//
		//		    System.out.println("What is your age?");
		//		    int userAge = in.nextInt();
		//		    
		//		    if (userAge > 18) { //If they're over 18, they are titled an adult
		//		      String title = "Adult";
		//		    } else {  //if they're not over 18, I don't want a title
		//		      System.out.println("Sorry, not quite yet.");
		//		    }

		//Looking at the logic above, why do you think the 
		//program won't work? 
		// the program did not work becuase the variable was created in a if statment and called after the statment
		//The solution was to create the variable before the if statment so it could be called after the if statment

		//Copy the code below, and try to find a solution.
		//Comment the code above to avoid compilation errors.


		Scanner in = new Scanner(System.in);

		System.out.println("What is your age?");
		int userAge = in.nextInt();
		String title;
		if (userAge > 18) { //If they're over 18, they are titled an adult
			title = "Adult";
		} else {  //if they're not over 18, I don't want a title
			title = "Child";

			System.out.println("Sorry, not quite yet.");
		}

		System.out.println("Your a " + title);
		in.close();

	}

}
