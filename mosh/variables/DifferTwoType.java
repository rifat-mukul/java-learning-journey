package variables;

import java.awt.Point;

public class DifferTwoType {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1); // No need for named parameters
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
