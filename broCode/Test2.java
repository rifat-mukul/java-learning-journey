import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[4];
        

        for (int i = 0; i < 4; i++) {
            int num = scanner.nextInt();
            a[i] = num;
        }

        // for (int i = 0; i < a.length; i++) {
        //     if (i < 2) {
        //         System.out.printf("%d ",a[i]);
        //     }
        //      else {
        //         System.out.printf("%d ",a[i]);
        //     }
        // }

        System.out.printf("%d %d%n",a[0],a[1]);
        System.out.printf("%d %d",a[2],a[3]);

        scanner.close();
    }
}
