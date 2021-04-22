// question no 6


package labreport;

public class Calculation {

    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The additional value is " + z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The subtraction value is " + z);
    }

}

class My_Calculation extends Calculation {

    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The multiplication value is " + z);
    }

    public static void main(String args[]) {
        int a = 20, b = 10;
        My_Calculation number = new My_Calculation();
        number.addition(a, b);
        number.Subtraction(a, b);
        number.multiplication(a, b);
    }

}
