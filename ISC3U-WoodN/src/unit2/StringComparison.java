package unit2;
import java.util.Scanner;

class StringComparison {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Description: Learning non primative information types
		 * Date:2024-11-11
		 * @author Nathan Wood
		 */
		Scanner in = new Scanner(System.in);



		String answer;

		System.out.println("What is the capital of Ontario?");
		answer = in.nextLine();
		in.close();
		if (answer.equals("Toronto")) { //fixed with answer.equals instead of ==
			System.out.println("Correct!");
		} else {
			System.out.println("Sorry, that's incorrect.");
		}

		//Run the code. What happens when you type the correct answer? The incorrect answer?

		/*
		      Strings are objects, not primitives and as such are a 
		 *reference* data type. These variables hold an address 
		      to the value. (Scanner is also a reference data type)

		      int, double, char, etc. are all *primitive* data types. 
		      These variables hold the actual value.

		      Look at the website:
		      https://www.javatpoint.com/string-comparison-in-java

		      Demonstrate the use of the functions:
		        .compareTo()
		        .equals()
		        .equalsIgnoreCase()
		        
		        
		    
		 */
		String a = "hi ";
		String b = "Hi ";

		System.out.println(a.compareTo(b));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));

		//What values does compareTo() return? How can we
		//interpret the value? 32 because the Ascii value of the uppercase is larger than the under case
		//what value does equals() and equalsIgnoreCase() return?
		//The first is false the second is true because the only difference between the two is the case of the h
		
		//What is the difference between these two functions?
		//The first one is false because it does not ignore the case and sees Hi and hi as different
		
		//The second is true because it ignores the case and sees Hi and hi as the same

		
	}
}



