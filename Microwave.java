
public class Microwave {
	//Instance Variables
	private int time;
	private int power;
	
	//Constructor
	public Microwave()
	{
		time = 0;
		power = 1;
	}
	//timeButton
	public void timeButton() 
	{
		time = time + 30;
	}
	//powerButton
	public void powerButton()
	{	
	if (power == 1)
		{power = 2;}
		else 
		{power = 1;}
	}
	//resetButton
	public void resetButton()
	{
		time = 0;
		power = 1;
	}
		
	//startButton
	public void startButton()
	{
		System.out.println("Cooking for " + time + " seconds at level " + power + ".");
	}
}
