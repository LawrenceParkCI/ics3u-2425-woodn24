package unit2;
import java.util.Scanner;
public class IfChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Description:A program that checks the order of numbers
		 * Date:2024-11-11
		 * @author Nathan Wood
		 */

		//This is for the portfolio

		/*Create a program that asks for three numbers.
		    Tell the user if the numbers are strictly in order.
		    ie.  2 5 11 or 5 6 7 are strictly in order.
		    ie.  6 5 7 or 5 5 7 are not
		 */

		Scanner in = new Scanner(System.in);

		System.out.println("Type a number?");
		int num1 = in.nextInt();

		System.out.println("Another number");
		int num2 = in.nextInt();

		System.out.println("Please type another number");
		int num3 = in.nextInt();

		if(num1<num2 && num2<num3) {
			System.out.println("the numbers are strictly in order (:");
		} else { 
			System.out.println("the numbers are not strictly in order");
		}

		in.close();
	}

}
