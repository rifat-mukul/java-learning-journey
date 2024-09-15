import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age : ");
        double age = scanner.nextDouble();

        if (age < 10) {
            System.out.println("Your are a child");
        } else if (age <= 18) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are ready to vote");
        }
        scanner.close();
    }
    
}
