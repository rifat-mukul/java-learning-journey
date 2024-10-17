package inheritance.multipleinheritance;

public class BoxPrice extends BoxofWeight{
    double cost;

    BoxPrice () {
        super();
        this.cost = 0.0;
    }

    // BoxPrice (double price) {
    //     this.cost = price;
    // }

    BoxPrice (BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double length, double height, double weight, double radus, double cost) {
        super(length, height, weight, radus);
        this.cost = cost;
    }
}
