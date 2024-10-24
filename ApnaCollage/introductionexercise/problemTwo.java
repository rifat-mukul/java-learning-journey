// Write a function to print the sum of all odd numbers from 1 to n.

package introductionexercise;

import java.util.Scanner;

public class problemTwo {

    public static int calculateOdd(int n) {
        int sum = 0;
        int i = 1;

        while (i <= n) {
            if (i%2!=0) {
                sum += i;
            }
            i ++;
        }

        return sum;
    }

    public static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The sum of odd number is : "+ calculateOdd(getInput(scanner)));
        scanner.close();
    }
}
