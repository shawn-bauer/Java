import java.util.Scanner;

class ComputeLoan {
	public static void main(String[] args){
	//Create a scanner
	Scanner input = new Scanner(System.in);
	
	//Enter the yearly interest rate
	System.out.print("Enter the annual interest rate for the loan (for example 6.75): ");
	double interestRate = input.nextDouble();

	//Enter the number of years
	System.out.print("Enter the duration of the loan in years (for example 30): ");
	double loanDuration = input.nextDouble();

	//Enter the loan amount
	System.out.print("Enter the loan amount: ");
	double loanAmount = input.nextDouble();

	//Calculate the monthy interest rate
	double monthlyInterestRate = interestRate / 1200;

	//Calculate the monthly payment
	double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow((1 + monthlyInterestRate), (loanDuration * 12))));

	//Output the results
	System.out.println("The monthly payment for a loan of " + (int)(loanAmount * 100) / 100.00  + " with " + interestRate + " APR and a duration of " + loanDuration + " years is " + (int)(monthlyPayment * 100) / 100.0 + ".");

	}
}
