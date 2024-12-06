class Calculator {
    // Overloaded method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));         // Calls add(int, int)
        System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3)); // Calls add(int, int, int)
        System.out.println("Sum of 1.5 and 2.5: " + calc.add(1.5, 2.5)); // Calls add(double, double)
    }
}
