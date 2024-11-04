package unit1;

import java.util.Scanner;

/**
 * Description: Using Math Methods Worksheet
 * Date: 2024 10 15
 * @author Nathan Wood
 */
public class UsingMathMethods {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;

		System.out.println("Part A");

		//Write code to ask the user for any real number to be input.
		System.out.println("type real numbers as input and press <Enter>");
		//Store their input into the number variable
		num = sc.nextDouble();

		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.pow(num, num));
		System.out.println(Math.pow(num, 3));
		/*
		 * Run the program and write down the output that is produced
		 * when each of the following values are input:
		 * 
		 *      num = 16.75  | num = 4.0  | num = -23.45
		 *      -----------------------------------------------
		 * Math.round(num)		17		                | 	4		| -23
		 * Math.rint(num)		17.0		            | 	4.0		| -23.0
		 * Math.sqrt(num)		4.092676385936225		|	2.0		| NaN
		 * Math.abs(num)		16.75			        |	4.0		| 23.45
		 * Math.pow(num, 2)		280.5625             	|	16.0	| 549.9024999999999
		 * Math.pow(num, num)	3.178689376746782E20   	|	256.0	| NaN
		 * Math.pow(num, 3)		4699.421875	           	|	64.0	| -12895.213624999999
		 * 
		 */

		//Why does the last value(-23.45) give strange output for Math.sqrt(num)?
		//Nan stands for Not a number!
		//You cannot square root a negative number

		//In your own words describe what the following Math methods does
		/*
		 * round: removes decimal and increases any decimals over 5 carrying over the extra to the next digit 
		 * rint: Similar process to the previous but it keeps the integer 0
		 * sqrt: The square root of the number 
		 * abs: The absolute value of the number
		 * pow:puts the number to the power of the second digit within the brackets 
		 */

		//The methods round, sqrt and abs only have one parameter (which is in the brackets).
		//Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
		// the pow needs a digit and a digit to put it to the power of


		System.out.println("Part B");
		//Ask the user for any real number and an integer to be input. Display the real number,
		//and its square root. Also determine and display the real number raised to the integer power.
		//Use suitable headings, displaying the results across the screen.\
		//
		//Eg. If the real number 13.5 nad the integer 2 are input, display
		//REAL NUMBER SQUARE ROOT  RAISED TO POWER 2 <- display power here
		//   13.5     3.6742   182.25

		double rlNum;
		double rlNum2;
		System.out.println("write a real number and type <Enter>: ");
		rlNum = sc.nextDouble();
		System.out.println("write another number to be the power and type <Enter>: ");
		rlNum2 = sc.nextDouble();



		//Write down the results produced by your program when the real number 7.8985 and
		//the integer 3 are input.

		System.out.format("%-20s%-20s%-20s", "REAL NUMBER:", "|SQUARE ROOT: ", " |RAISED TO THE POWER OF: " + rlNum2);
		System.out.format("\n%-20s|%-20s|%-20s",rlNum, Math.sqrt(rlNum), (Math.pow(rlNum, rlNum2)));

		//Change your program so that instead of inputting an integer power, a real number
		//power can be input.
		//Write down the results produced by your program when the following are input:

		//a) the number 2 and the real number power 3.0
		//Real number: 2.0
		//Square root: 1.4142135623730951
		//Raised to power 3.0: 8.0

		//b) the number 8 and the real number power 0.33
		//Real number: 8.0
		//Square root: 2.8284271247461903
		//Raised to power 0.33: 1.9861849908740719

		//Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?
		//Yes, the real number result becomes 1.9999998613705687 

		sc.close();
	}

}
