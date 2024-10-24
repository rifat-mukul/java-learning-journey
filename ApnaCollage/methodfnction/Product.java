package methodfnction;

import java.util.Scanner;

public class Product {

    public static int calculateProduct(int number1, int number2) {
        return number1 * number2;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int number1 = read.nextInt();
        int number2 = read.nextInt();

        System.out.println("The product of two number is : "+ calculateProduct(number1, number2));


        read.close();
    }
}
