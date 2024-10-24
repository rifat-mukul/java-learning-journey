package methodfnction;

import java.util.Scanner;

public class Factorial {

    public static int calculateFectorial(int number) {
        int fact = 1;

        while (number > 0) {
            fact*= number;
            number -= 1;
        }
        return fact;
    }

    public static int getInput(Scanner read) {
        System.out.print("ENter a non negative number : ");
        while (!read.hasNextInt()) {
            System.out.println("Enter the currect number");
            read.next();
        }
        int number = read.nextInt();
        return number;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = getInput(read);
        if (number>=0) {
            System.out.println("the factorial of "+number+" is : "+ calculateFectorial(number));
        } else {
            System.out.println("Invalid input");
        }
        

        read.close();
    }
}
