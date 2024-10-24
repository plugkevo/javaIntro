import java.util.Scanner;

public class elseif {
    public static void main(String[] args){

        Scanner read =new Scanner(System.in);

        System.out.println("Enter marks");

        int marks = read.nextInt();

        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=80){
            System.out.println("Grade B");
        }
        else if(marks>=70){
            System.out.println("Grade C");
        }
        else if(marks>=60){
            System.out.println("Grade D");
        }
        else if(marks>=50){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }

    }
}
