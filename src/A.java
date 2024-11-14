class X {
    public X(int i) {
        System.out.println("Parent Class.");
    }
}

class Y extends X {
    public Y() {
        super(10); // Call to superclass constructor with an integer argument
        System.out.println("Child Class.");
    }
}

public class A {
    public static void main(String[] args) {
        Y y = new Y();
    }
}
