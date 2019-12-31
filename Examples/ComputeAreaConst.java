import java.util.Scanner;

public class ComputeAreaConst {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the radius of the circle: ");
	double radius = input.nextDouble();
	final double PI = 3.14159;
	double area = radius * radius * PI;
	System.out.println("The area of a circle with radius " + radius + " is " + area + ".");

	}
}
