import java.util.Scanner;

public class ComputeChange {
	public static void main(String[] args){
	//Create a scanner
	Scanner input = new Scanner(System.in);

	//Receive the amount
	System.out.print("Enter an amount in double (for example 11.56): ");
	double amount = input.nextDouble();

	//Find number of one dollars
	int remainingAmount = (int)(amount * 100);
	int numberOfOneDollars = remainingAmount / 100;
	remainingAmount = remainingAmount % 100;
	//Find the number of quarters
	int numberOfQuarters = remainingAmount / 25;
	remainingAmount = remainingAmount % 25;

	//Find the number of dimes
	int numberOfDimes = remainingAmount / 10;
	remainingAmount = remainingAmount % 10;

	//Find the number of nickels
	int numberOfNickels = remainingAmount / 5;
	remainingAmount = remainingAmount % 5;

	//Find the number of pennies
	int numberOfPennies = remainingAmount;

	//Output the results
	System.out.println("Your amount " + amount + " consists of " + numberOfOneDollars + " dollars");
	System.out.println("and " + numberOfQuarters + " quarters, " + numberOfDimes + " dimes, " + numberOfNickels + " nickels, and " + numberOfPennies + " pennies.");

	}
}
