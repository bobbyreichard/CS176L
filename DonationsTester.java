import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {

	public static void main(String[] args)throws FileNotFoundException {
		File inputFile = new File("Donations.txt");
	
		Scanner in = new Scanner(inputFile);
		while (in.hasNextLine());
		{ 
			String what = in.nextLine();
			System.out.println(what);
		}
		in.close();
	}
	
}