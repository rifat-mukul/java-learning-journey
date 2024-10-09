public class TernaryOperator {
    public static void main(String[] args) {
        int income = 123_000;
        // ? --> ternary operator 
        // . --> ternary operator 
        String classNameString = income > 100_000 ? "First" : "Economy";
        System.out.println(classNameString);
        String classString = income > 130_000 ? "First" : "Second";
        System.out.println(classString);
    }
}
