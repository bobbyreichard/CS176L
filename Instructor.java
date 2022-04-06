	/**
	   An instructor is represented by a name, a birth year, and a salary.
	   You must enter the class name, instance variable(s), and constructor below
	*/

	   /**
	      Returns the string representation of the object.
	      @return a string representation of the object
	   */
public class Instructor extends Person {

	private double salary;
	
	public Instructor(String n, int bYear, double sal) {
		
		super(n, bYear);
		salary = sal;
		
	}
	   public String toString()
	   {
		   
	      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
	  
	   }

	
}
