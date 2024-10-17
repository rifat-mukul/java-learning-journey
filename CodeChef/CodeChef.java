import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }

        int j = scanner.nextInt();

        arr[0] = j;
        arr[arr.length-1] = j;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        scanner.close();

	}
}


