import java.util.Scanner;

//Write a method called printArray(), which takes an int array and print its contents in the form
//of {a1, a2, ..., an}
import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.println("Enter the number of elements:");
        int size = scanner.nextInt();

        int[] numberArray = new int[size];

        // Populate the array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number for element " + (i + 1) + ":");
            numberArray[i] = scanner.nextInt();
        }

        // Call the method to print the array
        printArray(numberArray);

        scanner.close();
    }

    // Method to print the array in {a1, a2, ..., an} format
    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", "); // Add comma between elements
            }
        }
        System.out.println("}");
    }
}
