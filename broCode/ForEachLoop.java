public class ForEachLoop {
    public static void main(String[] args) {
        String[] fruStrings = {"apple", "mango", "orange"};

        for(int i = 0; i < fruStrings.length; i ++) {
            System.out.println(fruStrings[i]);
        }
        System.out.println("===========================");
        for (String fString : fruStrings) {
            System.out.println(fString);
        }
    }
}
