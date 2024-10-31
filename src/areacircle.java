import java.util.Scanner;
public class areacircle {
    public static void main(String[] args) {
// Circle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius");

        double num1 = scanner.nextDouble();

        double totalarea = areafunc( num1);

        System.out.println("Area of the circle" + totalarea);

        //Rectangle
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length & width ");

        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int totalareaRec = areafunc(num2, num3);


        System.out.println("Area of the rectangle " + totalareaRec);
    }
    public static double areafunc(double num1){

        double calcarea =Math.PI * num1 * num1;
        return  calcarea;

    }
    public static int areafunc(int num1, int num2){

        int calcarea =num1 * num2;
        return  calcarea;

    }
}
