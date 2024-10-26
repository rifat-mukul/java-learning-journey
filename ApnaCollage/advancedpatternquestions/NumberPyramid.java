package advancedpatternquestions;

import java.util.Scanner;

public class NumberPyramid {
    private static void printNumber(int i, int rowNumber) {
        for (int j = 1; j <= i; j++) {
            if (j < i) {
                System.out.print(i);
                System.out.print(" ");
            } else {
                System.out.print(i);
            }
            
        }
    }
    private static void printSpace(int i, int rowNumber) {
        for (int j = 0; j < rowNumber - i; j++) {
            System.out.print(" ");
        }
    }
    private static void printNumberPyramid(int rowNumber) {
        for (int i = 1; i <= rowNumber; i++) {
            printSpace(i, rowNumber);
            printNumber(i, rowNumber);
            printSpace(i, rowNumber);
            System.out.println();
        }
    }
    private static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printNumberPyramid(getInput(scanner));
        scanner.close();
    }
}
