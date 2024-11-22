package recurssioncode;

public class calcPower {
    public static int powerCacl(int x, int n) {
        if (n==0) {
            return 1;
        }

        if (x==0) {
            return 0;
        }
        int xPowernm1 = powerCacl(x, n-1);
        int xPow = x * xPowernm1;
        return xPow;
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(powerCacl(x, n));

    }
}
