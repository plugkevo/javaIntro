import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a binary string
        System.out.print("Enter a binary string: ");
        String binaryString = scanner.nextLine();

        try {
            // Convert binary string to decimal integer
            int decimal = Integer.parseInt(binaryString, 2);

            // Display the result
            System.out.println("The decimal equivalent of binary " + binaryString + " is " + decimal);
        } catch (NumberFormatException e) {
            // Handle invalid binary string input
            System.out.println("Invalid binary string. Please enter a valid binary number (e.g., 1010).");
        }

        scanner.close(); // Close the scanner
    }
}
