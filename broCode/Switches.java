import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today : ");
        String dayString = scanner.nextLine();

        switch (dayString) {
            case "friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday": 
                System.out.println("Today is Saturday");
                break;
        
            default:
                System.out.println("Today is class day");
                break;
        }

        scanner.close();
    }
}
