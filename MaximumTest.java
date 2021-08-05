package testMaximum;

public class MaximumTest{
	
   
	Double x,y,z;
	
	public MaximumTest(Double x, Double y, Double z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}



	



	public double maximum() {
	
		return MaximumTest.maximum(x, y, z); 
	}

	
	// determines the largest of three Integers
	public static double maximum(Double x, Double y, Double z) { 
		Double max = x; // assume x is initially the largest
	

		if(y.compareTo(max) > 0) { 
			max = y; //y is the largest so far
		}
	
		if(z.compareTo(max) > 0) {
		
			max = z; // z is the largest now
		}
		
		printMax(x, y, z, max);
		
		return max; // returns the largest object
	}

	
	public static  void printMax(Double x, Double y, Double z, Double max) {
		System.out.printf("Max of %s, %s and %s is %s\n",x, y, z, max);
	}

	public static void main(String args[]) {

		Double xDouble=8.2, yDouble = 9.8, zDouble = 6.1;
	
		
		// MaximumTest.testMaximum(xInt, yInt , zInt); 
		
		new MaximumTest(yDouble, xDouble, zDouble).maximum(); //TC 1.1
		new MaximumTest(xDouble, yDouble, zDouble).maximum(); // TC 1.2
		new MaximumTest(zDouble, xDouble, yDouble).maximum(); // TC 1.3
		
		
	}
}


