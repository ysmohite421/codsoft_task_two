import java.util.Scanner;

public class SGC {
	private int[] marks;
	private int totalMarks;
	private int totalSubjects;
	private double percentage;
	private String grade;
	private String gradeDiscription;
	private Scanner scanner;
	
	private void studentGradeCalculator() {
		totalMarks = 0;
		totalSubjects = 0;
		percentage = 0.0;
		
		scanner = new Scanner(System.in);
		
		int i;
		
		System.out.print("Enter total number of subjects : ");
		totalSubjects = scanner.nextInt();
		System.out.print("\n");
		
		marks = new int[totalSubjects];
		
		i = 0;
		while(i < totalSubjects) {
			System.out.print("Marks obtained in subject " + (i + 1) + " : ");
			marks[i] = scanner.nextInt();
			i++;
		}
		
		i = 0;
		while(i < totalSubjects) {
			totalMarks = totalMarks + marks[i];
			i++;
		}
		
		percentage = (double) totalMarks / totalSubjects;
		
		if(percentage > 69.99) {
			grade = "A+";
			gradeDiscription = "First Class with Distinction";
		}
		if((percentage > 59.99) && (percentage < 70.0)) {
			grade = "A";
			gradeDiscription = "First Class";
		}
		if((percentage > 49.99) && (percentage < 60.0)) {
			grade = "B";
			gradeDiscription = "Second Class";
		}
		if((percentage > 39.99) && (percentage < 50.0)) {
			grade = "C";
			gradeDiscription = "Third Class";
		}
		if(percentage < 40.0) {
			grade = "F";
			gradeDiscription = "Fail";
		}
		
		System.out.println("\nResult: \n");
		System.out.println("Total Marks : " + totalMarks);
		System.out.printf("Percentage : %.2f\n", percentage);
		System.out.println("Grade : " + grade);
		System.out.println("Grade Discription : " + gradeDiscription);
	}
	
	public static void main(String[] args) {
		SGC sgc = new SGC();
		sgc.studentGradeCalculator();
	}

}
