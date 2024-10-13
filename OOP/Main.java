public class Main {
    public static void main(String[] args) {
        // Student[] students = new Student[5];

        Student kunal = new Student(12, "Kunal", 75.5f);
        Student arpit = new Student(15, "Arpit", 85.35f);
        // Student rahul = new Student();
        Student randomStudent = new Student(kunal);
        Student defultStudent = new Student(); 

        Student one = new Student();
        Student two = one;
        one.name = "XYZ";
        System.out.println(two.name);
        System.out.println(one.name);

         // kunal.roll = 54;
        // kunal.name = "kunal DeSoza";
        // kunal.marks = 92.25f;
        // System.out.println(kunal.roll);
        System.out.println("Kunal name : "+kunal.name);
        System.out.println("Arpit info: "+arpit.name);
        // System.out.println(kunal.marks);
        System.out.println("Random Student info from kunal : "+randomStudent.name);
        System.out.println("Defult student name : "+defultStudent.name);
        // // kunal.changeName("Riso");
        // kunal.greeeting();
        // rahul.greeeting(); 
    }
}

class Student {
    int roll;
    String name;
    float marks;

    void greeeting() {
        System.out.println("Hello " + name);
    }

    void changeName(String newName) {
        this.name = newName;
    }

    Student (Student other) {
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }

    Student() {
        //this is how you call a contructor from another constructor
        this(0, "XXX", 0.00f);
    }

    // Student () {
    //     this.roll = 0;
    //     this.name = "Defult"; 
    //     this.marks = 0.0f;
    // }

    Student (int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}


