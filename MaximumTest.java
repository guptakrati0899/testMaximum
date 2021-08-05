package testMaximum;

public class MaximumTest{
	
   
	String x,y,z;
	
	public MaximumTest(String x, String y, String z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}



	



	public String maximum() {
	
		return MaximumTest.maximum(x, y, z); 
	}

	
	// determines the largest of three Strings
	public static String maximum(String x, String y, String z) { 
		String max = x; // assume x is initially the largest
	

		if(y.compareTo(max) > 0) { 
			max = y; //y is the largest so far
		}
	
		if(z.compareTo(max) > 0) {
		
			max = z; // z is the largest now
		}
		
		printMax(x, y, z, max);
		
		return max; // returns the largest object
	}

	
	public static  void printMax(String x, String y, String z, String max) {
		System.out.printf("Max of %s, %s and %s is %s\n",x, y, z, max);
	}

	public static void main(String args[]) {

		String xStr="pear", yStr = "apple", zStr = "mango";
	
		
		// MaximumTest.testMaximum(xInt, yInt , zInt); 
		
		new MaximumTest(xStr,yStr,zStr).maximum(); //TC 3.1
		new MaximumTest(yStr, xStr, zStr).maximum(); // TC 3.2
		new MaximumTest(zStr, yStr, xStr).maximum(); // TC 3.3
		
		
	}
}
