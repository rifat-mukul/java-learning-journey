package sorting;

public class SelectionSort {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    } 
    public static void main(String[] args) {
        int array[] = {7,8,3,1,2};

        selectionSort(array);
        printArray(array);
    }
}
