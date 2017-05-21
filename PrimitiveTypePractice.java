import java.util.Scanner;
public class PrimitiveTypePractice {

	public static void main(String[] args) {
		Scanner eliScanner = new Scanner(System.in);
		double firstNumber = eliScanner.nextDouble();
		double secondNumber = eliScanner.nextDouble();
		double printedSum = numberSum(firstNumber, secondNumber);
		double printedAverage = numberAverage(firstNumber, secondNumber);
		System.out.println("The sum of these two numbers is " + printedSum);
		System.out.println("The average of these two numbers is "+ printedAverage);
		
	}
	
	//This function returns the sum of two double numbers, 
	public static double numberSum(double a, double b) {
		
		double sumResult = a+b;
		return sumResult;
		
	}
	
	//This function returns the average of two double numbers
	public static double numberAverage(double a, double b) {
		
		double averageResult = (a+b)/2;
		return averageResult;
		
	}

}
