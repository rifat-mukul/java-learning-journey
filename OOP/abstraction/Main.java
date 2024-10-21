package abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound(); 

    // Regular method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass Dog that extends Animal
class Dog extends Animal {
    // Providing implementation for the abstract method
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass Cat that extends Animal
class Cat extends Animal {
    // Providing implementation for the abstract method
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Create a Dog object
        myDog.makeSound(); // Outputs: Bark
        myDog.eat();       // Outputs: This animal eats food.

        Animal myCat = new Cat(); // Create a Cat object
        myCat.makeSound(); // Outputs: Meow
        myCat.eat();       // Outputs: This animal eats food.
    }
}

