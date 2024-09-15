import java.util.Scanner;

import javax.swing.JOptionPane;

public class LogicalOperator {
    public static void main(String[] args) {
        //   && --> and
        //   || --> or
        //   ! --> not

        Scanner scanner = new Scanner(System.in);

        double temp = Double.parseDouble(JOptionPane.showInputDialog("Enter the temparature : "));

        if (temp < 15) {
            JOptionPane.showMessageDialog(null, "today is cold");
        } else if (temp >= 15 && temp <= 30) {
            JOptionPane.showMessageDialog(null, "Today is normal");
        } else {
            JOptionPane.showMessageDialog(null, "Today is hot");
        }
        scanner.close();
    }
}
