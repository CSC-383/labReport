// question no 4
package labreport;

class Vehicle {

    String color, vehicleType;

    void speed(int Speed) {
        System.out.println("speed is " + Speed + " CC");
    }

    void display() {
        System.out.println("This is " + vehicleType + " and color is " + color);
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        Vehicle bike = new Vehicle();

        car.color = "black";
        car.vehicleType = "Car";
        car.display();
        car.speed(300);

        bike.color = "red and black";
        bike.vehicleType = "Bike";
        bike.display();
        bike.speed(150);

    }
}
