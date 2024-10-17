package basic;
public class Main2 {
    public static void main(String[] args) {
        A obj = new A("Tusu");
        System.out.println(obj);


        // for (int i = 0; i < 100; i++) {   // Corrected for loop
        //     obj = new A("Random object " + i);
        // }
    }
}

class A {
    final int numx = 15;
    String namex;

    public A(String name) {
        this.namex = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
    
}
