package recurssioncode;

public class fibonacci {
    public static void printFib(int a, int b, int num) {
        if (num == 0) {
            return;
        }
            int c = a + b;
            System.out.println(c);
            printFib(b, c, num-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        printFib(a, b, 5); // print untith 7th term
    }
}
