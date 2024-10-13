package staticexample;

public class staticBlock {
    static int a = 4;
    static int b;

    //it only runs ones. only the first object i created
    static {
        System.out.println("i am from static");
        b = a * 5;
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        // is not mandatory for your code to run correctly.
        // The reason is that both a and b are static variables, 
        // and the code within the static block is executed as soon as 
        // the class is loaded, even before any object of the class is 
        // created. Static variables and static blocks belong to the 
        // class itself rather than to instances of the class, which 
        // means they can be accessed directly using the class name 
        // without creating an object.
        System.out.println(staticBlock.a + " " + staticBlock.b);
        staticBlock.b += 10;
        System.out.println(staticBlock.b);

    }
}
