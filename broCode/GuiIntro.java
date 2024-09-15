import javax.swing.JOptionPane;

public class GuiIntro {
    public static void main(String[] args) {
        String nameString = JOptionPane.showInputDialog("Enter your name");
        System.out.println(nameString);

        String homeString = JOptionPane.showInputDialog("Enter your hometown");
        

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age : "));
        

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
         

        //output
        JOptionPane.showMessageDialog(null, "hello " + nameString);
        JOptionPane.showMessageDialog(null, "Your are from: " + homeString);
        JOptionPane.showMessageDialog(null, "Your are " + age + " old");
        JOptionPane.showMessageDialog(null, "Your are " + height + " tall");

    }
}
