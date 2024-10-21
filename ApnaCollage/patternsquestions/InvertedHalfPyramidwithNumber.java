package patternsquestions;

import java.util.Scanner;

public class InvertedHalfPyramidwithNumber {    

    private static void printPyramid(int num) {
        for (int i = 0; i < num; i++) {
            printRow(i, num);
            System.out.println();
        }
    }

    public static void printRow(int i, int num) {
        for (int j = 1; j <= num - i; j++) {
            System.out.print(j+" ");
        }
    }

    public static int getInput(Scanner scanner) {
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = getInput(scanner);

        printPyramid(num);
        scanner.close();
    }
}
