import java.util.ArrayList;

public class MyArrayListDemo {
    public static void main(String[] args) {
        // array list = a resizable array
        //              elements can be added or removed after creation
        //              stores reference data types

        ArrayList<String> foodArrayList = new ArrayList<String>();
        foodArrayList.add("Pizza");
        foodArrayList.add("hamburger");
        foodArrayList.add("wings");

        foodArrayList.set(0, "Susi");
        foodArrayList.remove(2);
        //for all delete
        // foodArrayList.clear();

        for (int i = 0; i < foodArrayList.size(); i++) {
            System.out.println(foodArrayList.get(i));
        }
    }
}
