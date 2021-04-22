// question no 10
package labreport;

interface FlyingBird {

    void fly();
}

class Animal {

    private int height;
    private double weight;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void walk() {
        System.out.println(" I walk on the street");
    }
}

class Bird extends Animal implements FlyingBird {

    Bird() {
        System.out.println("I am bird");
    }

    public void fly() {
        System.out.println(" i fly on the sky");
    }

}

class Parrot extends Bird {

    public void display() {
        System.out.println("i am mithu");
    }

}

public class Test {

    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.display();
        Animal a = new Animal();
        a.setHeight(32);
        a.setWeight(50.6);

    }

}
