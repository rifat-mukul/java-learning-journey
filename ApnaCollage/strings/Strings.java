package strings;
import java.util.*;

class Strings {
    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);
        String nameHalf = scnner.next();
        scnner.nextLine();
        String nameFull = scnner.nextLine(); 
        String name1 = "Tony";
        String name2 = "Tony";
        // compare two string
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        // String name = "Rifat";
        for (int i = 0; i < nameFull.length(); i++) {
            System.out.println(nameFull.charAt(i));  //here charAt go to the string and return the character of the return index
        }
        System.out.println(nameHalf);
        System.out.println(nameFull);
        System.out.println(nameHalf.length());
        scnner.close();
    }
}
