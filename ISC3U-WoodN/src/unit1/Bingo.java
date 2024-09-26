package unit1;

public class Bingo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.printf(" %45s","Bingo Rules \n");	



		// This code creates a visible list of rules in the Console
		System.out.printf("1. The caller pulls a random number from a machine \n");
		System.out.printf("2. The caller anounces the number on the ball\n");
		System.out.printf("3. If the player has that number on their card, they will mark it off \n");
		System.out.printf("4. Steps 1-3 are repeated until a player finds a row collum or diagonal of 5 \n");
		System.out.printf("5.The anouncer confirms the vaidity of the BINGO\n");
		System.out.println("6.The player with 5 in a row wins\n");


		// This code creates the BINGO board with all of its number
		System.out.printf(" %45s","Bingo Board 1\n");
		System.out.printf("\n   B|%5s|%5s|%5s|%5s|","I","N","G","O");
		System.out.printf("\n   5|%5s|%5s|%5s|%5s|","27","43","48","68");
		System.out.printf("\n   2|%5s|%5s|%5s|%5s|","23","32","53","75");	
		System.out.printf("\n  11|%5s|%5s|%5s|%5s|","26","Free","47","67");
		System.out.printf("\n   8|%5s|%5s|%5s|%5s|","29","40","52","64");
		System.out.printf("\n   3|%5s|%5s|%5s|%5s|","19","36","46","63");
	}

}
