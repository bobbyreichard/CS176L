/**
	   A person is represented by the name and a birth year.
	   You must enter the class name, instance variable(s), and constructor below
	*/

	/**
	      Returns the string representation of the object.
	      @return a string representation of the object
	*/
public class Person {
	
	private String name;
	private int birthYear;
	
	public Person(String n, int bYear) {
		
		name = n;
		birthYear = bYear;
		
	}
	   public String toString()
	   {
		   
	      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	  
	   }

}
