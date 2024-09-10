import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inpuString = "";

        while (true) {
            System.out.print("Input : ");
            inpuString = scanner.next().toLowerCase();

            if (inpuString.equals("pass")) {
                continue;
            } else if (inpuString.equals("quit")) {
                break;
            } else {
                System.out.println(inpuString);
            }
        }

        scanner.close();
    }
}
