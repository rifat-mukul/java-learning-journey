import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueRunning = "yes";

        System.out.println("Welcome to the Even or Odd Checker!");

        while (continueRunning.equalsIgnoreCase("yes")) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }

            System.out.print("Do you want to check another number? (yes/no): ");
            continueRunning = scanner.next();
        }

        System.out.println("Thank you for using the Even or Odd Checker. Goodbye!");
        scanner.close();
    }
}
