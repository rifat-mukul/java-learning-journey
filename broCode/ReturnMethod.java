public class ReturnMethod {
    public static void main(String[] args) {
        int x = 3;
        int y = 10;
        int z = add(x, y);
        System.out.println(z);
        System.out.println(mult(x, y));
    }

    static int add (int x, int y) {
        int z = x + y;
        return z;
    }

    static int mult (int x, int y) {
        return x * y;
    }
}
