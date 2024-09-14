import javax.swing.JOptionPane;

public class Hypotenuse {

    public static void main(String[] args) {
        //input section
        double base = Math.pow(Double.parseDouble(JOptionPane.showInputDialog("Enter the base of the triangle : ")), 2);
        double height = Math.pow(Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the triangle : ")), 2);

        //calculation
        double hypotenuse = Math.sqrt(base + height);
        String formatedString = String.format("%.3f", hypotenuse);

        //output section
        JOptionPane.showMessageDialog(null, "The Hypotenuse of the triangle is : " + formatedString);
    }
}