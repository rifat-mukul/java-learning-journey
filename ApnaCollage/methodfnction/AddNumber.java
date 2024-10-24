package methodfnction;

import java.util.Scanner;

public class AddNumber {

    public static int calculateSum(int number1, int number2) {
        return number1+number2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int sum = calculateSum(number1, number2);

        System.out.println("the sum is : "+sum);
        scanner.close();
    }
}
