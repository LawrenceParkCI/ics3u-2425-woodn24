package unit1;
public class NetPay {
	/**
	 * Description: Calculating Net Pay 
	 * Date:2024-10-10
	 * @author NathanWood
	 */
	public static void main(String[] args) {

		// Variables
		int netPay, hours, wage, insurance;
		double tax;
		hours = (40);
		wage = (5);
		insurance = (2);
		tax = (0.22);
		// Print Function 
		netPay = (int) (( hours * wage - insurance ) - tax*(hours*wage-insurance));
		System.out.println("the net pay for an employee who works 40 hours at $5 per hour with tax and insureance is " + netPay);
	}

}
