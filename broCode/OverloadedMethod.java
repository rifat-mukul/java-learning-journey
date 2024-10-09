public class OverloadedMethod {
    public static void main(String[] args) {
        // Integer variables
        int intA = 10;
        int intB = 20;
        int intC = 30;
        int intD = 40;

        // Double variables
        double doubleA = 3.1;
        double doubleB = 3.3;
        double doubleC = 3.9;
        double doubleD = 4.1;

        // Integer method calls
        System.out.println(add(intA, intB));
        System.out.println(add(intA, intB, intC));
        System.out.println(add(intA, intB, intC, intD));

        // Double method calls
        System.out.println(add(doubleA, doubleB));
        System.out.println(add(doubleA, doubleB, doubleC));
        System.out.println(add(doubleA, doubleB, doubleC, doubleD));
    }

    // Overloaded methods for integers
    static int add(int a, int b) {
        System.out.println("This is overloaded method #1 for int");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2 for int");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3 for int");
        return a + b + c + d;
    }

    // Overloaded methods for doubles
    static double add(double a, double b) {
        System.out.println("This is overloaded method #1 for double");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method #2 for double");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #3 for double");
        return a + b + c + d;
    }
}
