public class PracticeProblem {

	public static void main(String args[]) {

	}
	// Q1
	public static int sum(int num1, int num2) {
		int sumResult = num1 + num2;
		return sumResult;
	}
	// Q2
	public static int difference(int num1, int num2) {
		int subtractionResult = num1 - num2;
		return subtractionResult;
	}
	// Q3
	public static double product(double num1, double num2) {
		double multiplicationResult = num1 * num2;
		return multiplicationResult;
	}
	// Q4
	public static String removeFirst(String sentence) {
		return sentence.substring(1);
	}
	// Q5
	public static int combinedLength(String word1, String word2) {
		return word1.length() + word2.length();
	}
	// Q6
	public static boolean isEven(int num1) {
		return num1%2 == 0;
	}
	// Q7
	public static boolean isOdd(int num1) {
		return num1%2 != 0;
	}
	// Q8
	public static boolean isPositive(int num1) {
		return num1 > 0;
	}
	// Q9
	public static boolean isNegative(int num1) {
		return num1 < 0;
	}

}
