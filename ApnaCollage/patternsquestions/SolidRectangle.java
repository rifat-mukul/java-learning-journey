package patternsquestions;

public class SolidRectangle {

    /**
     * InnerSolidRectangle
     */
    public static void InnerSolidRectangle (int a, int b) {
    
        for(int i = 0; i < a; i ++) {
            for (int j = 0; j < b; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InnerSolidRectangle(4, 1);
    }
}
