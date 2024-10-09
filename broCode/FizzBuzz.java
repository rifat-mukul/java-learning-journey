import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        // taking input from the user 
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        //condition
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

        scanner.close();
    }
}
