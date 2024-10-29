package twodarrays;
import java.util.*;


public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int colums = scanner.nextInt();

        int[][] numbers = new int[rows][colums];
        //input
        //rows
        for (int i = 0; i < rows; i++) {
            //column
            for (int j = 0; j < colums; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
