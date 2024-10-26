package advancedpatternquestions;

import java.util.Scanner;

public class SolidRhombus {
    public static void printStar(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
    public static void printSpace (int i, int num) {
        for (int j = 0; j < num - i; j++) {
            System.out.print(" ");
        }
    }
    public static void printPattern (int num) {
        for (int i = 1; i <= num; i++) {
            printSpace(i, num);
            printStar(num);
            System.out.println(); 
        }
    }
    public static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printPattern(getInput(scanner));
        scanner.close();
    }
}
