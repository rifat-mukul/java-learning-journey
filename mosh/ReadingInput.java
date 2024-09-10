import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create the Scanner object

        // Reading a byte
        System.out.print("Enter a byte value (e.g., -128 to 127): ");
        byte byteValue = scanner.nextByte();
        
        // Reading a short
        System.out.print("Enter a short value (e.g., -32,768 to 32,767): ");
        short shortValue = scanner.nextShort();
        
        // Reading an int
        System.out.print("Enter an int value (e.g., -2,147,483,648 to 2,147,483,647): ");
        int intValue = scanner.nextInt();
        
        // Reading a long
        System.out.print("Enter a long value (e.g., very large numbers): ");
        long longValue = scanner.nextLong();
        
        // Reading a float
        System.out.print("Enter a float value (e.g., 3.14): ");
        float floatValue = scanner.nextFloat();
        
        // Reading a double
        System.out.print("Enter a double value (e.g., 3.141592653589793): ");
        double doubleValue = scanner.nextDouble();
        
        // Reading a boolean
        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        // Consume the newline left-over
        scanner.nextLine();

        // Reading a single character (as a string, then take the first character)
        System.out.print("Enter a single character: ");
        char charValue = scanner.nextLine().charAt(0);
        
        // Reading a string (single word)
        System.out.print("Enter a single word: ");
        String word = scanner.next();

        // Reading a string (line of text)
        scanner.nextLine(); // Consume the newline left-over
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine().trim(); //trim remove the extra space in the begining and the end of the input string 

        // Outputting all the collected inputs
        System.out.println("\nCollected Inputs:");
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Boolean: " + booleanValue);
        System.out.println("Character: " + charValue);
        System.out.println("Single Word: " + word);
        System.out.println("Line of Text: " + line);

        // Closing the scanner
        scanner.close();
    }
}

