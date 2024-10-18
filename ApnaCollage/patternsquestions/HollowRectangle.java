
//      * * * * * *
//      *         *
//      *         *
//      *         *
//      *         *
//      * * * * * *

package patternsquestions;

public class HollowRectangle {

    public static void printHollow(int a, int b) {
        for (int i = 0; i < a; i++) {
            if (i == 0 || i == a - 1) {
                for (int j = 0; j < b; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < b; j++) {
                    if (j == 0 || j == b - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        printHollow(4, 5);
    }
}
