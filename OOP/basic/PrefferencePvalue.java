package basic;
public class PrefferencePvalue {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;

        Integer num1 = 45;
        Integer num2 = 50;

        // System.out.println("a  " + a + "  b  " + b);
        // System.out.println("num1---->" + num1 + "    num2--------->" + num2);

        // swap(a, b);
        // swap(num1, num2);

        // System.out.println("a  " + a + "  b  " + b);
        // System.out.println("num1---->" + num1 + "    num2--------->" + num2);

        // Corrected for loop inside the main method
        A obj;
        for (int i = 0; i < 100; i++) {   // Corrected for loop
            obj = new A("Random object " + i);
        }
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int numx = 15;
    String namex;

    public A(String name) {
        this.namex = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
