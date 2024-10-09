import java.util.Scanner;

public class WhileName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameString = "";
        while (nameString.isBlank()) {
            System.out.print("Enter your name : ");
            nameString = scanner.nextLine();
        }

        String firsString = nameString.substring(0, 1);
        String remaString = nameString.substring(1,nameString.length());
        System.out.println("Hello " + firsString.toUpperCase() + remaString);

        scanner.close();
    }
}
