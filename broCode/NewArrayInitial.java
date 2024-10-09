import java.util.Arrays;

public class NewArrayInitial {
    public static void main(String[] args) {
        int[] numbers = { 2, 6, 5, 9, 7 };
        System.out.println(numbers.length);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        //sort arrays
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
