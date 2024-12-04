public class ArrayExample {
    public static void main(String[] args) {
        int rows = 3; // Number of rows in the array
        int cols = 3; // Number of columns in the array

        // Initialize a 2D array
        int[][] array = new int[rows][cols];

        // Fill the array with sample values (e.g., row index + column index)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = i + j; // Example: Sum of row and column indices
            }
        }

        // Print the array
        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " "); // Print each element
            }
            System.out.println(); // Move to the next row
        }
    }
}
