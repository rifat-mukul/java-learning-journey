public class Arrays {
    public static void main(String[] args) {
        String[] caStrings = {"Carto", "Covator", "Tesla"};
        int[] nums = {1,2,3,4,5,65,0};

        String[] cars = new String[3];

        caStrings[0] = "Mastang";

        for (int i = 0; i < caStrings.length; i++) {
            System.out.println(caStrings[i]);
            System.out.println();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            // System.out.println();
        }

        for (int i = 0; i < cars.length; i++) {
            cars[i] = caStrings[i];
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // System.out.println(caStrings[0]);
    }
}
