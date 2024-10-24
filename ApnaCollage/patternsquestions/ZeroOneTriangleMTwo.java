package patternsquestions;

import java.util.Scanner;

public class ZeroOneTriangleMTwo {
        private static void printRow(int num) {
        for (int i = 1; i <= num; i++) {
            colPrint(i);
            System.out.println();
        }
    }

    private static void colPrint(int i) {
        for (int j = 1; j <= i; j++) {
            int num = (i + j) % 2 == 0 ? 0 : 1;
            if (num == 0) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0+ " ");
            }

        }
    }

    private static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // getInput(scanner);
        printRow(getInput(scanner));
        scanner.close();
    }
}
