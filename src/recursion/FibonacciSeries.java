package recursion;

import java.util.ArrayList;
import java.util.List;



/**
 * @author sandesh
 * This class is a little different than the Factorial class.
 * The class has a number and the result stored as a class member. 
 * Each instance of FibonacciSeries can store one number and its computation
 * 
 * Purpose of this class is to demonstrate that how result of computation can be stored in the object itself.
 * 
 */
public class FibonacciSeries {

	long number;
	List<Long> results;

	public FibonacciSeries(long number) {
		super();
		this.number = number;
	}

	List<Long> getFibonacci() {
		if (results != null && !results.isEmpty()) {
			return results;
		} else {
			calculateFibonacci();
			return results;
		}
	}

	void calculateFibonacci() {

		results = new ArrayList<>();

		for (int i = 1; i <= number; i++) {
			results.add(calculateFibonacciRecursive(i));
		}

	}

	private long calculateFibonacciRecursive(long n) {
		if (n <= 1)
			return n;
		else
			return calculateFibonacciRecursive(n - 1) + calculateFibonacciRecursive(n - 2);
	}

}
