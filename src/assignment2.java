interface add{
    static int addition( int num1, int num2){
        return num1 + num2;
    }
}

public class assignment2 {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 =33;

        int sum = add.addition(num1,num2);

        System.out.println("The sum is " + sum);
    }

}
