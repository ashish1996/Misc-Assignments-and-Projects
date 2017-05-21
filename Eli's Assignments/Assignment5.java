import java.util.Arrays;

public class Assignment5 {

	public static void main(String[] args) {
		// Write the methods below as best you can, we will work on testing them next
		//week to make sure they work!
		double[] testArray= {4, 4, 98, 43, 87, 90, 87, 42, 3, 8, 0, 8};
		printArrayOfNumbers(testArray);
		System.out.println();
		System.out.println("The average of the input array is "+averageArray(testArray));
		System.out.println();

		System.out.println("The Standard Deviation of the input array is " + standardDeviator(testArray));
		System.out.println();

		reverseArray(testArray);
		printArrayOfNumbers(testArray);
		System.out.println();

		sortArrayAscending(testArray);
		printArrayOfNumbers(testArray);
		System.out.println();

		sortArrayDescending(testArray);
		printArrayOfNumbers(testArray);
		System.out.println();

		if(isPalindromeArray(testArray)==false) {
			System.out.println("false");
			
		} else {
			System.out.println("true");
		}
		

	}
	
	public static double averageArray(double[] input) {
		// Write a mehtod to find the average of elements in an array
		int lengthOfInput= input.length;
		double sumOfInput=0;
		for(int i=0; i<lengthOfInput; i++){
			sumOfInput=sumOfInput+input[i];
		}
		double average=sumOfInput/lengthOfInput;
		return average;
		
	}
		
	public static double standardDeviator(double[] input) {
		//Write method to find standard deviation of elements in an array
		//Feel free to use the averageArray method you wrote above to accomplish this task
		double averageOfInput=averageArray(input);
		double[] subtractedSquares = new double[input.length];
		for(int i=0; i<input.length; i++){
			subtractedSquares[i]=(input[i]-averageOfInput)*(input[i]-averageOfInput);
		}
		double averageOfSquaresInput=averageArray(subtractedSquares);
		double squareRoot=Math.sqrt(averageOfSquaresInput);
		return squareRoot;
		
	}
	
	public static void reverseArray(double[] input) {
		double[] tempArray=new double[input.length];
		for(int i=0; i<input.length; i++){
				tempArray[i]=input[input.length-1-i];
			
		}
		for(int i=0; i<input.length; i++){
			input[i]=tempArray[i];
		}
		
		//Write a method to reverse the elements in a given array
		
	}
	
	public static void sortArrayAscending(double[] testArray) {
		Arrays.sort(testArray);
		}
	
		
		//Sort Array from smallest to greatest
	
	
	public static void sortArrayDescending(double[] input) {
		Arrays.sort(input);
		reverseArray(input);
	}
	
	public static boolean isPalindromeArray(double[] input) {
		// Write a method to determine if elements in an array form a palindrome 
		// return true if they are and false if they aren't
		// an example of a palindromic array is this: {1,2,3,2,1}
		
		for(int i=0; i<input.length; i++){
			for(int j=input.length-1; j>=0; j--){
				if(input[i]!=input[j]) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	public static void printArrayOfNumbers(double[] input) {
		for(int i =0; i<input.length; i++){
			System.out.print(input[i]+" ");
		}
	}
	

}
