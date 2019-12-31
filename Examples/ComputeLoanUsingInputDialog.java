import javax.swing.JOptionPane;

public class ComputeLoanUsingInputDialog {
	public static void main(String[] args){
	//Enter yearly interest rate
	String annualInterestRateString = JOptionPane.showInputDialog("Enter yearly interest rate (ex. 8.25)");

	//Convert string to double
	double annualInterestRate = Double.parseDouble(annualInterestRateString);

	//Calculate the monthly interest rate
	double monthlyInterestRate = annualInterestRate / 1200;

	//Enter the number of years
	String numberOfYearsString = JOptionPane.showInputDialog("Enter the number of years as an integer (ex. 5)");

	//Convert string to double
	double numberOfYears = Double.parseDouble(numberOfYearsString);

	//Enter the amount
	String loanAmountString = JOptionPane.showInputDialog("Enter the loan amount in dollars (ex. 250000)");

	//Convert string to double
	double loanAmount = Double.parseDouble(loanAmountString);

	//Calculate the payment
	double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 /Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
	double totalPayment = monthlyPayment * 12 * numberOfYears;

	//Format to keep two digits after the decimal point
	monthlyPayment = (int)(monthlyPayment * 100) / 100;
	totalPayment = (int)(totalPayment * 100) / 100;

	//Display results
	String output = "The monthly payment is " + monthlyPayment + " and the total payment amount is " + totalPayment + ".";
	JOptionPane.showMessageDialog(null, output);

	}
}
