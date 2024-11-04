package unit1;

import java.util.Scanner;

/**
 * Description:  Casting Assignment 1
 * Date: Oct 15, 2024
 * @author Nathan Wood
 */
public class Casting {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
		 */

		System.out.println("Part 1");

		int intNum;
		intNum = 10;

		double doubleNum;

		//implicit casting
		doubleNum = intNum;

		//What type of data is printed here? Why?
		System.out.println(doubleNum);

		//It is printing a double, such as 10.5 for example

		//can you explain what is happening in this code?
		doubleNum = doubleNum + 2.2;

		//Two doubles are being added 

		//explicit casting
		intNum = (int) doubleNum;

		//What type of data is printed here? Why?
		System.out.println(intNum);

		//An integer is being printed, 10 for example
		/*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double
      double to int
      int to long
      long to int

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data & the type of data)
		 */


		int myInt = 10;
		double myDouble = 0; 
		myInt = (int) myDouble; 


		double myDouble2 = 10.0; 
		int myInt2 = 11;

		int myInt3 = 12;
		long myLong = 0; 

		long myLong2 = 0; 
		int myInt4 = 14; 

		System.out.print("hello" + myInt + myDouble + myInt2+ myDouble2 + myInt3 + myLong + myLong2 + myInt4);
		
		
		
		System.out.println("Part 2");

		//understanding what you can do with casting, can you round the following variable to the nearest 10th?
		//understanding what you can do with casting, can you round the following variable to the nearest 10th?
		//code	
		double myNum;
		System.out.println("Type a deciaml number ");
		myNum = sc.nextDouble();
		myNum = myNum*10;
		myNum = (int) myNum;
		myNum = (double) myNum/10;

		sc.close();

	}
}