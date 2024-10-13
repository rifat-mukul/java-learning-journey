package staticexample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(75, "kunal", 45000, false);
        Human rahul = new Human(57, "Rahul", 45800, true);
        Human kaif = new Human(57, "kaif", 45800, true);
        // greeting();
        // System.out.println(kunal.age);
        // System.out.println(rahul.age);
        // System.out.println(kunal.population); // bad practice
        System.out.println(Human.population); // good practice 
        // fun();
    }

    static void fun () {
        // greeting(); //it will give error
        // you cannot access non static stuff without referencing their 
        //instance in a static context
        Main obj = new Main();
        obj.greeting();
    }

    void fun2 () { //vodeo 2 43.23
        greeting();
    }

    void greeting() {
        fun();
        System.out.println("From greeting");
    }
}
