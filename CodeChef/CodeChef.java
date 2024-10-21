import java.util.Scanner;

public class CodeChef {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            if (isEvenMultipleofSeven(n)) {
                System.out.println("Alice");
            } else if (isOddMultipleofNine(n)) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }

        scanner.close();
    }

    private static boolean isEvenMultipleofSeven(int num) {
        return num % 2 == 0 && num % 7 == 0;
    }

    private static boolean isOddMultipleofNine (int num) {
        return num % 2 != 0 && num % 9 == 0;
    }
}