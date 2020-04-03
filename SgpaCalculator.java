import java.io.*;
import java.util.*;
public class SgpaCalculator {
	public static void main(String[] args) {
		System.out.println("This is a VTU GPA Calculator. Enter your subject name and credit score respectively,"
				+ " followed by the marks obtained by you. The program will return your desired SGPA.");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the total number of subjects including lab-");
		int n = s.nextInt();
		
		String subj[] = new String[n];
		int cred[] = new int[n];
		int marks[] = new int[n];
		int gradePoint[] = new int[n];
    int finalScore[] = new int[n];
    int gradeTotal=0;
    int totalCredit=0;
		
		for(int i=0;i<n;i++) {
			System.out.print("Subject Name " + (i+1) + ":");
			subj[i] = s.next();
			System.out.print("Credit Score: ");
			cred[i] = s.nextInt();
			System.out.print("Marks " + (i+1) + ":");
			marks[i] = s.nextInt();
			System.out.println("--------------------");
		}
		
		for(int i=0;i<n;i++) {
			if(marks[i] >= 90) 
				gradePoint[i] = 10;
			else if(marks[i] >= 80 && marks[i] < 90)
				gradePoint[i] = 9;
			else if(marks[i] >= 70 && marks[i] < 80)
				gradePoint[i] = 8;
			else if(marks[i] >= 60 && marks[i] < 70)
				gradePoint[i] = 7;
			else if(marks[i] >= 50 && marks[i] < 60)
				gradePoint[i] = 6;
			else if(marks[i] >= 45 && marks[i] < 50)
				gradePoint[i] = 5;
			else 
				gradePoint[i] = 0;		
		}
		
		for(int x: cred) {
			totalCredit += 10 * x;
		}
		
		for(int i=0;i<n;i++) {
			finalScore[i] = cred[i] * gradePoint[i];
		}
		
		for(int x:finalScore) {
			gradeTotal += x;
		}
		
		float sgpa = ((float)gradeTotal/(float)totalCredit) * 10;		
		System.out.printf("SGPA - %.2f", sgpa);
	}
}
