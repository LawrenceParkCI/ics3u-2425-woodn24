package unit2;
/**
Description: Experimenting with DoWhile
Date:2024-11-21
@author NathanWood
*/

import java.util.Scanner;

public class DoWhile {
 public static void main(String[] args) {
   /*
   A loop is another control structure that allows for repetition. It 
   does not make a decision on which branch to go on, like the 
   conditional.
   It makes a decision whether it should go back to redo a set of code.
   */
   Scanner in = new Scanner(System.in);
   String name;
   int count = 0;
//   do {
//     System.out.print("What is your name? ");
//     name = in.nextLine();
//   } while (!name.equals("Mr. Lee"));
//
//   System.out.println("You are welcome into the secret secret pogchamp club.");

  

   //Run the code. Explain the code in your own words
   //only lets me through when I say my name is Mr. Lee
   //What code is repeated?	a print and a scan
   //When does it decide whether to repeat or not? after I inputed my name 
   //What is the condition for repeating? that my name is not Mr. Lee


   /*
    Note:Pay attention to the brackets, and the semicolon
   */

   /*
     When constructing a loop, there are many strategies. I like to 
     break down the problems this way:
       1. What commands am I going to repeat?
       2. How many times/until when will I repeat the code?
   */

   //Create a do-while loop that asks for a word, and 
   //prints it out 20 times.
   
   System.out.print("Whats your favorite word? ");
   name = in.nextLine();
   do {     
	     System.out.println(name);
	     count += 1;
	   } while (count != 20);

	   System.out.println("You are welcome into the secret secret pogchamp club.");

   in.close();
	}

}
