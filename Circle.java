// question no 7
package labreport;

class point {

    int x, y;

}

public class Circle extends point {

    double r;

    Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        r = radius;
    }

    double getArea() {
        return 3.14 * r * r;
    }

    double getCircumference() {
        return 2 * 3.14 * r;
    }

    public String toString() {
        return "Circle[" + "center=(" + x + "," + y + ")" + "radius=" + r + ']';
    }

    public static void main(String args[]) {
        Circle circle = new Circle(3, 4, 6);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }

}
