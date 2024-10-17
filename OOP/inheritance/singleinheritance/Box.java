package inheritance.singleinheritance;

public class Box {
    double length;
    double height;
    double weight;

    //initial constructor
    Box() {
        this.length = -1;
        this.height = -1;
        this.weight = -1;

    }

    //cube

    Box (double size) {
        this.length = size;
        this.height = size;
        this.weight = size;
    }


    Box(double length, double height, double weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    //copy constructor
    Box(Box oldBox) {
        this.length = oldBox.length;
        this.height = oldBox.height;
        this.weight = oldBox.weight;
    }

    public void info() {
        System.out.println("Running the box");
    }
}
