import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();

       int randomNumber = random.nextInt(100) + 1;

       int maxTry = 5;
       int i = 1;
       
       while (i <= maxTry) {
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        if (randomNumber == number) {
            System.out.println("Congratulation your guess is right");
        } else {
            System.out.printf("Enter new number. you still have %d chances%n", maxTry-i);
        }

        i++;
       }
       scanner.close();
    }
}