import java.util.Scanner;

public class Insert {
    public static void insertValue(int[] array, int index, int value) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i == index) {
                newArray[i] = value;
            } else {
                newArray[i] = array[i-1];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }
    public static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5};
        System.out.print("Enter the index : ");
        int index = getInput(scanner);
        System.out.print("Enter the Value : ");
        int value = getInput(scanner);
        insertValue(array, index, value);

    }
}
