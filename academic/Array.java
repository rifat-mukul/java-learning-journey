public class Array {
    public static int[] rotateRightArray(int[] array) {
        int temp = array[array.length - 1];

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                array[i] = temp;
            } else {
                array[i] = array[i - 1];
            }
        }
        return array;
    }
    public static int[] rotateArray(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                array[i] = temp;
            } else {
                array[i] = array[i + 1];
                // System.out.println(i);
            }
        }
        return array;
    }
    public static int[] reverceArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array.length - i > i) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
        return array;
    }
    public static int[] insertValue(int[] array) {
        int count = 45;
        for (int i = 0; i < array.length; i ++) {
            array[i] = count;
            count *= 2;
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        printArray(array);
        insertValue(array);
        System.out.println("===============");
        printArray(array);
        System.out.println("===============");
        printArray(reverceArray(array));
        System.out.println("===============");
        printArray(rotateArray(array));
        System.out.println("===============");
        printArray(rotateRightArray(array));
    }
}