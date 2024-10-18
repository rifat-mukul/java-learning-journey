package patternsquestions;

public class HollowRectangle2 {
    public static void printHollow (int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1 || j == 0 || j == b - 1 ) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printHollow(4, 5);
    }
}
