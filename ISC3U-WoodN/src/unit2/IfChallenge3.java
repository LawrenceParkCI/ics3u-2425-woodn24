package unit2;
import java.util.Scanner;
public class IfChallenge3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Description: Mini Quiz
		 * Date: 2024-11-19
		 * @author Nathan Wood
		 */
		
		//This is for the portfolio
		/*
		    Write an interactive quiz. It should ask the user three
		    multiple-choice or true/false questions about something.
		    It must keep track of how many they get wrong, and print
		    out a "score" at the end.
		    Sample:
		    Are you ready for a quiz?  N
		    Okay, here it comes!
		    Q1) What is the capital of Alaska?
		      1) Melbourne
		      2) Anchorage
		      3) Juneau
		    > 3
		    That's right!
		 */
		Scanner in = new Scanner(System.in);
		// question section 1 variables
		String q1a = "A"; //q1a means question 1 answer
		String q2a = "A";
		String q3a = "D";
		String q4a = "B";
		//Yes or no variables
		String no = "no";
		String n = "n";
		String yes = "yes";
		String y = "y";
		// Placeholders 
		int whil = 3;
		double score = 0;
		while (whil > 0) { //Repeats the prompt to start the quiz
			System.out.println("Are you ready for a quiz? YES or NO");
			String yn = in.nextLine();
			if( yn.equalsIgnoreCase(no) || yn.equalsIgnoreCase(n)) { 
				System.out.println("Take your time.");
			} else if( yn.equalsIgnoreCase(yes) || yn.equalsIgnoreCase(y)) { // Quiz Start
				System.out.printf("\nMULTIPLE CHOICE.  Choose the alternative that best completes the statement or answers the question.\n\n"); //Rules
				// Question 1
				System.out.println("_________ consists of a set of separate programs for developing and testing Java programs, each of which is invoked from a command line.");
				System.out.printf("%-50s %-1s","A) Java JDK","B) Java language specification\n");
				System.out.printf("%-50s %-1s","C) Java API","D) Java IDE\n");
				String q1 = in.nextLine();
				if (q1.equalsIgnoreCase(q1a)) {
					score += 1;
				}
				// Question 2
				System.out.printf("Java compiler translates Java source code into ________,");
				System.out.printf("%-50s %-1s","A) Java bytecode","B) another high-level language code\n");
				System.out.printf("%-50s %-1s","C) machine code","D) assembly code\n");
				String q2 = in.nextLine();
				if (q2.equalsIgnoreCase(q2a)) {
					score += 1;
				}
				// Question 3
				System.out.printf("The extension name of a Java bytecode file is ________");
				System.out.println("A) .obj			B).exe		C. .java		D) .class");
				String q3 = in.nextLine();
				if (q3.equalsIgnoreCase(q3a)) {
					score += 1;
				}
				// Question 4
				System.out.println("The main method header is written as:");
				System.out.println("A) public static void Main(String[]args)");
				System.out.println("B) public static void main(String[]args)");
				System.out.println("C) public static void main(string[]args)");
				System.out.println("D) public static main(String[]args)");
				System.out.println("E) public void main(String[]args)");
				String q4 = in.nextLine();
				if (q4.equalsIgnoreCase(q4a)) {
					score += 1;
				}
				whil = -1;
			}
		}
		
		//Quiz Result
		System.out.println("Your score was: " + (int)score);
		System.out.println("You got: " + (score/4)* 100 + "%");
		System.out.println("Thankyou for taking the quiz");
		in.close();
	}
}

