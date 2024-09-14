import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking input 
        System.out.print("Enter the Principal ammount ($1k - $1M) : ");
        double principalAmount;
        // double ammount = scanner.nextDouble();
        while (true) {
            double amount = scanner.nextDouble();
            if (amount >= 1_000 && amount <= 1_000_000) {
                principalAmount = amount;
                break;
            } else {
                System.out.println("Invalid amount. Please enter a value between $1,000 and $1,000,000.");
                System.out.print("Enter again : ");
            }
        }
        

        System.out.print("Interest rate : "); // between 
        double interestRate;
        while (true) {
            double interest = scanner.nextDouble();
            if (interest > 0.0 && interest <= 30.0) {
                interestRate = interest;
                break;
            } else {
                System.out.println("Invalid Interest Rate. Please enter a value grater than 0.0 and less than 30.0.");
                System.out.print("Enter again : ");
            }
        }

        System.out.print("Total Time for return (in year) : ");
        double timeNeed;
        while (true) {
            double time = scanner.nextDouble();
            if (time > 0 && time <= 30.0) {
                timeNeed = time;
                break;
            } else {
                System.out.println("Invalid Year. Please enter a value grater than 0 and less than 30.");
                System.out.print("Enter again : ");
            }
        }


        //prepare imput for calculation
        double interestRateCal = (interestRate / 100) / 12;
        double interestRateCalOne = interestRateCal + 1;
        double timeMonth = timeNeed * 12;

        //calculation
        double mortgage =  principalAmount * ((interestRateCal * Math.pow(interestRateCalOne, timeMonth)/ ((Math.pow(interestRateCalOne, timeMonth) - 1))));
        String formatedMortgageString = String.format("$%.2f", mortgage);

        System.out.println("Your monthly pay is :" + formatedMortgageString);



        scanner.close();
    }
}
