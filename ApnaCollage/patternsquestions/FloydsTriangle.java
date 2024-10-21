package patternsquestions;

import java.util.Scanner;

public class FloydsTriangle {
    private static void printRow(int rowNum) {
        int count = 0;
        for (int i = 1; i <= rowNum; i++) {
            count = colPrint(i, count);
            System.out.println();
        }
    }

    private static int colPrint(int i, int count) {
        // int cnt;
        for (int j = 1; j <= i; j++) {
            count ++;
            System.out.print(count+" ");
        }
        return count;
    }

    private static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowNum = getInput(scanner);

        printRow(rowNum);
        scanner.close();
    }
}
