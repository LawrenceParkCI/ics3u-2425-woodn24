package unit1;

public class MathOperator {

	public static void main(String[] args) {

		/*
        Pre: Kind of Math, but not really
        What do you notice is happening?
		 */

		System.out.println("Bed" + "room");

		System.out.println("1 + 2 + 3 + 4 + 5");

		System.out.println(1 + 2 + 3 + 4 + 5);

		System.out.println(1 + 2 + "3 + 4 + 5");

		System.out.println("1 + 2 + 3" + 4 + 5);


		/*     Why do you think the last two outputs act so differently?

The outputs are different based off of the placement of the Quotations
		       Summary: What are two possible roles of the + operator?

The + operator when dealing with numbers gives you the sum of the digits combine but when used with 2 words enclosed in quotations it brings them next to each other 

        Part 1 
        Figure out what is the meaning of each operator. Use print statements
        to verify your answer and explain.


		      + means: Addition

		      - means: Subtraction

		 * means: Multiplication 

		      / means: Division 
		 */


		//     Print the following expression: (3 + 2) * 5
		System.out.println((3 + 2) * 5);

		//     Print the following expression: 3 + 2 * 5
		System.out.println(3 + 2 * 5);
		//      Was this expected? Why or why not?
		/*
        Part 2 - Calculate Using Operators
        Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit

        Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
		 */     
		System.out.println(45*9/5+32); //This is 45C in F
		System.out.println((900-32) * 5/9);
		/*
        Part 3
        Figure out what is the meaning of % as a math operator. Use print statements
        to check your answer.
		 */

		//     I think % means: 

	}
}	
