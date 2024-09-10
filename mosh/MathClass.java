public class MathClass {
    public static void main(String[] args) {
        int result = Math.round(1.1258815F);
        System.out.println(result);
        // celling of given bumber
        int resultOne = (int)Math.ceil(1.25F);
        System.out.println(resultOne);
        // maximum
        int resultTwo = Math.max(result, resultOne);
        System.out.println(resultTwo);
        //generate a random number
        double resultThree = Math.random();
        System.out.println(resultThree);
        // different number between zero to n
        double resultFour = Math.random() * 100; //here n is 100
        System.out.println(resultFour);
        // int random number
        int resultSix = (int) Math.round(Math.random()*100);
        System.out.println(resultSix);
    }
}
