/* Instructions 
This assignment requires you to make use of a Scanner object. 
You can read the documentation for Scanner here: http://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
A Scanner object is associated with a source of input. In our case, this will be keyboard input from the console. 
By default, Scanner will parse the input as whitespace separated tokens and provides methods for parsing the next 
available token as a particular type. For example, the method next() will retrieve the next token as a String. 
Similarly, the method nextInt() interprets the next token as an integer while nextDouble() will interpret 
the next token as a double value. For this assignment, you shouldn't have to use any Scanner methods other than 
next(), nextInt(), and nextDouble().


For this assignment, you can assume that the input will always be valid and conform to the description below. 
In other words, you do not have to worry about validating the input or being able to deal with unexpected input.


Write a program to accomplish the following task. 
This program reads in data that represents grade components for a set of students and computes 
the letter grade that they should receive. The first line of input will be an integer greater than 0 
indicating the number of students in the class. Following this will be one line of input for each student 
in the following form:

First_Name Last_Name Assignment_Grade Recitation_Grade Midterm_1 Midterm_2 Final_Exam

First_Name and Last_Name are single word tokens that represent the first and last name of a student. 
All of the other entries on the line will be double values between 0.0 and 4.0.

To calculate the letter grade of each student, you should first calculate a weighted average (WA) of the grade 
components as specified in our syllabus (i.e., 40% assignment, 10% recitation, 15% for each midterm, 
20% final), and then you should map that value to a letter grade as follows:

Weighted Average	Letter Grade
WA >= 3.85	A
3.5 <= WA < 3.85	A-
3.15 <= WA < 3.5	B+
2.85 <= WA < 3.15	B
2.5 <= WA < 2.85	B-
2.15 <= WA < 2.5	C+
1.85 <= WA < 2.15	C
1.5 <= WA < 1.85	C-
1.15 <= WA < 1.5	D+
0.85 <= WA < 1.15	D
WA < 0.85	F
For each student, you should print one line of output in the following form:

F. Last_Name Grade

Where F. represents the first letter initial of the first name for the student. 
For example, if the input to your program was this:

3
Carrie Brownstein 3.5 4.0 3.2 3.7 3.5
Corin Tucker 3.8 3.8 3.1 2.5 3.6
Janet Weiss 2.1 2.2 1.5 1.8 2.0

Your program should produce the following output:

C. Brownstein A-
C. Tucker B+
J. Weiss C
 
 * 
 * */

import java.util.Scanner;

public class Assignment2 {

	// Do not change the main method.	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		process(s);
	}
	
	public static void process(Scanner s) {
		//Put your code here
		
		int numberOfStudents = s.nextInt();
		for(int i = 0; i<numberOfStudents; i++) {
		
		String firstName = s.next();
		String firstInitial = firstName.substring(0,1);
		String lastName = s.next();
		double assignmentGrade = s.nextDouble();
		double recitationGrade = s.nextDouble();
		double midterm1 = s.nextDouble();
		double midterm2 = s.nextDouble();
		double finalExam = s.nextDouble();
		double finalGrade = (assignmentGrade*0.4) + (recitationGrade*0.1) + (midterm1*.15) + (midterm2*.15) + (finalExam*0.2);
		
		gradePrinter(firstInitial, lastName, finalGrade);
		
		}
		
		
		
	}
	
	public static void gradePrinter(String firstInitial, String lastName, double finalGrade ) {
		if (finalGrade>=3.85) {
			System.out.println(firstInitial+". "+ lastName + " " + "A");
		} else if (finalGrade>=3.5 && finalGrade<3.85) {
			System.out.println(firstInitial+". "+ lastName + " " + "A-");
		} else if (finalGrade>=3.15 && finalGrade<3.5) {
			System.out.println(firstInitial+". "+ lastName + " " + "B+");
		}else if (finalGrade>=2.85 && finalGrade<3.15) {
			System.out.println(firstInitial+". "+ lastName + " " + "B");
		}else if (finalGrade>=2.5 && finalGrade<2.85) {
			System.out.println(firstInitial+". "+ lastName + " " + "B-");
		}else if (finalGrade>=2.15 && finalGrade<2.5) {
			System.out.println(firstInitial+". "+ lastName + " " + "C+");
		}else if (finalGrade>=1.85 && finalGrade<2.15) {
			System.out.println(firstInitial+". "+ lastName + " " + "C");
		}else if (finalGrade>=1.5 && finalGrade<1.85) {
			System.out.println(firstInitial+". "+ lastName + " " + "C-");
		}else if (finalGrade>=1.15 && finalGrade<1.5) {
			System.out.println(firstInitial+". "+ lastName + " " + "D+");
		}else if (finalGrade>=0.85 && finalGrade<1.15) {
			System.out.println(firstInitial+". "+ lastName + " " + "D");
		}else {
			System.out.println(firstInitial+". "+ lastName + " " + "F");
		}
		
		}
		
		
	}
	
	
	
	