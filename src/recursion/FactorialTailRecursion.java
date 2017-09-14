package recursion;

public class FactorialTailRecursion {

	int number;
	
	
	public FactorialTailRecursion(int number) {
		super();
		this.number = number;
	}

	int getFactorial() {
		return calculateFactorialTailRecursive(this.number, 1);
	}

	private int calculateFactorialTailRecursive(int n, int result) {
		if (n == 0) {
			return result;
		} else {
			return calculateFactorialTailRecursive(n - 1, n * result);
		}
	}
	 
}
