public class binary {
    public static void main(String args[]){
        int a = 60;
        int b = 13;
        int c = 0;

        c =a & b;   /*12 = 0000 1100*/
        System.out.println("a & b = "+c);

        c = a | b;  /*61 = 0011 1101*/
        System.out.println("a | b =" + c);

        c = a ^ b;
        System.out.println("a ^ b =" + c);

        c = ~a;
        System.out.println("~a =" + c);

        c = a << 2;
        System.out.println("a << b =" + c);

        c = a >> 2;
        System.out.println("a >> b =" + c);

        c = a >>> 2;
        System.out.println("a >>> b =" + c);
    }
}
