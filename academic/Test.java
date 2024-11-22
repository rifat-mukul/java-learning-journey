import java.util.Random;

public class Test {

    public static void leftShift(int[] array) {
        System.out.println("Left SHIFT");
        int tempFirst = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array[array.length - 1] = tempFirst;
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        System.out.println("Rerverse array");
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        printArray(array);

    }

    public static void printReverse(int[] array) {
        System.out.println("Reverse Iteration");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(int[] array) {
        for(int num : array) {
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static int[] insertRandomNumber(int[] array) {
        System.out.println("Main array");
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = new int[5];

        insertRandomNumber(array);
        printArray(array);
        // printReverse(array);
        // reverseArray(array);
        leftShift(array);

        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i]);
        // }
    }
}
