/*
 * For this final program, the input will be in the same format as A1 Adept except that the midterm and 
 * final exam scores will be given as raw integer scores. This means you will have to convert those raw 
 * scores into a 4.0 scale grade by calculating the appropriate exam curve.

To calculate the curve for an exam, first calculate the average and standard deviation for that exam. 
Here is a web page the explains how to calculate a standard deviation:

https://www.mathsisfun.com/data/standard-deviation-formulas.html

To calculate a square root, use the Math.sqrt() method.

Once you have the average and standard deviation, you can calculate a "normalized" score for each 
student using the following formula:

Normalized = (Raw - Average) / StdDev
Now use the following mapping to convert the normalized score to a curved 4.0 scale:

Normalized	Curved 4.0
>= 1.0	4.0
0.0	3.0
-1.0	2.0
-1.5	1.0
<= -2.0	0.0
Again, in between values should be interpolated linearly.

For output, instead of printing the name and grade of each student, print out the number of students 
that received each letter grade as per the example below.

Example input:

5
5 10 10 10 25
5
Carrie Brownstein 10 5 7 8.5 10 21 68 75 94
Corin Tucker 15 0 10 10 8 20 80 77 90
Janet Weiss 12 4 9 9.5 7.5 22.5 64 76 50
Polly Perfect 15 5 10 10 10 25 90 100 100
Frank Failure 5 5 5 5 5 5 40 50 50

Example output:

A : 1
A-: 0
B+: 0
B : 2
B-: 1
C+: 0
C : 0
C-: 0
D+: 0
D : 0
F : 1


Hints

This is easiest to do by creating an array for each of the different grade components
 (recitation, assignment, raw midterm 1, raw midterm 2, and raw final exam) with each 
 student represented by a different index (i.e., 0 is the first student, 1 is the second student, etc.)

As you read in the input, calculate the recitation and assignment components as you did in the previous assignment
 and store them in the corresponding array while storing the raw midterm and final scores in their corresponding arrays.

Once you have processed all of the input, go back and calculate the average and standard deviation for the
 midterms and final from the values in those arrays. Now you can go back through one more time and for 
 each student calculate the curved exam scores using the average and std. deviation and combine that 
 with the assignment and recitation components in order to arrive at a letter grade for each student. 
 As you do so, keep track of the total number of each letter grade so that you can produce your output at the end.
 * 
 * 
 */


import java.util.Scanner;

public class Assignment4 {

	// Do not change the main method.	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		process(s);

	}

	public static void process(Scanner s) {
		// Put your code here.
		
		
	}
}