
public class ArrayAssignment {

	double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
//a
	for(double x: values)
		System.out.println(x+" ");
//b
	double max = values[0];
	for(double x1: values)
		if(x1 > max)max = x1;
	System.out.println("Maximum value is " + max);
//c
	int count = 0;
	for(double x2: values)
		if(x < 0) count++;
	System.out.println("There are " + count + "negative values");
}
