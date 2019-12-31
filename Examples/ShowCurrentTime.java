import java.util.Scanner;

public class ShowCurrentTime {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of hours from GMT (PST=17, CST=15, EST=14): ");
	int adjust = input.nextInt();

	//Get time since Midnight Jan 1, 1970
	long totalMilliseconds 	= System.currentTimeMillis();
	//Get total seconds since midnight Jan 1, 1970
	long totalSeconds	= totalMilliseconds / 1000;
	long currentSecond	= (int) (totalSeconds % 60);
	long totalMinutes	= totalSeconds / 60;
	long currentMinute	= totalMinutes % 60;
	long totalHours		= totalMinutes / 60;
	long currentHour	= totalHours % 24;
	//Display results
	System.out.println("Current GMT is " + currentHour + ":" + currentMinute + ":" + currentSecond + ".");
	System.out.println("Current local time is " + (adjust + currentHour) + ":" + currentMinute + ":" + currentSecond + ".");


	}
}
