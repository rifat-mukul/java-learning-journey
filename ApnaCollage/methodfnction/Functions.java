package methodfnction;

import java.util.Scanner;

public class Functions {

    public static void printMyName (String name) {
        System.out.println("My name is "+ name);
        return;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.next();
        printMyName(name);

        scanner.close();
    }
}
