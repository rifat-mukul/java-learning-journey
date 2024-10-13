package staticexample;

public class InnerClass {


    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        public String toString() { //it helps to not pront any random staff in System.out.println(a);
            return name; 
        }


        public static void main(String[] args) {
            Test a  = new Test("kunal");
            Test b  = new Test("rahul");

            System.out.println(a);

            System.out.println(a.name);
            System.out.println(b.name); 
        }
        
    }
}
