//Write a program called GradesAverage, which prompts user for the number of students,
//reads it from the keyboard, and saves it in an int variable called numStudents. It then prompts
//user for the grades of each of the students and saves them in an int array called grades. Your
//program shall check that the grade is between 0 and 100.
import java.util.Scanner;

public class GradesAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of students
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        // Create an array to store the grades
        int[] marksArray = new int[numStudents];
        int total = 0;

        // Loop to input grades
        for (int i = 0; i < numStudents; i++) {
            while (true) {
                System.out.println("Enter grade for student " + (i + 1) + " (0-100):");
                int grade = scanner.nextInt();

                if (grade >= 0 && grade <= 100) {
                    marksArray[i] = grade; // Store the grade in the array
                    total += grade;       // Add the grade to the total
                    break;                // Exit the loop for valid input
                } else {
                    System.out.println("Invalid input. Please enter a grade between 0 and 100.");
                }
            }
        }

        // Display grades and their sum
        System.out.println("Grades entered are:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print(marksArray[i] + " ");
        }
        System.out.println("\nTotal of grades: " + total);

        // Calculate and display the average
        double average = (double) total / numStudents;
        System.out.printf("The average grade is: %.2f%n", average);

        scanner.close();
    }
}
