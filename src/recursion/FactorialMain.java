package recursion;

public class FactorialMain {
	public static void main(String args[]) {

		int number = 6, result;
	
		Factorial fact = new Factorial(number);
		result = fact.getFactorial();
		System.out.println("Factorial of " + number + " using recursion is: " + result);

		
		FactorialTailRecursion ftr = new FactorialTailRecursion(number);
		ftr.getFactorial();
		System.out.println("Factorial of " + number + " using tail recursion is: " + result);
		
	}
}
