package patternsquestions;

import java.util.Scanner;

public class InvertedHalfPyramidRotate {
    public static void printIHPR(int n) {
        for (int i = 0; i < n; i++) {
            colPrint(i, n);
            System.out.println();
        }
    }

    public static void colPrint(int i, int n) {
        for (int j = 0; j < n; j++) {

            if (j >= n - 1 - i && j < n) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            
        }
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }
    public static void main(String[] args) {
        int n = getInput();

        printIHPR(n);
    }
}
