import java.util.Scanner;
public class SalesTax {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter purchase amount: ");
	double purchaseAmount = input.nextDouble();
	System.out.print("Enter local tax rate: ");
	double taxRate = input.nextDouble();
	double taxDue = purchaseAmount * taxRate;
	System.out.println("The tax due on " + purchaseAmount + " is " + taxDue + " with a total of " + (int)(purchaseAmount + taxDue) + ".");
	}
}
