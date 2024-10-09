import java.util.ArrayList;

public class TwoDarrayList {
    public static void main(String[] args) {
        //this is 1d array list
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomato");
        produceList.add("zuchini");

        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("Soda");
        drinkList.add("Coffee");

        //now lets create 2d array list
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);


        System.out.println(groceryList);
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }

        System.out.println(groceryList.get(2).get(0));
    }
}
