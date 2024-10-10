package unit1;
/**
 *  Description: Question prompts the use your answers to write more lines
 *  Date:2024-10-2
 * @author NathanWood
 */
import java.util.Scanner;
public class MakeLabels {

	public static void main(String[] args) {

		// Defines Variables 
		Scanner sc = new Scanner(System.in);
		String subject;
		String name;
		
		// Asks question with a variable to be determined by your answer
		System.out.println("Type in the subject and press <Enter>");
		subject = sc.nextLine();
		
		System.out.println("Type in \"your name\" and press <Enter>");
		name = sc.nextLine();
		
		//Final text with your inputs
		System.out.println();
		System.out.println("******************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("******************************");
		sc.close();

	}

}