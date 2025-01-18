package unit2;
import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** T
		 Description:
		 Date:2024-11-26
		 @author Nathan Wood
		 */

		//Why do you think I coded it this way? It doesnt change the functionality
		
		Scanner in = new Scanner(System.in);
//		System.out.println("How many people are you planning to see?");
//		int numPeople = in.nextInt();
//		while (numPeople > 0) {
//			System.out.print("What is this person's name? ");
//
//			//Why do you think the variable is declared here? You use name in the following print 
//			String name = in.nextLine();
//			System.out.println("Welcome, " + name + "!");
//
//			numPeople = numPeople - 1;
//		}


		//Run the code Using the debugger. 
		//Explain the code in your own words
		//It asks me how many people then repeatedly asks me who they all are until its asked for everyone im seeing 

		//What code is repeated?
		//
		//When does it decide whether to repeat or not?
		//What is the condition for repeating?
		//everything inbetwwen the two "{, {"

		//What is the difference between a while loop and a do-while loop?
		//One is a post condition loop and the other is a pre conditional loop

		//Create a while loop that asks for a word, 
		//and prints it out 20 times.

				int npi = 0; // Numer of people int
		char npc;	// number of people char
		String nps; //Number of people string
		String zero = "0";




		//Question
		System.out.println("Favorite Word?");
		String name = in.nextLine();

		while (npi <= 20) {
			npi ++;
			System.out.print(name + " ");
			nps = Integer.toString(npi);

			if(npi >= 10) { //If it is called before 10 there is no character at 1
				npc = nps.charAt(1);
				String str = String.valueOf(npc);

				if(str.equals(zero)) { //New line every 10 times it prints
					System.out.println();

				} 
			}



		}
		in.close();
	}
}
