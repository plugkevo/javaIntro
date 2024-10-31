import java.util.Scanner;

public class dowhile {
    public static void main(String[] args){
        int sum = 0;
        int number= 0;

        Scanner input=new Scanner(System.in);

        do{
            sum += number;
            System.out.println("enter a number");
            number = input.nextInt();

        }
        while(number >= 0);
        System.out.println("the sum is" + sum);
    }
}
//does sum of the numbers you had entered when you input a number less than 0
