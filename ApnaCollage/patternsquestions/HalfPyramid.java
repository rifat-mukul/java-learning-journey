package patternsquestions;

public class HalfPyramid {
    public static void printHalfPyramid(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printHalfPyramid(5);
    }
}
