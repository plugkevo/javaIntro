import static java.lang.Math.max;

public class largestNumber {
    public static void main(String args[]) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 10;
        boolean largest;
        int large;
        int bigNo;

         largest=  num1 < num2;
        System.out.println(largest );

        largest=   num2 < num3;
        System.out.println(largest );

        large= max( num1, num3);
        System.out.println(large );

        bigNo = (num1<= num2 ) ? num2: num1 ;
        System.out.println("largest of these is " + bigNo);

        bigNo = (num2<= num3 ) ? num3: num2;
        System.out.println("largest of these is " + bigNo);









    }


    }



