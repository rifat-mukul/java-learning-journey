import java.util.Scanner;

public class Convertor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which tempareture you want to provide. Enter its first letter : ");
        String chaString = scanner.nextLine().toLowerCase();

        if (chaString.equals("c")) {
            celsius(scanner);
        } else if (chaString.equals("f")) {
            fahrenheit(scanner);
        }
        scanner.close();
        
    }
    static void celsius(Scanner scanner) {
        System.out.print("enter celcius temparute : ");
        double tempareture = scanner.nextDouble();
        System.out.printf("The tempareture is %.2fF farenheit%n", (tempareture * (9.0/5.0)) + 32);
        System.out.printf("The tempareture is %.2fk kelvin%n", (tempareture + 273.15));
        
        }

    static void fahrenheit(Scanner scanner) {
        System.out.print("Enter your fahrenheit tempareture : ");
        double tempareture = scanner.nextDouble();
        System.out.printf("The tempareture is %.2fF celcius%n", ((5.0/9.0)*(tempareture - 32)));
        System.out.printf("The tempareture is %.2fk kelvin%n", ((5.0/9.0)*(tempareture + 495.67)));
    }
}