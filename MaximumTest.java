package testMaximum;

public class MaximumTest <N extends Comparable<N>> {
	N X, Y, Z;

	public MaximumTest (N X, N Y, N Z) {
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}

	public N Maximum () {
		return  MaximumTest .maximum(X, Y, Z);
	}

	// determines the largest integer from 3 Integres, Floats & Strings
	public static <N extends Comparable<N>> N maximum(N X, N Y, N Z) { 
		N max = X; // assume initially X is the largest integer
	
		if(Y.compareTo(max) > 0) { 
			max = Y; //y is the largest integer so far
		}
	
		if(Z.compareTo(max) > 0) {
		
			max = Z; // z is the largest integer now
		}
		
		printMax(X, Y, Z, max);
		return max; // returns the largest object
	}

	public static String testMaximum(String X, String Y, String Z) {
	
		String max = X; 
		if(Y.compareTo(max) > 0) {
		
			max = Y; //y is the largest so far
		
		} 
		if(Z.compareTo(max) > 0) {
		
			max = Z; // z is the largest now
		
		}
	
		printMax(X, Y, Z, max); 
		return max; // returns the largest object
	}

	public static <N extends Comparable> void printMax(N X, N Y, N Z, N max) {
		System.out.printf("Maximum Integer From %s, %s and %s is %s\n",X, Y, Z, max);
	}

	public static void main(String args[]) {

		Integer [] arr = {1, 2, 3, 4, 5, 245, 888, 963, 1024, 99, 100, 360};
		int n = arr.length;
		int swap;

		Integer max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i = i+3) {
			for (int j = i; j < arr.length-1; j++) {

				Integer value1 = arr[i];
				Integer value2;
				Integer value3;

				if (arr[j].compareTo(arr[j+1]) < 0) {
					swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
            	if (n < n-1) {
					value2 = arr[i + 1];
				}
				else {
					value2 = Integer.MIN_VALUE;

				}
				if (n < n-2) {
					value3 = arr[i + 2];
				}
				else {
					value3 = Integer.MIN_VALUE;

				}
                // obj.maxMethod(value1, value2, value3);
            
            	Integer res = new  MaximumTest <Integer>(value1, value2, value3).Maximum();

				if (res > max) {
					res = max;
					
				}
        	}
		}

		
	}
}