package twodarrays;

import java.util.Scanner;

public class TaskOne {

    // match the number and return the row and column
    public static int[] findIndex(int[][] array, int numberToFind) {
        int[] rowColumn = new int[2];
        // iterate through row
        for (int i = 0; i < array.length; i++) {
            //iterate through column
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == numberToFind) {
                    rowColumn[0] = i;
                    rowColumn[1] = j;
                    return rowColumn;
                }
            }
        }
        return new int[]{-1,-1};
    }

    // taking the number which i jave to find in the array
    public static int numberFind (Scanner scanner) {
        return scanner.nextInt();
    }

    // getting input from the user
    public static int[][] getInput(Scanner scanner) {
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int [][] matrixUser = new int[rows][columns];
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < columns; j++) {
                matrixUser[i][j] = scanner.nextInt();
            }
        }
        return matrixUser;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = getInput(scanner);
        int numberToFind = numberFind(scanner);
        // matching the number
        int[] index = findIndex(array, numberToFind);
        System.out.println("the row is "+index[0]+" the column is : "+index[1]);
        scanner.close();
    }
}
