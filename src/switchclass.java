import java.util.Scanner;

public class switchclass {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter marks");

        int marks = read.nextInt();

        switch (marks) {
            case 90:
                System.out.println("Grade A");

            case 80:
                System.out.println("Grade B");
            case 70:
                System.out.println("Grade C");
            case 60:
                System.out.println("Grade D");
            case 50:
                System.out.println("Grade E");
            default:
                System.out.println("Grade B");


        }
    }
}
