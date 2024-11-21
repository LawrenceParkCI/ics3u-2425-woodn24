package unit1;
import java.util.Scanner;
public class Carpet {
	/**
	 * Description: Multiplication to find length of a carpet
	 * Date: Oct 15, 2024
	 * @author Nathan Wood
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;

			
	
		System.out.println(" type the width of your carpet? and press enter");
		int Width=sc.nextInt();
		System.out.println("Type the length of your carpet");
		int Length=sc.nextInt();
		System.out.println("Type the Price per square meter of your carpet");
		int Price =sc.nextInt();
	
		System.out.println("The carpet costs $" + (Width*Length*Price));

	
		
		
		
		sc.close();
	}

}
