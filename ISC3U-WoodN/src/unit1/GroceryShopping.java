package unit1;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*  Description: This program asks a series of questions and prints a receipt with your answers
 *  Date:2024-10-24
 * @author Nathan Wood
 */
public class GroceryShopping {
	/**
	 * Entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//product group 1 variables
		String item1;
		int nop1;
		double Subt, cost1, tp1, Tax;

		//product group 2 variables
		String item2;
		int nop2;
		double cost2, tp2;


		System.out.println("|| $$$ \\\\\\ ======///////==== \"Mr. Wood's Grocery\" =====\\\\\\===== /// $$$ ||");	

		// variables defining questions
		// Product group 1
		System.out.print("What would you like to buy? ");
		item1 = sc.nextLine();
		System.out.print("How much does it cost? ");
		cost1 =sc.nextDouble();
		System.out.print("How many are you buying? ");
		nop1 = sc.nextInt();
		sc.nextLine();
		System.out.println();

		//Product group 2
		System.out.print("What else would you like to buy? ");
		item2 = sc.nextLine();
		System.out.print("How much does that cost? ");
		cost2 =sc.nextDouble();
		System.out.printf("and how many are you buying?");
		nop2 = sc.nextInt();
		System.out.printf("\n\n\n\n\n\n");
		sc.close();

		// group 3
		Tax = 0.13;
		tp1 = (cost1 * nop1);
		tp2 = (cost2 * nop2);
		Subt = (tp1 + tp2);
		Tax = (Subt  * 0.13 );	
		double Total = Tax + Subt;

		// Time Creation System
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm");  
		LocalDateTime now = LocalDateTime.now();  

		//formatting commands
		NumberFormat money = NumberFormat.getCurrencyInstance();
		int TRI = (int) Math.round(Total); // TRI is Total Rounded as an Int
		double FCRT = Math.round(Total*20.0)/20.0; // Five Cents Rounding Total


		// Printing receipt 	
		System.out.println(dtf.format(now));
		System.out.printf("\n%17s|%17s|%17s|%17s","Item","Price","Quant","Total price\n");
		System.out.println(" ---------------------------------------------------------------------------");
		System.out.printf("%17s|%17s|%17s|%17s\n",item1,money.format(cost1),nop1, money.format(tp1));
		System.out.printf("%17s|%17s|%17s|%17s\n",item2,money.format(cost2),nop2,money.format(tp2));
		System.out.println(" ---------------------------------------------------------------------------");
		System.out.printf("%60s %-10s \n", "Subtotal: $",money.format(Subt));
		System.out.printf("%60s %-10s \n", "Tax: $",money.format(Tax));
		System.out.printf("%60s %-10s \n", "Total: $",money.format(Total));
		System.out.printf("This is approximitly " + money.format(TRI) + "\n");
		System.out.printf("The total rounded to the nearest 5 cents is " + money.format(FCRT));

	}

}
