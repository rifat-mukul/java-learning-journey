public class Main {
    public static void main(String[] args) {
        Car mayCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(mayCar1.model);
        System.out.println(mayCar1.make);
        System.out.println(mayCar1.price);
        mayCar1.drive();

        System.out.println(myCar2.color);
        System.out.println(myCar2.make);
    }
}
