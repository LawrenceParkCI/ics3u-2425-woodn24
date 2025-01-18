package unit3;

import java.util.Scanner;

public class MathPlusclassmethods {
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {

		System.out.println(hypotenuse(3.0, 4.0, 2.0, 5.0));
		System.out.println(distance(12,1,15,75));
		System.out.println(numOfFactors(17));
		System.out.println(isPrime(23));
		
		double [] doubleArray = {1.3, 5, 6,4};
		System.out.println(sum(doubleArray));

		int [] intArray = {1, 3, 5, 6,4};
		System.out.println(sum(intArray));

		int [] minInt = {1, 5, 6, 4 };
		System.out.println(min(minInt));

		int [] maxInt = {1, 5, 6, 4 };
		System.out.println(max(maxInt));
		
		double [] minDouble = {1.3, 5.0, 6.0, 4.0 };
		System.out.println(min(minDouble));

		double [] maxDouble = {1.3, 5.0, 6.0, 4.0 };
		System.out.println(max(maxDouble));

		int [] diffInt = {1, 12 };
		System.out.println(big(diffInt)); // df
		
		double [] diffDouble = {1.2, 5.0, 6.1, 4.0 }; // Dff
		System.out.println(big(diffDouble));
		
		
	} 




	public static double hypotenuse(double x1, double y1, double x2, double y2) {
		double xtotal = (x1 - x2);
		double ytotal = (y1 - y2);
		Double hyp = Math.sqrt(xtotal * xtotal + ytotal * ytotal);
		return hyp;
	} 




	public static double distance(int x1, int y1, int x2, int y2) {
		int xtotal = (x1 - x2);
		int ytotal = (y1 - y2);
		double newTotal = (Math.sqrt(xtotal * xtotal + ytotal * ytotal));
		return newTotal;
	} 




	public static int numOfFactors(int num) { 
		int factors = 0;
		for (int i=1; i <= num; i++) {
			if (num % i == 0) {
				factors += 1;
			}

		}
		return factors;

	}




	public static boolean isPrime(int num) {
		if (numOfFactors(num) == 2) {
			return true;
		}else

			return false;
	}




	public static int sum (int[] x) {
		int sum = 0;
		int totalNumbers = x.length;
		for (int i = 0; i < totalNumbers; i++) {
			sum += x[i];
		}
		return sum;
	}




	public static double sum (double[] x) {
		double sum = 0;
		int totalNumbers = x.length;
		for (int i = 0; i < totalNumbers; i++) {
			sum += x[i];
		}
		return sum;
	}




	public static int min (int[] x) {
		int minimum  = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > x[i]) {
				minimum = i;
			}
		}
		return minimum;
	}




	public static double min (double[] x) {
		int minimum = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[minimum] > x[i]) {
				minimum = i;
			}
		}
		return minimum;
	}




	public static int max (int[] x) {
		int maximum = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[maximum] < x[i]) {
				maximum = i;
			}
		}
		return maximum;
	}




	public static double max (double[] x) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[max] < x[i]) {
				max = i;
			}
		}
		return max;
	}



	public static int big (int[] diffInt) {
			int big = diffInt[max(diffInt)] - diffInt[min(diffInt)];
		return big;
	}
	
	public static double big (double[] diffDouble) {
		double big = diffDouble[(int) max(diffDouble)] - diffDouble[(int)min(diffDouble)];
	return big;
}

	
	public static int[] factors(int n) {

		int[] factorList = new int[numOfFactors(n)];

		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) { 
				factorList[c] = i;
				c++;

			}
		}

		return factorList;  


	}

}
