package singleton;

public class SingletonExample {
    private SingletonExample () {
        
    }

    private static SingletonExample instance;

    public static SingletonExample getInstance() {
        // System.out.println("hhhhhhh");
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
