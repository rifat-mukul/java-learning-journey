import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] fruStrings = {"apple", "mango", "orange"};

        ArrayList<String> animal = new ArrayList<>();

        animal.add("Cat");
        animal.add("Rat");
        animal.add("bird");

        for(int i = 0; i < fruStrings.length; i ++) {
            System.out.println(fruStrings[i]);
        }
        System.out.println("===========================");
        for (String idxString : fruStrings) {
            System.out.println(idxString);
        }
        System.out.println();

        for (String index : animal) {
            System.out.println(index);
        }
    }
}
