import java.util.Scanner;

public class ifclass {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your age");

        int age = scanner.nextInt();

        if(age>18){
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are a child");
        }

    }
}
