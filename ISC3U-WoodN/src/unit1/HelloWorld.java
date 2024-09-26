package unit1;
public class HelloWorld {

	public static void main(String[] args) {
		System.out.printf("\t time\t  |Late Start Time|\tMon\t  |\tTue\t  |\tWed\t  |\tThu\t  |\tFri\t  |\n");
		System.out.print("__________________|_______________|_______________|_______________|_______________|_______________|_______________|");
		System.out.printf("\n        9:00-10:15|%15s|%-15s|%-15s|%-15s|%-15s|%-15s|","9:55-10:55 ","   Functions" , "   Comp Sci","    Functions","     Comp Sci","   Functions","   Comp Sci");
		System.out.printf("\n       10:20-11:40|%15s|%-15s|%-15s|%-15s|%-15s|%-15s|","11:00-12:05","  Comp Sci","    Functions","   Comp Sci","    Functions","    Comp Sci","   Functions");
		System.out.printf("\n       11:45-12:30|%15s|%-15s|%-15s|%-15s|%-15s|%-15s|","12:10-12:00","     Lunch","     Lunch","     Lunch","     Lunch","     Lunch","     Lunch");
		System.out.printf("\n        12:40-1:55|%15s|%-15s|%-15s|%-15s|%-15s|%-15s|","1:00-2:00","    Physics" ,"   Marketing", "    Physics","   Marketing","    Physics","   Marketing");
		System.out.printf("\n         2:00-3:15|%15s|%-15s|%-15s|%-15s|%-15s|%-15s|" ,"2:05-3:15","  Marketing", "    Physics","   Marketing","    Physics","   Marketing","   Physics");
	
		


	}
}