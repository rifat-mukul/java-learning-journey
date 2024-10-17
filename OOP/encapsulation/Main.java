package encapsulation;

// Class that encapsulates data
class Student {
    // Private variables (attributes)
    private String name;
    private int age;

    // Constructor to initialize the attributes
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method to get the name
    public String getName() {
        return name;
    }

    // Public method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Public method to get the age
    public int getAge() {
        return age;
    }

    // Public method to set the age
    public void setAge(int age) {
        if (age > 0) { // Basic validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("Alice", 20);
        // System.out.println(student.name);
        // Accessing the attributes using public methods
        System.out.println("Name: " + student.getName()); // Outputs: Alice
        System.out.println("Age: " + student.getAge());   // Outputs: 20

        // Modifying the attributes using public methods
        student.setName("Bob");
        student.setAge(25);

        
        
        System.out.println("Updated Name: " + student.getName()); // Outputs: Bob
        System.out.println("Updated Age: " + student.getAge());   // Outputs: 25

        // Trying to set an invalid age
        student.setAge(-5); // Outputs: Age must be positive.
    }
}

