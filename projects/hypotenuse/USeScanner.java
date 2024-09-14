import java.util.Scanner;

public class USeScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base : ");
        double base = Math.pow(scanner.nextDouble(), 2) ;
        System.out.print("Enter the height : ");
        double height = Math.pow(scanner.nextDouble(), 2) ;

        System.out.println(String.format("%.3f", Math.sqrt(base + height)));

        scanner.close();


    }
}
