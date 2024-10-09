public class Printf {
    public static void main(String[] args) {
        String chaString = "mukul";
        double mydouble = 1000;

        System.out.printf("The price is %.3f taka",32.2578); //precision
        System.out.println();
        System.out.printf("Your name is %s till now","22");
        System.out.println();
        //width
        //minimum number of character to be written as output
        System.out.printf("hello %10s bye", chaString);
        System.out.println();
        System.out.printf("hello %-10s bye", chaString);
        System.out.println();
        System.out.printf("The price is %+f taka",mydouble);
        System.out.println();
        System.out.printf("The price is %+020f taka%n",mydouble);  
    }
}
