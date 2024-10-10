public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage(); // Creating a Garage object
        Car car1 = new Car("BMW"); // Creating a Car object with name "BMW"
        Car car2 = new Car("Tesla");  // Creating another Car object with name "Tesla"
        Byclcle cycle1 = new Byclcle("Phonix");
        Byclcle cycle2 = new Byclcle("MTB");

        garage.park(car1); // Passing car1 to the park() method of Garage
        garage.park(car2);
        garage.stand(cycle1);
        garage.stand(cycle2);
    }
}