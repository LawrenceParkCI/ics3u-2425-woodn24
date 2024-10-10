package unit1;
import java.util.Scanner;
public class PlayingWithStrings {
	/**
	 * Description: Experimenting with string manipulation 
	 * Date:2024-09-27
	 * @author NathanWood
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner (System. in) ;
		String message = "JackandJillwentupthehill";
		String word = message.substring(message.length() - 4);
		System.out.println(word);

		String spaces = "	Trim me		";
		String noSpaces = spaces.trim();
		System.out.println(spaces);
		System.out.println(noSpaces);

		String digits = "1234567890";
		System.out.println(digits.indexOf("6") + digits.indexOf("a"));

		String name1 = "Pierre Elliott Trudeau";
		String name2 = name1.substring(0,6) + name1.substring(15);
		System.out.println(name2);
		
		
		String msg = "I am enjoying this class.";
		String msg1 = msg.toUpperCase();
		String msg2 = msg.toLowerCase();
		char letter = msg.charAt(6);
		
		System.out.println(msg);
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println("character at index 6 = " + letter);
		System.out.println("msg has" + msg.length() + "characters.");
		
		String number1= 13 + "";
		System.out.println(number1);  
		
		sc.close();
	}

}
