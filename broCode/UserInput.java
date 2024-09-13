import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read input int 
        // int number = scanner.nextInt();

        //read string
        System.out.print("Enter your name : ");
        String naString = scanner.nextLine();
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        scanner.nextLine(); //after int you have to use it
        
        System.out.print("Enter your favorite food : ");
        String foodString = scanner.nextLine();

        // System.out.println(number);
        System.out.println("Your name is "+ naString);
        System.out.println("You are :" + age);
        System.out.println("Your favorite food is : "+ foodString);



        scanner.close();
    }
}
