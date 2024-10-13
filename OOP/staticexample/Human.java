package staticexample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("this is static method");
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; //good practice
        // this.population += 1; //bad practice
        // this.message(); //bad practice
        Human.message(); //good practice
    }
}
