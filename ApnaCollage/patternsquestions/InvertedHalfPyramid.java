package patternsquestions;

public class InvertedHalfPyramid {
    public static void printIHP(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printIHP(4);
    }
}
