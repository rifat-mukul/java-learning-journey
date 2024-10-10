import java.util.Random;

public class DiceRoler {

    Random random;  // Class-level random variable
    int number;

    DiceRoler() {
        random = new Random();  // Initialize the class-level variable here
        roll();
    }

    void roll () {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
