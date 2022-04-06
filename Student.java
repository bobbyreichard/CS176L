/**
	   A student is represented by the name, birth year, and major.
	   You must enter the class name, instance variable(s), and constructor below
	*/

	   /**
	      Returns the string representation of the object.
	      @return a string representation of the object
	   */
public class Student extends Person {
	
	private String major;
	
	public Student(String n, int bYear, String maj) {
		
		super(n, bYear);
		major = maj;
		
	}
	   public String toString()
	   {
		   
	      return "Student[super=" + super.toString() + ",major=" + major + "]";
	 
	   }

}
