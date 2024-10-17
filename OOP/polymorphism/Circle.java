package polymorphism;

public class Circle extends Shapes {

    //this will run when the object od Circle is creted
    //hence it is overriding the parent method
    @override // this is called anotation
    void area() {
        System.out.println("i am in Circle");
    }
}
