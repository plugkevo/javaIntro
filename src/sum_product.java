import java.util.Scanner;

public class sum_product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println("Sum is " + sum);
        System.out.println("product is " + product);
    }
}
