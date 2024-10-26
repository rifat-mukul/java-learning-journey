package advancedpatternquestions;

import java.util.Scanner;

public class DimondPattern {
    private static void printSecondHalf(int i) {
        for (int j = 2; j <= i; j++) {
            if (j == i) {
                System.out.print("*");
            } else {
                System.out.print("*");
                System.out.print(" ");
            }
        }
    }
    private static void printFirstHalf(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
            System.out.print(" ");
        }
    }
    private static void printStar(int i, int rowNumber) {
        if (i == 1) {
            System.out.print("*");
        } else {
            printFirstHalf(i);
            printSecondHalf(i);
        }
    }
    private static void printSpace(int i, int rowNumber) {
        for (int j = 0; j < 2*(rowNumber - i); j++) {
            System.out.print(" ");
        }
    }
    private static void printDimondPattern (int rowNumber) {
        for (int i = 1; i <= rowNumber; i++) {
            printSpace(i, rowNumber);
            printStar(i, rowNumber);
            System.out.println();
        }
        for (int i = rowNumber; i >= 1; i--) {
            printSpace(i, rowNumber);
            printStar(i, rowNumber);
            System.out.println();
        }
    }
    private static int getInput ( Scanner scanner) {
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printDimondPattern(getInput(scanner));
        scanner.close();
    }
}
