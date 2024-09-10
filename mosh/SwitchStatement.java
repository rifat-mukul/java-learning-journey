import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your role : ");
        String role = scanner.next();
        // String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You are an admin");
                break;
            case "modarator":
                System.out.println("You are a modaretor");
                break;
        
            default:
            System.out.println("You are guest");
                break;
        }
        scanner.close();
    }
}
