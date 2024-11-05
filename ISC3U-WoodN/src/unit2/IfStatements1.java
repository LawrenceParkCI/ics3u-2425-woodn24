package unit2;

public class IfStatements1 {
	public static void main(String[] args) {
		/**
		 * Description: This is the introduction to if statment worksheets
		 * Date: 2024-11-05
		 * @author Nathan Wood
		 */

		int firstNum = 10;
		int secondNum = 30;

		System.out.println("Part 1: If");
		System.out.println("----------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGLUL");
		}    

		//What prints out? Why?
		// nothing
		System.out.println("\nPart 2: If, Else");
		System.out.println("----------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		//XQCL prints because first number is not greater than the second number
		System.out.println("\nPart 3: If, Else if, Else");
		System.out.println("-------------------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		// sykSHY prints because the first number isnt higher than the second number, and the condition for the second statment is met 
		System.out.println("\nPart 4: What's the difference?");
		System.out.println("------------------------------");
		System.out.println(1);	// this line
		if (firstNum < secondNum) {
			System.out.println("KEKW");	// this line
			System.out.println("OMEGALUL");	// this line
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){ // not printed because code brick ends after first part
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		System.out.println(2);	// this line
		if (firstNum < secondNum) {
			System.out.println("KEKW");	// this line
			System.out.println("OMEGALUL");	// this line
		}

		if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");	// this line
		}

		if (!(firstNum < secondNum)) {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		//1
		//KEKW
		//OMEGALUL
		//2
		//KEKW
		//OMEGALUL
		//sykSHY
		// all of this prints becuase the code is made up of multiple if statments not pn if followed by else if statments. all this lines labeled "this line have been printed

		//What is the difference between the first and second part?
		// The first part is all in one section so only after the fisrt condition that is fufilled gets printed, in the second section each is an individual statement and so each can print seperatly of the other statments
	}

}
