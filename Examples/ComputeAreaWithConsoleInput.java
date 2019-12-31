import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	public static void main (String[] args) {
	//Create a scanner object
	Scanner input = new Scanner(System.in);

	//Prompt user for input
	System.out.print("Enter a number for the radius of the circle: ");
	double radius = input.nextDouble();
	
	//Compute area
	double area;
	area = radius * radius * 3.14159;

	//Output area
	System.out.println("The area of the circle with radius " + radius + " is " + area + ".");


	}
}
