package unit1;

import java.util.Scanner;

/**
 *  Description: 
 *  Date:2024-10-2
 * @author NathanWood
 */

public class MakeLabels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String subject;
		String name;
		
		System.out.println("Type in the subject and press <Enter>");
		subject = sc.nextLine();
		
		System.out.println("Type in \"your name\" and press <Enter>");
		name = sc.nextLine();
		
		System.out.println();
		System.out.println("******************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("******************************");
		sc.close();

	}

}