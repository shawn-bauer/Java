import java.util.Scanner;
import javax.swing.JOptionPane;


public class ComputeBMI {
	public static void main(String[] args){
		//Prompt the user to enter their weight in pounds
		String weightString = JOptionPane.showInputDialog("Enter weight in pounds: ");
		//Prompt the user to enter their height in inches
		String  heightString = JOptionPane.showInputDialog("Enter height in inches: ");

		//Convert strings to double
		double weight = Double.parseDouble(weightString);
		double height = Double.parseDouble(heightString);

		//Set constants
		final double KILOGRAMS_PER_POUND = 0.45359237; //Constant
		final double METERS_PER_INCH = 0.254; //Constant

		//Calculate BMI
		double weightInKilograms = KILOGRAMS_PER_POUND * weight;
		double heightInMeters = METERS_PER_INCH * height;		
		double bmi = 100 * (weightInKilograms / Math.pow(heightInMeters, 2));

		int bmiInteger = (int) bmi;

		String message = "Your BMI is " + bmiInteger;
 		if (bmi < 16) {
			message = message + " you are seriously underweight";
		}else if (bmi < 18){
			message = message + " you are underweight";
		}else if (bmi < 24){
			message = message + " you are normal weight";
		}else if (bmi < 29){
			message = message + " you are overweight";
		}else if (bmi < 35){
			message = message + " you are seriously overweight";
		}else{
			message = message + " you are gravely overweight";
		}
		JOptionPane.showMessageDialog(null, message, "BMI Results", JOptionPane.INFORMATION_MESSAGE);
		
	}
}

