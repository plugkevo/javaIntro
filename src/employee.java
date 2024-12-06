import java.util.Scanner;

//Write a class named employee, that request an employee to enter the number of hours worked
//computes total payment using the following formula : (6 Marks)
//
//Totalpayment=hoursworked*1000.
//The program should displays results. For example
//Hours worked: 3
// Totalpayment : 3000
public class employee {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of hours worked");

        int hoursworked = scanner.nextInt();

        int Totalpayment = hoursworked * 1000;

        System.out.println("Hours worked: " + hoursworked);
        System.out.println("Total Payment: " + Totalpayment);
    }
}
