import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of students
        int n = scanner.nextInt();

        // Process each student's grade
        for (int i = 0; i < n; i++) {
            int grade = scanner.nextInt();
            int roundedGrade = roundGrade(grade);
            System.out.println(roundedGrade);
        }

        scanner.close();  // Close the scanner
    }

    // Method to round the grade according to the given rules
    public static int roundGrade(int grade) {
        if (grade < 38) {
            return grade;  // No rounding if the grade is less than 38
        }

        int nextMultipleOf5 = ((grade / 5) + 1) * 5;  // Calculate the next multiple of 5
        if (nextMultipleOf5 - grade < 3) {
            return nextMultipleOf5;  // Round up to the next multiple of 5 if the difference is less than 3
        } else {
            return grade;  // Otherwise, no rounding
        }
    }
}
