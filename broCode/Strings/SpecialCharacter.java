package Strings;

public class SpecialCharacter {
    public static void main(String[] args) {
        System.out.println("==================================");

        String message = "Hello Mukul";
        System.out.println(message);
        System.out.println("==================================");
        //srround mukul with dubble quotes
        String messageTwo = "Hello \"Mukul\"";
        System.out.println(messageTwo);
        System.out.println("==================================");
        //use blackslash
        String messageThree = "C:\\Windows\\..";
        System.out.println(messageThree);
        System.out.println("==================================");
        //breaking line
        String messageFour = "i love \nYou";
        System.out.println(messageFour);
        System.out.println("==================================");
        //tab in string
        String messageFive = "I\tlove\tYou";
        System.out.println(messageFive);
        System.out.println("==================================");

    }
}
