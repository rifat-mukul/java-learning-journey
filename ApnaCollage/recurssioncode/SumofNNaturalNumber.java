package recurssioncode;

public class SumofNNaturalNumber {
    public static void printNumber (int i, int n, int sum) {
        if (i == n) {
            System.out.println(sum + i);
            return;
        }
        sum += i;
        printNumber(i+1, n, sum);
    }
    public static void main(String[] args) {
        printNumber(1, 5, 0);
    }
}
