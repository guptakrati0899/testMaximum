package testMaximum;


public class MaximumTest<T extends Comparable<T>> {
	T x, y, z;


	public MaximumTest(T x, T y, T z) {
	
		this.x = x;
		this.y = y; 
		this.z = z;
	
	}

	public T maximum() {
	
		return MaximumTest.maximum(x, y, z); 
	}

	// determines the largest of three Comparable objects 
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) { 
		T max = x; // assume x is initially the largest
	

		if(y.compareTo(max) > 0) { 
			max = y; //y is the largest so far
		}
	
		if(z.compareTo(max) > 0) {
		
			max = z; // z is the largest now
		}
		
		printMax(x, y, z, max);
		
		return max; // returns the largest object
	}

	public static String testMaximum (String x, String y, String z) {
	
		String max = x; 
		if(y.compareTo(max) > 0) {
		
			max = y; //y is the largest so far
		
		} 
		if(z.compareTo(max) > 0) {
		
			max = z; // z is the largest now
		
		}
	
		printMax(x, y, z, max); 
		return max; // returns the largest object
	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Max of %s, %s and %s is %s\n",x, y, z, max);
	}

	public static void main(String args[]) {

		Integer xInt=9, yInt = 4, zInt = 5;
	
		Float xF1=6.6f, yF1= 8.8f, zF1=7.7f;
		
		String xStr="pear", yStr="apple", zStr = "orange"; 
	
	//	MaximumTest.testMaximum(xStr, yStr , zStr); 
		new MaximumTest(xInt, yInt, zInt).maximum(); 
		new MaximumTest(yInt, xInt, zInt).maximum(); 
		new MaximumTest(xInt, yInt, xInt).maximum(); 
		
		new MaximumTest(yF1, xF1, zF1).maximum();
		new MaximumTest(xF1, yF1, zF1).maximum();
		new MaximumTest(xF1, zF1, yF1).maximum();
		
		new MaximumTest(xStr, yStr, zStr).maximum();
		new MaximumTest(yStr, xStr, zStr).maximum();
		new MaximumTest(zStr, yStr, xStr).maximum();
	}
}