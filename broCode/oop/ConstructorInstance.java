public class ConstructorInstance {
    public static void main(String[] args) {
        //create student object
        Student student1 = new Student("Alice", 85, "Math");
        Student student2 = new Student("Zico", 90, "History");
        Student student3 = new Student("Lima", 96, "chemistry");

        //call instace method
        student1.displayInfo();
        student2.displayInfo();
        // student3.displayInfo();

        //cll another instance method
        student1.updateGrade(75);
        student1.displayInfo();
        student2.updateGrade(99);
        student2.displayInfo();

    }
}
