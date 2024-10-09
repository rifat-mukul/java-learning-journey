// import java.util.Random;
import java.util.Scanner;

// import javax.swing.JOptionPane;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String name = JOptionPane.showInputDialog("Enter your name");
        // int age = Integer.parseInt(JOptionPane.showInputDialog("Ener your age")); 
        // boolean ans = Boolean.parseBoolean(JOptionPane.showInputDialog("Enter your ans"));
        // double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        // double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter number one : "));
        // double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter number one : "));
        // double num3 = Math.max(num1, num2);
        // double num4 = Math.sqrt((Math.pow(num1, 2) + Math.pow(num2, 2))); 
        // String resulString = String.format("%.4f", num4);

        // //String txt1 = scanner.nextLine();
        // if (ans) {
        //     JOptionPane.showMessageDialog(null, "Your ans is True ");
        // } else {
        //     JOptionPane.showMessageDialog(null, "Try next time");
        // }
        // if (height > 5.3) {
        //     JOptionPane.showMessageDialog(null, "You are tall your height is " + height);
        // } else {
        //     JOptionPane.showMessageDialog(null, "You are short " + height);
        // }
        // JOptionPane.showMessageDialog(null, "The bigger number is " + num3);
        // JOptionPane.showMessageDialog(null, "The hypotinus is " + num4);
        // JOptionPane.showMessageDialog(null, "The formated hypotinus is " + resulString);
        // System.out.println("Hello world"+ name);
        // JOptionPane.showMessageDialog(null, name);
        // JOptionPane.showMessageDialog(null,  age);

        // Random random = new Random();
        // int x = random.nextInt();
        // int fixedNumber = random.nextInt(6);
        // double y = random.nextDouble();
        // boolean z = random.nextBoolean();
        // System.out.println(x);
        // System.out.println(fixedNumber);
        // System.out.println(y);
        // System.out.println(z);

        // switch
        // System.out.print("Enter a number : ");
        // int numx = scanner.nextInt();

        // switch (numx % 2) {
        //     case 0: System.out.println("Enen number");
                
        //         break;
        //     case 1 : System.out.println("Odd number");
        //         break;
        //     default:
        //         break;
        // }

        System.out.print("Enter q or Q to quit : ");
        String responseString = scanner.next();

        if (responseString.equals("q") || responseString.equals("Q")) {
            System.out.println("You are out of the game");
        } else {
            System.out.println("You are still playing the game");
        }

        
        scanner.close();
    }
}
