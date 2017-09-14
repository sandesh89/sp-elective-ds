package recursion;

public class Factorial {
	
	int number;

	
	public Factorial(int number) {
		super();
		this.number = number;
	}

	int getFactorial(){
		return calculateFactorialRecursive(this.number);
	}
	
	private int calculateFactorialRecursive(int n) {
		if (n == 0)
			return 1;
		else
			return (n * calculateFactorialRecursive(n - 1));
	}

	
}
