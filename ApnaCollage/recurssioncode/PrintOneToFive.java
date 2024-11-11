package recurssioncode;

public class PrintOneToFive {
    public static void printNumber(int num) {
        if (num == 6) {
            return;
        }
        System.out.println(num);
        printNumber(num + 1);
    }
    public static void main(String[] args) {
        printNumber(1);
    }
}
