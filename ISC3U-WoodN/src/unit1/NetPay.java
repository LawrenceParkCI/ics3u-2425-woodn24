package unit1;

public class NetPay {

	public static void main(String[] args) {
	

		int netPay, hours, wage, insurance;
		double tax;

		hours = (40);
		wage = (5);
		insurance = (2);
		tax = (0.22);

		netPay = (int) (( hours * wage - insurance ) - tax*(hours*wage-insurance));
		System.out.println(netPay);

	}

}
