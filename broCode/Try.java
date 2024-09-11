import java.util.Arrays;

public class Try {

    public static void main(String[] args) {
        String name = "Rifat";
        System.out.println(name.startsWith("R"));
        System.out.println(name.endsWith("t"));
        System.out.println(name.indexOf("i"));
        System.out.println(name.replace("i", "e"));
        System.out.println(name);

        // =====================
        int[] numbers = { 110,58,5,6,78,2 };
        Arrays.sort(numbers);
        System.out.println(numbers);
        String resulString = Arrays.toString(numbers);
        System.out.println(resulString);
        for (int i = 0; i < numbers.length; i ++) {
            System.out.println(numbers[i]);
        }
    }
}