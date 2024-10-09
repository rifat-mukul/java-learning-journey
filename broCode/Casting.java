public class Casting {
    public static void main(String[] args) {
        //implicit casting
        // byte > short > int > long  > float > double
        short x = 5;
        int y = x + 2;
        System.out.println(y);
        System.out.println("==========================");
        double z = 10.2;
        double k = z + 2;
        System.out.println(k);
        System.out.println("==========================");
        //explicit casting 
        double m = 12.3;
        int n = (int)m + 2;
        System.out.println(n);
        System.out.println("==========================");
        String s = "1";
        // int num = Integer.parseInt(s);
        int r = Integer.parseInt(s) + 4;
        System.out.println(r);
        System.out.println("==========================");
    }
}
