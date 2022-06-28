package recursion;

public class RecursionDemo {
	public static void main(String[] args) {
		ComplexFunction complexfun = new ComplexFunction();
		
		int result = complexfun.CalculateFactorial(8);
		
		System.out.println("Factorial of 5 is: " + result);
		
	}

}
