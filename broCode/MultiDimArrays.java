import java.util.Arrays;

public class MultiDimArrays {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        numbers[1][0] = 2;
        System.out.println(Arrays.deepToString(numbers));

    }
}
