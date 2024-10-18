package patternsquestions;

import java.util.Scanner;

public class InvertedHalfPyramidMethod {

    public static void printIHP(int n) {
        for (int i = n; i > 0; i--) {
            rowPrint(i);
            System.out.println();
        }
    }

    public static void rowPrint(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
    }

    public static boolean validInput(int n) {
        return n > 0;
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        return n;
        
    }
    public static void main(String[] args) {
        int n = getInput();

        if (validInput(n)) {
            printIHP(n);
        }
    }
}
