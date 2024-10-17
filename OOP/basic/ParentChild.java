package basic;
class Parent {
    int parentProperty = 10;

    void parentMethod() {
        System.out.println("This is a parent method.");
    }
}

class Child extends Parent {
    int childProperty = 20;

    void childMethod() {
        System.out.println("This is a child method.");
    }
}


public class ParentChild {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // Parent can access its own property
        System.out.println("Parent property: " + parent.parentProperty);
        // System.out.println("Parent property: " + parent.childProperty); // this is not possible

        // Parent cannot access child's property or methods
        // This will give an error: parent.childProperty;
        // This will give an error: parent.childMethod();

        // Child can access both parent and child properties
        System.out.println("Child property: " + child.childProperty);
        System.out.println("Inherited parent property in child: " + child.parentProperty);
    }
}
