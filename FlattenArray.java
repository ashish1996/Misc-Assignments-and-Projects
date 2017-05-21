import java.util.ArrayList;
import java.util.Arrays;

public class FlattenArray {
	
	
	public static Object[] flatten(Object[] inputArray) {
		ArrayList<Object> list = new ArrayList<Object>();
		int lengthOfInput = inputArray.length;
		Object temp;
		Object temp2;
		Object temp3;
		for(int i =0; i<lengthOfInput; i++) {
			
			if(inputArray[i] == null) {
				temp= null;
			} else if(isArray(inputArray[i])==true) {
				Object[] newArray = (Object[]) (inputArray[i]);
				Object[] newFlattenedArray = flatten(newArray);
				if(newFlattenedArray.length == 0){
					temp2 = newFlattenedArray;
				}else{
				int lengthOfInternalArray = newFlattenedArray.length;
				for(int j=0; j<lengthOfInternalArray; j++) {
					if(newFlattenedArray[j] == null) {
						temp3 = newFlattenedArray[j]; 
					}else{
				
					list.add(newFlattenedArray[j]);
					}
				}
				}	
			}else {
				list.add(inputArray[i]);
			}
		}
		
		return list.toArray();
		
	}
	
	
	public static boolean isArray(Object input) {
		
		if(input instanceof Object[]) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {

		Object[] nullArray = {null};
		Object[] arrayInArray = {8,7,9};
		Object[] emptyArray={};
		Object[] arrayInArrayInArray= { arrayInArray, nullArray,1,2,3};
		Object[] stringArray= {'a','b','c'};
		Object[] manyArraysInArrays= { arrayInArray, arrayInArrayInArray, 4, 5, 6, stringArray};


		Object[] testArray1 = {4,5,6,nullArray, emptyArray, 5,6,arrayInArray, 8, 9, stringArray};
		Object[] testArraySolution1 = {4,5,6,5,6,8,7,9,8,9, 'a','b','c'};
		Object [] returnArray1 = flatten(testArray1);
	
		
		if(Arrays.equals(returnArray1, testArraySolution1)==true){
		System.out.println("Test Case 1 flatten works!");
		}else{
			System.out.println("Test Case 1 flatten does not work!");
		}

		Object[] testArray2 = {arrayInArrayInArray};
		Object[] testArraySolution2 = {8,7,9,1,2,3};
		Object[] returnArray2 = flatten(testArray2);
		
		
		if(Arrays.equals(returnArray2, testArraySolution2)==true){
		System.out.println("Test Case 2 flatten works!");
		}else{
			System.out.println("Test Case 2 flatten does not work!");

		}
		Object[] testArray3 = {nullArray,arrayInArray,stringArray,100,5000,8};
		Object[] testArraySolution3 = {8,7,9,'a','b','c',100,5000,8};
		Object[] returnArray3 = flatten(testArray3);
	
		
		if(Arrays.equals(returnArray3, testArraySolution3)==true){
		System.out.println("Test Case 3 flatten works!");
		}else{
		System.out.println("Test Case 3 flatten does not work!");


		}
		Object[] testArray4 = {nullArray,nullArray,stringArray,100,5000,8};
		Object[] testArraySolution4 = {'a','b','c',100,5000,8};
		Object[] returnArray4 = flatten(testArray4);
		
		
		if(Arrays.equals(returnArray4, testArraySolution4)==true){
		System.out.println("Test Case 4 flatten works!");
		}else{
		System.out.println("Test Case 4 flatten does not work!");
		}
		
		Object[] testArray5 = {arrayInArray,arrayInArray,stringArray,200,2100,22};
		Object[] testArraySolution5 = {8,7,9,8,7,9,'a','b','c',200,2100,22};
		Object[] returnArray5 = flatten(testArray5);
		
		
		if(Arrays.equals(returnArray5, testArraySolution5)==true){
		System.out.println("Test Case 5 flatten works!");
		}else{
		System.out.println("Test Case 5 flatten does not work!");
		}
		
		Object[] testArray6 = {nullArray,nullArray,nullArray};
		Object[] testArraySolution6 = {};
		Object[] returnArray6 = flatten(testArray6);
		
		
		if(Arrays.equals(returnArray6, testArraySolution6)==true){
		System.out.println("Test Case 6 flatten works!");
		}else{
		System.out.println("Test Case 6 flatten does not work!");
		}
		
		Object[] testArray7 = {stringArray,2400,587,100};
		Object[] testArraySolution7 = {'a','b','c',2400,587,100};
		Object[] returnArray7 = flatten(testArray7);
		
		
		if(Arrays.equals(returnArray7, testArraySolution7)==true){
		System.out.println("Test Case 7 flatten works!");
		}else{
		System.out.println("Test Case 7 flatten does not work!");
		}
		
		Object[] testArray8 = {manyArraysInArrays, arrayInArrayInArray, nullArray,5,6,7};
		Object[] testArraySolution8 = {8,7,9,8,7,9,1,2,3,4,5,6,'a','b','c',8,7,9,1,2,3,5,6,7};
		Object[] returnArray8 = flatten(testArray8);
		
		
		if(Arrays.equals(returnArray8, testArraySolution8)==true){
		System.out.println("Test Case 8 flatten works!");
		}else{
		System.out.println("Test Case 8 flatten does not work!");
	}
}
}

