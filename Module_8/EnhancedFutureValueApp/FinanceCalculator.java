
public class FinanceCalculator {
	
	private static int MONTHS_IN_YEAR = 12;
	
	public static double calculateFutureValue(double monthlyPayment, double rate, int years) {
		
		int noOfMonths = years * MONTHS_IN_YEAR;
		
		double interestRate = 1+rate/100;
		
		double presentValue = monthlyPayment * noOfMonths;
		
		double futureValue = presentValue * (Math.pow(interestRate, noOfMonths));
		
	
		return futureValue;
		
	}

}
