public class Main {

    public static void main(String[] args) {
        // Food[] refrigetorFood = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("momo");
        Food food3 = new Food("burger");

        Food[] refrigetorFood = {food1, food2, food3};

        // refrigetorFood[0] = food1;
        // refrigetorFood[1] = food2;
        // refrigetorFood[2] = food3;

        System.out.println(refrigetorFood[1].name);
        for (int i = 0; i < refrigetorFood.length; i++) {
            System.out.println(refrigetorFood[i].name);
        }
    }
}