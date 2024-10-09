import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the row number : ");
        int rows = scanner.nextInt();
        // System.out.print("Enter the column number : ");
        // int columns = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the character : ");
        String symbolString = scanner.nextLine();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbolString);
            }
            System.out.println();
        }
        scanner.close();
    }
}
