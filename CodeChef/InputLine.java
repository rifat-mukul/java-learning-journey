import java.util.Scanner;

public class InputLine {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numString = scanner.nextLine();

        String[] numbeStrings = numString.split(" ");

        int[] intNum = new int[numbeStrings.length];
        for (int i = 0; i < intNum.length; i++) {
            intNum[i] = Integer.parseInt(numbeStrings[i]);
        }

        for (int i = 0; i < intNum.length; i++) {
            System.out.print(intNum[i]+ " ");
        }

        scanner.close();
    }
}
