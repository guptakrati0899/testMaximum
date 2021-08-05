package testMaximum;

public class MaximumTest{
    Integer x,y,z;


	

	public MaximumTest(Integer x, Integer y, Integer z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}


	public int maximum() {
	
		return MaximumTest.maximum(x, y, z); 
	}

	
	// determines the largest of three Integers
	public static int maximum(Integer x, Integer y, Integer z) { 
		Integer max = x; // assume x is initially the largest
	

		if(y.compareTo(max) > 0) { 
			max = y; //y is the largest so far
		}
	
		if(z.compareTo(max) > 0) {
		
			max = z; // z is the largest now
		}
		
		printMax(x, y, z, max);
		
		return max; // returns the largest object
	}

	
	public static  void printMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.printf("Max of %s, %s and %s is %s\n",x, y, z, max);
	}

	public static void main(String args[]) {

		Integer xInt=9, yInt = 4, zInt = 5;
	
		
		// MaximumTest.testMaximum(xInt, yInt , zInt); 
		
		new MaximumTest(xInt, yInt, zInt).maximum(); //TC 1.1
		new MaximumTest(yInt, xInt, zInt).maximum(); // TC 1.2
		new MaximumTest(zInt, yInt, xInt).maximum(); // TC 1.3
		
		
	}
}


