class Student {
    String name;
    int grade;
    String subject;

    //constructor
    Student(String name, int grade, String subject){
        this.name = name;
        this.grade = grade;
        this.subject = subject;
    }

    //instance
    void displayInfo() {
        System.out.printf("the student is %s and his gread %d. This gread is for the subject is %s.%n", this.name, this.grade, this.subject);
    }

    void updateGrade(int updateGread) {
        this.grade = updateGread;
        System.out.println("Updated gread is "+this.grade);
    }
}

