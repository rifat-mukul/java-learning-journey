package advancedpatternquestions;

import java.util.Scanner;

public class PalindromicPattern {
    private static void printSecondHalf (int i) {
        for (int j = 2; j <= i; j++) {
            if (j == i) {
                System.out.print(j);
            } else {
                System.out.print(j);
                System.out.print(" ");
            }
        }
    }
    private static void printFirstHalf(int i) {
        for (int j = i; j > 0; j--) {
            System.out.print(j);
            System.out.print(" ");
        }
    }
    private static void printNumber (int i) {
        if (i == 1) {
            System.out.print(i);
        } else {
            printFirstHalf(i);
            printSecondHalf(i);
        }
    }
    private static void printSpace (int i, int rowNumber) {
        for (int j = 0; j < 2 *(rowNumber - i); j++) {
            System.out.print(" ");
        }
    }
    private static void printPalindromicPattern (int rowNumber) {
        for (int i = 1; i <= rowNumber; i++) {
            printSpace(i, rowNumber);
            printNumber(i);
            printSpace(i, rowNumber);
            System.out.println();
        }
    }
    private static int getInput (Scanner scanner) {
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printPalindromicPattern(getInput(scanner));
        scanner.close();
    }
}
