package introductionexercise;

import java.util.Scanner;

public class ProblemNine {

    public static void calculateGCD (int num1, int num2) {
        // brute-force approach
        // int i = 1;
        // int gcdVal = 0;
        // while (i <= num1 && i <= num2) {
        //     if (num1 % i == 0 && num2 % i == 0) {
        //         gcdVal = i;
        //     }
        //     i ++;
        // }

        // System.out.println("the gcd is : "+gcdVal);

        // Euclid's Algorithm for GCD
        if (num1 > num2) {
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp; 
            }
            System.out.println("the gcd is : "+num1);
        } else {
            while (num1 != 0) {
                int temp = num1;
                num1 = num2 % num1;
                num2 = temp; 
            }
            System.out.println("the gcd is : "+num2);
        }
    }

    public static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getInput(scanner);
        int num2 = getInput(scanner);

        calculateGCD(num1, num2);

        scanner.close();
    }
}
