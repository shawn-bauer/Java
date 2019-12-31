import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class InputFile {
	public static void main(String[] args) throws Exception {
		//Create a scanner
		Scanner input = new Scanner(System.in);
		//File to read from
		System.out.println("Enter filename: ");
		String fileLocation = input.next();
		
		//Create a buffered reader
		BufferedReader bReader = new BufferedReader(new FileReader(fileLocation));
		
		String line;

		//Loop through the read block
		while ((line = bReader.readLine()) != null){
			//Split the contents by tab
			String datavalue[] = line.split("\t");
			String value1 = datavalue[0];
			String value2 = datavalue[1];
			String value3 = datavalue[2];
			System.out.println("The values for this line are: " + value1 + "\t" + value2 + "\t" + value3 + "End");
		}
		bReader.close();

	}
}
