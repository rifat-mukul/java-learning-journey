import javax.swing.JOptionPane;

public class GuiIntro {
    public static void main(String[] args) {
        String nameString = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "hello " + nameString);
        System.out.println(nameString);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age : "));
        JOptionPane.showMessageDialog(null, age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "Your are " + height + " tall");
         
    }
}
