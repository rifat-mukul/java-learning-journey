package Strings;

public class Main {
    public static void main(String[] args) {
        String message = "Hello World !!" + " Mukul";

        System.out.println("==================================");
        System.out.println(message);
        System.out.println("==================================");
        System.out.println(message.endsWith("Mukul")); //return a boolean value true or false
        System.out.println("==================================");
        System.out.println(message.endsWith("!!")); //return a boolean value true or false
        System.out.println("==================================");
        System.out.println(message.startsWith("!!")); //return a boolean value true or false
        System.out.println("==================================");
        //for finding the length of the length 
        System.out.println(message.length());
        System.out.println("==================================");
        //for finding the given word position
        System.out.println("==================================");
        System.out.println(message.indexOf("H"));
        //missing words or sentense return -1
        System.out.println("==================================");
        System.out.println(message.indexOf("sky"));
        //replace any method something 
        System.out.println("==================================");
        System.out.println(message.replace("!", "**"));
        System.out.println(message);
        //for make lower all the character of the string
        System.out.println("==================================");
        System.out.println(message.toLowerCase());
        //for capital letter of all the case
        System.out.println("==================================");
        System.out.println(message.toUpperCase());
        System.out.println("==================================");
        //for get rif og extra white space
        System.out.println(message.trim());
        System.out.println("==================================");
        //the original string 
        //it mean the strings in java is immutable
        //means you cannot change the string
        System.out.println(message);
        System.out.println("==================================");

    }
}
