import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static int bubbleSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i] = temp;
                count++;
            }
        }

        return count;
    }
    public static void main(String args[] ) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();

       int[] array = new int[n];

       for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
       }

       System.out.println(bubbleSort(array));
       scanner.close();
        
    }
}
