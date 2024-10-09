public class Methods {
    public static void main(String[] args) {
        hello();
        // hello();
        // hello();
        System.out.println("Good morning");
        hello();
        System.out.println("Good afternoon");
        String greetString = "Nice to meet you";
        int balance = 75;
        greeting(greetString, balance);
    }

    static void hello() {
        name();
        System.out.println("mukul ");
    }

    static void name() {
        System.out.println("hello ");
    }

    //pass value
    static void greeting(String gString, int balance) {
        System.out.println(gString + " Mukul");
        System.out.println("Your bill is " + balance + " taka");
    }
}
