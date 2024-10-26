package advancedpatternquestions;

import java.util.Scanner;

public class ButterflyPattern {
    private static void printSpace (int count) {
        for (int j = 0; j < count; j++) {
            System.out.print(" ");
        }
    }
    private static void printStars(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
    }
    private static void printLowerHalf(int i) {
        for (int j = i; j > 0; j--) {
            printStars(j);
            printSpace(2*(i - j));
            printStars(j);
            System.out.println();
        }
    }
    private static void printTopHalf(int number) {
        for (int i = 1; i <= number; i++) {
            printStars(i);
            printSpace((2 * (number - i)));
            printStars(i);
            System.out.println();
        }
    }
    
    public static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getInput(scanner);
        printTopHalf(number);
        printLowerHalf(number);
        scanner.close();
    }
}
