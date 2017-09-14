package recursion;

import java.util.List;

public class FibonacciMain {

	public static void main(String[] args) {

		int number = 13;
		FibonacciSeries f = new FibonacciSeries(number);
		List<Long> results = f.getFibonacci();

		for (Long i : results) {
			System.out.println(i);
		}

	}
}
