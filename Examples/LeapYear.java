import java.util.Scanner;
import javax.swing.JOptionPane;

public class LeapYear {
	public static void main(String[] args) {
	String yearString = JOptionPane.showInputDialog("Enter year: ");
	int year = Integer.parseInt(yearString);
	//Check if it is a leap year
	boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	String outPutString = "The year " + year + " is a leap year? " + isLeapYear;
	JOptionPane.showMessageDialog(null, outPutString, "Leap Year Results", JOptionPane.INFORMATION_MESSAGE);

	}
}
