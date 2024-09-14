import javax.swing.JOptionPane;

public class MathClass {
    public static void main(String[] args) {
        double num1 = 3.14;
        double num2 = -10;

        double numMax = Math.max(num1, num2);
        double numMin = Math.min(num1, num2);

        //output section
        JOptionPane.showMessageDialog(null, "The big number is: " + numMax);
        JOptionPane.showMessageDialog(null, "The small number is : " + numMin);
        // System.out.println(z);
    }
}
