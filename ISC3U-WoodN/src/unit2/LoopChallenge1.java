package unit2;
import java.util.Scanner;
/**
Description:
Date:2024-11-27
@author Nathan Wood
 */

public class LoopChallenge1 {
	public static void main(String[] args) {
		/*
     Create a program that will ask for the password.  If they answer 
     incorrectly, tell them, and repeat. If they answer correctly, 
     welcome them in.

     Extra: if they don't give a proper answer within 3 
     Decide on whether you should use the while or do while loop.
		 */
		Scanner in= new Scanner (System.in);
		Scanner sc= new Scanner (System.in);
		String pwc = "nathan"; //The correct Password
		String pw; // User input for password
		int score = 0; //Password Correct 
		int attempts = 0; //Represents the number of attempts

		
		while(attempts <= 3 || score > 0) {
			
			System.out.println();//question
			pw = in.next();
			
			if(pw == pwc) { //Question check
				System.out.println("Yay you got it correct");
				score ++; 
				
			} else attempts ++;
			
			
			
		} // While
System.out.println("yippe");
	}
}