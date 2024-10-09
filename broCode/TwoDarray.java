public class TwoDarray {
    public static void main(String[] args) {
        String[][] cars = {
            {"Toyota", "Tata", "XXX"},
            {"aaa", "bbb", "ccc"},
            {"ddd", "eee", "fff"}
        };

        // cars[0][0] = "Toyota";
        // cars[0][1] = "Tata";
        // cars[0][2] = "XXX";

        // cars[1][0] = "aaa";
        // cars[1][1] = "sss";
        // cars[1][2] = "ddd";

        // cars[2][0] = "fff";
        // cars[2][1] = "rrr";
        // cars[2][2] = "ttt";

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println(cars[0][1]);
    }
}
