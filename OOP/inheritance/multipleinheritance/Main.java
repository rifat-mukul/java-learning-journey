package inheritance.multipleinheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Box squreBox = new Box(4.5);
        Box threeArgBox = new Box(4.5, 7.5, 8.5);
        Box oldBox = new Box(squreBox);
        //now BoxofWeight will inherite all the properties of box
        BoxofWeight inheriteBoxofWeight = new BoxofWeight();
        BoxofWeight inheriteBoxofWeight1 = new BoxofWeight(inheriteBoxofWeight);
        BoxofWeight inherite4ArugBoxofWeight = new BoxofWeight(4.5,6.32,8.92,2.35);
        BoxPrice boxPrice = new BoxPrice();

        // System.out.println("Initial box box : "+box.length+" "+box.height+" "+box.weight);
        // System.out.println("Square box : " +squreBox.length+" "+squreBox.height+" "+squreBox.weight);
        // System.out.println("Three aregument box : " +threeArgBox.length+" "+threeArgBox.height+" "+threeArgBox.weight);
        // System.out.println("Copy of old square box : " +oldBox.length+" "+oldBox.height+" "+oldBox.weight);

        // //now print the thing that is not directly present on the BoxofWeight.
        // //here it will inherite all the element currectly
        System.out.println(inheriteBoxofWeight.height+" "+inheriteBoxofWeight.radus);
        System.out.println(inheriteBoxofWeight1.height+" "+inheriteBoxofWeight1.radus);
        // System.out.println("Inherite 4 items : " +inherite4ArugBoxofWeight.length+" "+inherite4ArugBoxofWeight.height+" "+inherite4ArugBoxofWeight.x  +" "+inherite4ArugBoxofWeight.radus);

    }
}
