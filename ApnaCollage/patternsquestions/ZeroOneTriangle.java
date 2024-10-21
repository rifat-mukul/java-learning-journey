package patternsquestions;

import java.util.Scanner;

public class ZeroOneTriangle {

    private static void printRow(int num) {
        for (int i = 1; i <= num; i++) {
            // if (i % 2 == 0) {
            //     int st = 0;
            //     colPrint(st,i);
            // } else {
            //     int st = 1;
            //     colPrint(st, i);
            // }

            int st = i % 2 == 0 ? 0: 1;
            colPrint(st, i);
            System.out.println();
        }
    }

    private static void colPrint(int st, int i) {
        for (int j = 0; j < i; j++) {
            // if (st == 0) {
            //     if (j % 2 == 0) {
            //         System.out.print(st+" ");
            //     } else {
            //         System.out.print(st + 1+" ");
            //     }
            // } else {
            //     if (j % 2 == 0) {
            //         System.out.print(st+" ");
            //     } else {
            //         System.out.print(st - 1+" ");
            //     }
            // }

            System.out.print((st + j) % 2 + " ");

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
