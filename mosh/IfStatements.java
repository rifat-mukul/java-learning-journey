import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter todays temperature : ");
        int temperature = scanner.nextInt();

        // int temperature = 32;
        if (temperature > 30) {
            System.out.println("its a hot day");
            System.out.println("Drink enough Water");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("its a beautiful day");
        } else {
            System.out.println("cold day");
        }

        scanner.close();
    }
}
