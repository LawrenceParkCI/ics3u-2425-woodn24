package unit3;

	/**
	* Description:
	   Learning the parts of a variable and learning how to use them
	* Date: 2024-12-19
	* @author Nathan Wood
	*/
	public class Arrays {
	  public static void main(String[] args) {
	    /**
	      Introduction
	    */
	    /*
	    Sometimes we want to store many values, but we don't want to
	    create so many variables

	    For example, we have almost 30 students in the class. It would
	    take a long time to write the variables for all the students,
	    let alone keeping their marks.
	    */

	    /*
	      This is why we can use an array - this allows us to refer to
	      many of the same datatype using one name (identifier), and a number (index) for which one to use.

	      To declare an array, we need the [] to indicate it is an array.
	      The type of array needs to be stated as well.
	    */

	    /**
	      Declaring and Initializing a pre-filled array
	    */
	    System.out.println("---------------------------------------------");
	    System.out.println("Declaring and Initializing a pre-filled array");
	    System.out.println("---------------------------------------------");
	    //Declares and initializes an array with 3 values, or 3 *elements*
	    String [] fruits = {"Apple","Banana","Lemon"};

	    //Modify the array above by adding 2 more fruits to it
	     String [] moreFruits = {"Apple","Banana","Lemon, Peach, Plum"};	
	    //Declare and initialize an array of 3 marks (double data type)
	     Double [] numbers = {1.0 , 2.0, 3.0};

	    /**
	      Using an element
	    */
	    System.out.println();
	    System.out.println("----------------");
	    System.out.println("Using an element");
	    System.out.println("----------------");
	    //To use an element, we use the name(identifier) of the array,
	    //and the numbered index of the elements.
	    //System.out.println(fruits[0] + fruits[2]); 
	    //What does it print out? Did it match what you think it 
	   //It prints out AppleLemon
	    
	    //should print?
	    //It calls the first item in the fruits array
	    //Try printing out the first and last fruit in the array
	    //System.out.println(fruits[0] + fruits[2]); 
	    
	    //Create a new variable called sum. add the values of the marks
	    //array to it, and print it out.
	    int [] marks = {56,64,73,54,85}; 
	    double sum =0;
	    for(int i = 0; i < marks.length ; i++ ) {
	     sum = sum + marks[i];
	    }
	    System.out.println(sum);
	    
	    /**
	      Assigning a value in an element
	    */
	    System.out.println();
	    System.out.println("-------------------------------");
	    System.out.println("Assigning a value in an element");
	    System.out.println("-------------------------------");
	    //To assign a value to a specific element, it is the same as for
	    //when you use a variable
	    //you need the variable name(identifier), and the index
	    fruits[0] = "Mangosteen";
	    System.out.println(fruits[0]);
	    
	  

	    //Assign the 3rd mark to be 0
	    marks[2] = 0;
	    /**
	      Declaring and Initializing an empty array
	    */
	    System.out.println();
	    System.out.println("-----------------------------------------");
	    System.out.println("Declaring and Initializing an empty array");
	    System.out.println("-----------------------------------------");
	    //When declaring an array, it works just like any other variable.
	    boolean [] isPassing;

	    //When initializing the array, you are simply creating the space
	    //in computer memory to store the values. The actual elements may not be
	    //initialized, depending on the language.

	    //this initialized the array to hold 5 elements
	    isPassing = new boolean[5];

	    System.out.println(isPassing[0]);

	    //Declare and initialize an array of 3 student names
	   // String [] students = {"James", "Nathan", "Imanuel"};
	   
	    String [] students;
	    students = new String [3];
	  
	    //print out the first element. What does it say?
	    System.out.println((students[0]));
	    /*
	      Initializing the elements of the array
	    */
	    System.out.println();
	    System.out.println("--------------------------------------");
	    System.out.println("Initializing the elements of the array");
	    System.out.println("--------------------------------------");
	    //same as above
	    //you need the variable name(identifier), and the index
	    isPassing[0] = true;
	    isPassing[1] = true;
	    isPassing[2] = false;
	    isPassing[3] = true;
	    isPassing[4] = false;
	    

	    //Initialize the elements of the student names. Print them out.
	    students[0]= "Manuel";
	    students[1]= "Gabe";
	    students[2]= "Josef";
	    
	    for(int a = 0; a < students.length ; a++ ) {
		     System.out.println(students[a]);
		    }

	    /**
	      Printing an array
	    */
	    System.out.println();
	    System.out.println("-----------------");
	    System.out.println("Printing an array");
	    System.out.println("-----------------");

	    System.out.println(isPassing);
	    //What do you see printed? Is it useful for us?
	    //We are seeing the the variabe from the line new boolean[5]; printed out
	    //How do you think we can print out each element of the array?
	    // we cam use a for loop like the one I used on line 142
	  }
	}