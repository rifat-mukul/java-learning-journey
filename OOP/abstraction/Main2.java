package abstraction;

import polymorphism.override;

abstract class base {
    public base() {
        System.out.println("This is base class");
    }

    public void sayhello() {
        System.out.println("Say hello");
    }

    abstract public void greet();
    abstract public void greet2();
}



class child2 extends base {
    public child2() {  //// Call the constructor of base
        super();
    }
    @override
    public void greet() {
        System.out.println("Good morning");
    }

    @Override
    public void greet2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'greet2'");
    }
}

 class child3 extends base {
    @override
    public void greet() {
        System.out.println("good");
    }
    public void th() {
        System.out.println("this is child 3");
    }
    @Override
    public void greet2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'greet2'");
    }
}

abstract class base2 {
    public base2() {
        System.out.println("hello base 2");
    }
    public void niso() {
        System.out.println("love you niso");
    }

    abstract public void love();
}

class lava extends base2 {
    public lava() {
        super();
    }
    public void love() {
        System.out.println("i love you");
    }
}


public class Main2 {
    public static void main(String[] args) {
        base child2 = new child2();
        base2 klove = new lava();
        // child2.sayhello();
        klove.love();
        klove.niso();

    }
}
