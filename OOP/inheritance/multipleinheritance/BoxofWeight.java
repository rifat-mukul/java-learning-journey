package inheritance.multipleinheritance;

public class BoxofWeight extends Box {
    //this file inherite all the properties of box file
    double radus;
    int x;

    //normal constructor
    public BoxofWeight() {
        this.radus = 0.0;
    }

    public BoxofWeight(BoxofWeight other){
        super(other);
        this.radus = radus;
    }

    // BoxofWeight (boxradius) {
    //     this.radus = radus;
    // }

    // passing the 4th 
    public BoxofWeight(double length, double height, double weight, double radus) {
        super(length, height, weight); // call the parent class constructor
        //thus super() used to initialized the values in parent class
        this.radus = radus;
    }
}