package childparent.childparentA;
import childparent.childparentB.Parent;
import childparent.child.Child1;
import childparent.child.Child2;
// import childparent.child.*; // not good practice
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        

        System.out.println(parent.parentProperty);
        parent.parentMethod();

        System.out.println(child1.childProperty1);
        child1.childMethod1();

        System.out.println(child2.childProperty2);
        child2.childMethod2();
    }
}
