package unit2;

public class BasicBoolean {
	public static void main(String[] args) {
		/**
		 * Description:
		 * Date:
		 * @author
		 */
		//we've declared a variable called isPurple of boolean type
		//Recall: boolean holds either true or false
//		boolean isPurple = false;


		/*
		      Boolean Operators, Expressions
		 */

		//boolean expressions are ways we can "calculate" whether
		//something is true or false

		int firstNum = 5;
		int secondNum = 10;
		double thirdNum = 5.5;

		//this prints out 1: true because 1st number is less than the second number
		System.out.println("1: " + (firstNum < secondNum)); 

		//this prints out 2: false because the first number is smaller than the second number
		System.out.println("2: " + (firstNum > secondNum)); 

		//this prints out 3: true because the first number is smaller than or equal to the third number as an intiger
		System.out.println("3: " + (firstNum <= (int)thirdNum)); 
		//this prints out 4:true because the first number is smaller than or equal to the third number
		System.out.println("4: " + (firstNum <= thirdNum)); 

		/*Test out these boolean operators. Figure out the meaning
		 * > means: bigger than
		 * < means: Smaller than
		 * <= means: smaller than of equal too
		 * >= means: bigger than or equal too
		 * == means: equal too
		 * != means: does not equal
		 */



	}

}
