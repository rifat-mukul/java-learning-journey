import java.util.Scanner;

public class FizzBuzzSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking input 
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        // condition
        switch ((number % 5 == 0 ? 1 : 0)+( number % 3 == 0 ? 2 : 0)) {
            case 3:
                System.out.println("FizzBuzz");
                break;
            case 1: 
                System.out.println("Fizz");
                break;
            case 2:
                System.out.println("Buzz");
                break;
        
            default:
            System.out.println(number);
                break;
        }

        scanner.close();
    }
}
