package recurssioncode;

public class factorial {
    public static int printFactorial(int num){
        if (num == 0) {
            return 1;
        }
        int fact_n = printFactorial(num - 1);
        int fact_call = num * fact_n;
        return fact_call;
    }
    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }
}
