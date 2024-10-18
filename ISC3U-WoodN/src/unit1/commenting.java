package unit1;

/**
* Description: Learning to comment
* Date: 2024 10 16
* @author Nathan Wood
*/
public class commenting {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
  public static void main(String[] args) {
    /*
     * Comments are meant to communicate ideas with other programmers and to keep track of one's logic
    */


    /**
     * This is a javadoc comment
  * 
     * These comments are used to create official documentation. We see them at the top of our programs (header) as well as to describe java-defined blocks of code (class, methods, attributes)
    *
     * Javadoc comments can be multi-line.
     * For now, we don't use Javdoc comments beside the header until unit 3.
    */

    /*
     * This is a block comment
  * 
     * Block comments can be multi-line
     * These comments are used to explain a section of code.
    */

    //this is a line comment
    //line comments are single line
    System.out.println("Testing"); //line comments can also be placed at the end of a line

    /*
     * Tracing Practice
     * For the following code:
     * -every time a variable is assigned a new value, write a line comment beside it telling what is the value currently stored in the variable.
  * 
     * -every time you see the block comment, write down each variable and what are the values at that time in the code
    */


    int num1 = 20; // num1 is 20
    double num2 = 36.2; //num2 is 36.2
    String stringNum = ""; //stringNum is ""

    /*
     * Variables Name    |   Value
     * ---------------------------------
     * num1              | 20
     * num2              | 36.2
     * stringNum         | ""
     */
    num1 += 20; // num1 is now 40
    num1 = num1 / 3 * 2; //num1 is 26
    num1 = (int)(num2 * 3 - (2 + 5) * 8); //num1 is 52
    num2 = ((int)num2) - num1;//num2 is -16
    stringNum = num1 + " " + num2;//stringNum is 52 -16

    /*
    * Variables Name    |   Value
    * ---------------------------------
    * num1              |52
    * num2              |-16
    * stringNum         |52 -16
    */


    num2 /= 2.5; //num2 is 6.4
    num1 /= 2; //num1 is 26
    stringNum = stringNum + "; ";//stringNum = 26 6.4 ; 
    stringNum = stringNum + num1 + " " + num2;//stringNum = 26 6.4 26 6.4


    /*
    * Variables Name    |   Value
    * ---------------------------------
    * num1              |26
    * num2              |6.4
    * stringNum         |26 6.4 26 6.4
    */
    
    
    
  }
}