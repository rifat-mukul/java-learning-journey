package arrays;

import java.util.Scanner;

public class HW {
    public static int getIndex(int desiredIndex, int[] arrayNmber) {
        int idx = 0;
        for (int i = 0; i < arrayNmber.length; i++) {
            if (arrayNmber[i] == desiredIndex) {
                idx = i;
            }
        }
        return idx;
    }

    public static int[] insertValue(int[] arrayNmber, Scanner scanner) {
        for (int i = 0; i < arrayNmber.length; i++) {
            arrayNmber[i] = scanner.nextInt();
        }
        return arrayNmber;
    }

    public static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = getInput(scanner);
        int[] arrayNmber = new int[size];
        insertValue(arrayNmber, scanner);
        System.out.print("Emter the index of the desired number : ");
        int desiredIndex = getInput(scanner);
        System.out.println("The indes of the number is : "+ getIndex(desiredIndex, arrayNmber));
        scanner.close();
    }
}
