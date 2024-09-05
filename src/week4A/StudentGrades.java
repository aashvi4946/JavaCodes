package week4A;

import java.util.Arrays;
import java.util.Random;

public class StudentGrades {
    public static void main(String[] args) {
        int[] grades = new int[30];
        Random rand = new Random();
        for (int i = 0; i < grades.length; i++) {
            grades[i] = rand.nextInt(101);
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.length;
        System.out.println("Average grade: " + average);
        int highest = grades[0];
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        Arrays.sort(grades);
        System.out.println("Top 5 grades:");
        for (int i = grades.length - 1; i >= grades.length - 5; i--) {
            System.out.println(grades[i]);
        }
    }
}
