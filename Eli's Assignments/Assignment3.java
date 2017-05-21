/*
 * For this program, the input again represents a COMP 401 gradebook and you will calculate grades, 
 * but the format of the input is a bit different and you will have to calculate the homework and recitation components from raw scores.

The first line of input will be an integer greater than 0 that indicates the total number of assignments in the course. 
The next line of input will have a list of integers that indicate the total number of points each assignment is worth. 
Following this, will be a line with an integer greater than 0 indicating the number of students in the class followed by a 
line for each student in the following form:

First_Name Last_Name #_of_Recitations A1_Points ... AN_Points Midterm_1 Midterm_2 Final_Exam
The #_of_Recitations entry will be an integer between 0 and 15 indicating the number of recitations that the student attended. 
The entries A1_Points ... AN_Points will be double values that indicate the number of points the student received for each assignment. 
Remember that you do not need to validate these values and can assume that the value given will be in the range from 0 to the 
maximum number of points for the assignment as indicated at the beginning of the input. The Midterm_1, Midterm_2, and Final_Exam 
entries will be between 0.0 and 4.0 as before.

To calculate a student's grade, you will need to first calculate the recitation and assignment components on a 4.0 scale 
and then calculate the weighted average of the recitation, assignment, midterm, final components as you did in A1 Novice.

Recitation and assignment component grades should be calculated as a percentage and then mapped to a 4.0 scale. The 
recitation percentage is simply the number of recitations attended divided by 15. The assignment percentage is simply 
the sum of the points earned across all assignments divided by the total number of assignment points possible. To convert 
these percentages into a 4.0 scale, use the following mapping (the same as I showed on the first day of class):

Percentage	4.0 Scale
>= 95%	4.0
90%	3.5
80%	2.5
70%	1.5
<= 40%	0.0
A percentage that is in between these points should be interpolated linearly. For example, 85% should be mapped to 3.0 and 
similarly 55% would be mapped to 0.75.

Your program should produce output in the same form as before in A1 Novice.

Example input:

5
5 10 10 10 25
3
Carrie Brownstein 10 5 7 8.5 10 21 3.2 2.7 3.4
Corin Tucker 15 0 10 10 8 20 2.2 2.8 3.5
Janet Weiss 12 4 9 9.5 7.5 22.5 3.8 3.5 3.6

Corresponding output:

C. Brownstein B
C. Tucker B
J. Weiss B+

 * 
 * 
 */
import java.util.Scanner;

public class Assignment3 {

	// Do not change the main method.	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		process(s);
	}

	public static void process(Scanner s) {
		//Put your code here


		int numberOfAssignments = s.nextInt();
		int totalAssignmentPoints = 0;
		for(int i = 0; i<numberOfAssignments; i++) {

			totalAssignmentPoints = totalAssignmentPoints +s.nextInt();

		}

		int numberOfStudents = s.nextInt();
		for(int i = 0; i<numberOfStudents; i++) {

			String firstName = s.next();
			String Last_Name = s.next();		
			int recitationsAttended = s.nextInt();
			double scaledRecitationValue= (recitationsAttended/15)*4.0;

			double totalAssignmentPointsEarned=0;
			for(int j = 0; j<numberOfAssignments; j++) {
				totalAssignmentPointsEarned = totalAssignmentPointsEarned +s.nextDouble();
			}

			double scaledAssignmentGrade = (totalAssignmentPointsEarned/totalAssignmentPoints)*4.0;

			double midterm1Points = s.nextDouble();
			double midterm2Points = s.nextDouble();
			double finalsPoints = s.nextDouble();		
			//double weightedAverage = ((recitationsAttended/15)+(assignmentPoints/assignmentsWorth)+midterm1Points+midterm2Points+finalsPoints);
			double finalGrade =	(scaledAssignmentGrade*0.4)+(scaledRecitationValue*0.1)+(midterm1Points*0.15)+(midterm2Points*0.15)+(finalsPoints*0.2);
			if (finalGrade>=3.85) {
				System.out.println(firstName+" "+ Last_Name+" " + "A");
			} else if (finalGrade>=3.5 && finalGrade<3.85) {
				System.out.println(firstName+" "+ Last_Name+" " + "A-");
			}
			else if (finalGrade>=3.15 && finalGrade<3.5) {
				System.out.println(firstName+" "+ Last_Name+" " + "B+");
			}
			else if (finalGrade>=2.85 && finalGrade<3.15) {
				System.out.println(firstName+" "+ Last_Name+" " + "B");
			}
			else if (finalGrade>=2.5 && finalGrade<2.85) {
				System.out.println(firstName+" "+ Last_Name+" " + "B-");
			}
			else if (finalGrade>=2.15 && finalGrade<2.5) {
				System.out.println(firstName+" "+ Last_Name+" " + "C+");
			}
			else if (finalGrade>=1.85 && finalGrade<2.5) {
				System.out.println(firstName+" "+ Last_Name+" " + "C");
			}
			else if (finalGrade>=1.5 && finalGrade<1.85) {
				System.out.println(firstName+" "+ Last_Name+" " + "C-");
			}
			else if (finalGrade>=1.15 && finalGrade<1.5) {
				System.out.println(firstName+" "+ Last_Name+" " + "D+");
			}
			else if (finalGrade>=0.85 && finalGrade<1.15) {
				System.out.println(firstName+" "+ Last_Name+" " + "D");
			}
			else  {
				System.out.println(firstName+" "+ Last_Name+" " + "F");
			}
		}

	}

}

		
