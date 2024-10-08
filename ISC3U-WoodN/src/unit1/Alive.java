package unit1;
import java.util.Scanner;
public class Alive {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;

		//Questions
		int Yob; // Year of birth
		int Mob; // Month of birth
		int Dob; // Date of birth
		int AliveD;
		int AliveM;
		int AliveY;
		int AliveT;
		int Slept;
		//Pre-Diffined Info
		int CD; //Current Date
		int CY; // Current year
		int CM; // Current Month

		
		// Questions and defining variables 
		System.out.println("Enter Your Birthday");
		System.out.print("Year:");
		Yob=sc.nextInt();
		System.out.print("Month:");
		Mob=sc.nextInt();
		System.out.print("Day:");
		Dob=sc.nextInt();
		System.out.println("Enter Todays Date");
		System.out.print("Year:");
		CY=sc.nextInt();
		System.out.print("Month:");
		CM=sc.nextInt();
		System.out.print("Day:");
		CD=sc.nextInt();

		AliveY = CY - Yob;
		AliveM = CM - Mob;
		AliveD = CD - Dob;

		// Adjusts every unit into days and from days into hours slept
		AliveT = ((AliveY * 365) + (AliveM * 30) + (AliveD));
		Slept = (AliveT*8);
		
		
		// Prints the final result
		System.out.println("You have been alive for "  + AliveT + " Days");
		System.out.println("you have slept for " + Slept + " hours in your lifetime");



		sc.close();
	}

}
