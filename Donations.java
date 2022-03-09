import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Donations {
//Instance Variables	
	int numIndividual;
	double amtIndividual;
	int numBusiness;
	double amtBusiness;
	int numOther;
	double amtOther;
	
//processDonation
	public void processDonation(String cat, double donation) {
		//Individual
		if(cat.equals("Individual")) {
			numIndividual++;
			amtIndividual = amtIndividual + donation;
		}
		else {
			numIndividual--;
			amtIndividual = amtIndividual - donation;
		}
		//Business
		if(cat.equals("Business")){
			if(donation > 0) {
				numBusiness++;
				amtBusiness = amtBusiness - donation;
			}	
			else {
				numBusiness--;
				amtBusiness = amtBusiness - donation;
			}
		}
		//Other
		if(cat.equals("Other")){
			if(donation > 0)
				numOther++;
				amtOther = amtOther + donation;
			}
		else{
			numOther--;
			amtOther = amtOther - donation;
		}
	}
//getStatistics
	public void getStatistics() {
		//Individual
		System.out.println("Number of donations for individual: " + numIndividual);
		System.out.println("Total donations for individual: " + amtIndividual);
		//Business
		System.out.println("Number of donations for business: " + numBusiness);
		System.out.println("Total donations for business: " + amtBusiness);
		//Other
		System.out.println("Number of donations for other: " + numOther);
		System.out.println("Total donations for other: " + amtOther);
	}	
}