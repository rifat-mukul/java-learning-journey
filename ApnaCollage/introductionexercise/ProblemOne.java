// Enter 3 numbers from the user & make a function to print their average

package introductionexercise;

import java.util.Scanner;

public class ProblemOne {

    public static float calculateAverage(int num1, int num2, int num3) {
        return ((num1 + num2 + num3) / 3);
    }

    public static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getInput(scanner);
        int num2 = getInput(scanner);
        int num3 = getInput(scanner);

        System.out.println("The avarage is : "+ calculateAverage(num1, num2, num3));

        scanner.close();
    }
}
