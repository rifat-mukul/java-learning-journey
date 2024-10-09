public class ArithmeticExpression {
    public static void main(String[] args) {
        int retult = 10 + 3;
    System.out.println(retult);
    System.out.println("=============================");
    double resultTwo = (double) 10 / (double) 3;
    System.out.println(resultTwo);
    System.out.println("=============================");
    //increment operator ++x or x++ will generate same output only in here 
    int resultThree = 5;
    resultThree ++;
    System.out.println(resultThree);
    System.out.println("=============================");
    int retultFour = 4;
    int retultFIve = retultFour++; //first store then increment
    System.out.println(retultFour);
    System.out.println(retultFIve);
    System.out.println("=============================");
    int retultSix = 4;
    int retultSeven = ++retultSix; //first increment then store
    System.out.println(retultSix);
    System.out.println(retultSeven);
    System.out.println("=============================");
    //Augmented Assignment Operator
    int x = 4;
    x += 2;
    System.out.println(x);
    System.out.println("=============================");
    int y = 10 + 2 * 4;
    System.out.println(y);
    System.out.println("=============================");
    System.out.println("=============================");
    System.out.println("=============================");
    }
}
