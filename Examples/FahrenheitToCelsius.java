import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a temperature in Fahrenheit: ");
	double fahrenheit = input.nextDouble();
	
	//Convert temperature to Celsius
	double celsius = (5 * (fahrenheit - 32)) / 9;
	System.out.println(fahrenheit + " degrees fahreinheit is equal to " + celsius + " degress celsius.");


	}
}
