package unit1;
import java.util.Scanner;
public class InputChars {
	/**
	* Description: InputChars
	* Date: 2024 10 17
	* @author Nathan Wood
	*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System. in) ;
		char ch1, ch2, ch3;
		System.out.println ("Type in any three characters on the keyboard") ;
		System.out.println ("Press <Enter > after each.") ;
		ch1=sc.nextLine().charAt(0);
		ch2=sc.nextLine().charAt(0);
		ch3=sc.nextLine().charAt(0);
		System.out.println ("Together these 3 letters spell:" + (ch1 + ch2 + ch3));

		sc.close();
	}

}
