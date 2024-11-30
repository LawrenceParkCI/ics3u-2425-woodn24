package unit2;
public class Randomness {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		https://www.geeksforgeeks.org/java-math-random-method-examples/
		Description: Experimenting with a random funcation within set peramiters
		Date: 2024-11-21
		@author: Nathan Wood
		 */
		// define the range
		int max = 1000;
		int min = 100;
		int range = max - min + 1;
		for (int i = 1; i < 1000; i++) {
			int rand = (int)(Math.random() * range) + min;
			System.out.println(rand);
		}

		//Run the program a few times. What do you think is the
		//range of the numbers generated?
		// 0-1
		//Read the demo program. Write the code so that the program
		//will produce a random number between 100 and 1000.
	}
}
