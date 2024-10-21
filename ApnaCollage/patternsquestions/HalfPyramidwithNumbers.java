package patternsquestions;

import java.util.Scanner;

public class HalfPyramidwithNumbers {

    private static void printPyramid(int num) {
        for (int i = 1; i < num + 1; i++) {
            printRow(i);
            System.out.println();
        }
    }

    public static void printRow(int i) {
        for (int j = 1; j < i + 1; j++) {
            System.out.print(j+" ");
        }
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }
    public static void main(String[] args) {
        int num = getInput();

        printPyramid(num);
    }
}
