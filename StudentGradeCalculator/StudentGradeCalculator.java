package CodSoft;

import java.util.Scanner;

public class StudentGradeCalculator {
	
	
	
	

	    // Method to calculate total marks
	    public static int calculateTotalMarks(int[] marks) {
	        int total = 0;
	        for (int mark : marks) {
	            total += mark;
	        }
	        return total;
	    }

	    // Method to calculate average percentage
	    public static double calculateAveragePercentage(int totalMarks, int numSubjects) {
	        return (double) totalMarks / numSubjects;
	    }

	    // Method to assign grade based on average percentage
	    public static String assignGrade(double averagePercentage) {
	        if (averagePercentage >= 90) {
	            return "A";
	        } else if (averagePercentage >= 80) {
	            return "B";
	        } else if (averagePercentage >= 70) {
	            return "C";
	        } else if (averagePercentage >= 60) {
	            return "D";
	        } else {
	            return "F";
	        }
	    }

	    // Method to display results
	    public static void displayResults(int totalMarks, double averagePercentage, String grade) {
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
	        System.out.println("Grade: " + grade);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number of subjects
	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = scanner.nextInt();

	        // Input marks for each subject
	        int[] marks = new int[numSubjects];
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
	            marks[i] = scanner.nextInt();
	        }

	        // Calculate total marks, average percentage, and grade
	        int totalMarks = calculateTotalMarks(marks);
	        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);
	        String grade = assignGrade(averagePercentage);

	        // Display the results
	        displayResults(totalMarks, averagePercentage, grade);

	        scanner.close();
	    }
	}

	


