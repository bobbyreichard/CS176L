package HousePainting;
import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Define User Input Variables
		double length =0;
		double width =0;
		double height =0;
		double windows =0;
		double windowHeight =0;
		double windowWidth =0;
		double doors =0;
		double doorHeight =0;
		double doorWidth =0;
		double costPerSqFt =0;
		
		//Variables for Calculation
		double peakSide =0;
		double normSide =0;
		double totSqFt =0;
		double windowSpace =0;
		double doorSpace =0;
		double paintableSqFt =0;
		double costToPaint =0;
		
		//Inputs
		System.out.println("What is the Base of the House?: ");
		length = sc.nextDouble();
		System.out.println("What is the Length of the Edge to Roof?: ");
		width = sc.nextDouble();
		System.out.println("What is the Height of Peak to Groudn?: ");
		height = sc.nextDouble();
		System.out.println("How many Windows are there?: ");
		windows = sc.nextDouble();
		System.out.println("What is the Height of the Windows?: ");
		windowHeight = sc.nextDouble();
		System.out.println("What is the Width of the Windows?: ");
		windowWidth = sc.nextDouble();
		System.out.println("How many Doors are there?: ");
		doors = sc.nextDouble();
		System.out.println("What is the Height of the doors?: ");
		doorHeight = sc.nextDouble();
		System.out.println("What is the Width of the doors?: ");
		doorWidth = sc.nextDouble();
		System.out.println("What is the Painter's Cost per Square Foot?: ");
		costPerSqFt = sc.nextDouble();
		
		//Calculation
		peakSide = length * width + (0.5 * (length * (height - width)));
		normSide = length * width;
		totSqFt = (2 * normSide) + (2 * peakSide);
		windowSpace = (windowHeight * windowWidth) * windows;
		doorSpace = (doorHeight * doorWidth) * doors;
		paintableSqFt = totSqFt - (windowSpace + doorSpace);
		costToPaint = paintableSqFt * costPerSqFt;
		
		//Outputs
		System.out.println(paintableSqFt);
		System.out.println(costToPaint);
		
	}
}
