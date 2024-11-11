package recurssioncode;

public class PrintFiveToOne {
    public static void printNumber (int num) {
        if (num == 0) {
            return;
        } else {
            System.out.println(num);
            printNumber(num - 1);
        }
    }
    public static void main(String[] args) {
        printNumber(5);
    }
}
