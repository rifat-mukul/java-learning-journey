public class SelectionSort {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
    public static int[] swap(int[] array, int i, int smallIndes) {
        int temp = array[i];
        array[i] = array[smallIndes];
        array[smallIndes] = temp;
        return array;
    }
    public static void compare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int smallIndes = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    smallIndes = j;
                }
            }
            swap(array,i, smallIndes);
        }
        printArray(array);
    }
    public static void main(String[] args) {
        int[] array = {9, 13,15,2,18,4};
        compare(array);
    }
}
