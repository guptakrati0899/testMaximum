package testMaximum;


public class MaximumTest{
	
   
    public static <E> E maximum(E x, E y, E z) {
	
		
		return MaximumTest.maximum(x,y,z); 
	}

	
	// determines the largest of three Strings
	public static  <E extends Comparable> E maximum (E x, E y, E z){ 
		E max = x; // assume x is initially the largest
	

		if(y.compareTo(max) > 0) { 
			max = y; //y is the largest so far
		}
	
		if(z.compareTo(max) > 0) {
		
			max = z; // z is the largest now
		}
		
		printMax(x, y, z, max);
		
		return max; // returns the largest object
	}

	
	public static  <E extends Comparable>  void printMax(E x, E y, E z, E max) {
		System.out.printf("Max of %s, %s and %s is %s\n",x, y, z, max);
	}

	public static void main(String args[]) {
		
		Integer xInt= 3 , yInt = 2, zInt = 5;
		Double  xDouble= 3.3 , yDouble = 2.5, zDouble = 5.1;
		String xStr="pear", yStr = "apple", zStr = "mango";
	
		
		MaximumTest.maximum(xInt,yInt,zInt);
		MaximumTest.maximum(xDouble,yDouble,zDouble);
		MaximumTest.maximum(xStr,yStr,zStr);
		
		
	}
}
