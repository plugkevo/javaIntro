import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.print("Digits in reverse order: ");
        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Print the digit
            System.out.print(digit + " ");

            // Remove the last digit
            number /= 10;
        }
        scanner.close(); // Close the scanner
    }
}

