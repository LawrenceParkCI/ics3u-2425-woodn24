package unit1;
import java.util.Scanner;
public class StringManipulation {
	/**
	 * Description: Experimenting with string manipulation 
	 * Date:2024-10-10
	 * @author NathanWood
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner (System. in);

		
		String sentence;
		System.out.println("Type any sentance");
		 sentence =sc.nextLine();
		
		// Char index
		char letter = sentence.charAt(5);
		System.out.println("At index 5, the character is: " + letter);
		
		//upper and lower case
		String SentanceUpperCase = sentence.toUpperCase();
		String SentanceLowerCase = sentence.toLowerCase();
		System.out.println(SentanceUpperCase);
		System.out.println(SentanceLowerCase);
		
//		First and last word
		int firstWord = sentence.indexOf(" ");
		int lastWord = sentence.lastIndexOf(" ");
		System.out.println("your first word is " + sentence.substring(0,firstWord));
		System.out.println("Your last word is" + sentence.substring(lastWord));
		
	

		 
		sc.close();
	}

}
