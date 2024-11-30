package unit1;

/**
* Description: Casting Variables 3
* Date: 2024-10-16
* @author Nathan Wood
*/
public class Casting3 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
 public static void main(String[] args) {
    /* 
    * Strings and Back Again
    */
    //Recall:
    System.out.println("Part 1");
    System.out.println("1 + 2 + 3" + 4 + 5);
    //why did it print out this way?
    
    //Because there is a string in the print with integer, it doesn't add them together, and instead combines them
    
    //Demonstrate casting a double value to a String in this way
    
    System.out.println("1 + 2 + 3" + 4.2 + 5.3);
    
    //Demonstrate casting a boolean value to a String in this way
    
    System.out.println("1 + 2 + 3" + true + false);
    
    //Demonstrate casting a char value to a String in this way

    System.out.println("1 + 2 + 3" + 'a' + 'b');
    
    System.out.println("Part 2");
    //In order to change a String into an integer, we need another set of code
    
    String strNum = "25";
    int myNum = Integer.parseInt(strNum);

    System.out.println(strNum + " x 2 = " + (myNum + myNum));

    /*Change strNum to the following values, and see if they work:
     * "25.2"
     * "23c"
     * "2 3"
     * "Lol23"
     * "-5"
    */
    //What can you say about how we can use the function, Integer.parseInt()?

  //Can convert a type not a integer if its valid to do so
    
    /*Change strNum to the following values, and see if they work:
     * 
     * "25.2" - error
     * "23c" - error
     * "2 3" - error
     * "Lol23" - error
     * "-5" - works
    */
    // What do you think the code to change a String to double would look like?
    //Similarly, test out the code and write down what instructions
  
  
    String strNum2 = "-5.5";
    double myNum2 = Double.parseDouble(strNum2);
    System.out.println(strNum2 + " x 2 = " + (myNum2 + myNum2));
    //When do you think it might be necessary to change a string value into an integer value/double value?
    
    //Converting numbers in string to add to other integer/double
  }
}