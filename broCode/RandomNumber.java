import java.util.Random;

import javax.swing.JOptionPane;

public class RandomNumber {
    public static void main(String[] args) {
       Random random = new Random(); 

       int num1 = random.nextInt(6) +1; //inside paenthesis value is the limit of the random number it starts from o to the given number

       double num2 = random.nextDouble();
    //    System.out.println(num1);
       JOptionPane.showMessageDialog(null, "the random int number is :" + num1);
       JOptionPane.showMessageDialog(null, "the random diuble number is :" + num2);
    }
}
