import java.util.Scanner;

public class forloop {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");
        int i = 0;

        for(i= input.nextInt(); i<=10; i++)

        System.out.println(i);

    }
}