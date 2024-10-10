public class Garage {
    void park(Car x) {  // Method takes a Car object as an argument
        System.out.println("The car "+x.name+" is parked");
    }

    // void stand(Byclcle cycle) {
    //     System.out.printf("The %s cycle is stand on the garage%n",cycle.cycleString);
    // }

    void stand(Byclcle cycle) {
            System.out.println("the "+cycle.cycleString+" is stand on the garage");
        }
}
