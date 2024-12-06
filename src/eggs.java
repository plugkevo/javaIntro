public class eggs {
    public static void main(String[] args) {
        int numberofEggs = 25;

        Total(numberofEggs);

    }
    public static  void Total(int NoOfEggs){
        int div = NoOfEggs/12;
        int rem = NoOfEggs%12;


        System.out.println("The eggs in dozens: " + div + " The remeinder: " + rem);


    }
}
