package unit1;
import java.util.Scanner;
public class InputFP {

	public static void main(String[] args) {
		double num1,num2;
		


Scanner sc = new Scanner(System.in); 
System.out.print("Type in 2 numbers and press ‹Enter›: ");
num2 = sc.nextDouble();
num1 = sc.nextDouble();
System.out.println("the first number entered was "+ num2);
System.out.println("The second number entered was " + num1);
sc.close();
	}
}
