package week1;

import java.util.Scanner;

public class GradeAssignment {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their exam score
        System.out.print("Please enter your exam score: ");
        int score = scanner.nextInt();

        // Assign a letter grade based on the score
        String grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = "A (Excellent)";
                break;
            case 8:
                grade = "B (Very Good)";
                break;
            case 7:
                grade = "C (Good)";
                break;
            case 6:
                grade = "D (Satisfactory)";
                break;
            default:
                if (score >= 0 && score < 60) {
                    grade = "F (Fail)";
                } else {
                    grade = "Invalid score";
                }
                break;
        }

        // Print the grade
        System.out.println("Your grade is: " + grade);

        // Close the scanner
        scanner.close();
    }
}

