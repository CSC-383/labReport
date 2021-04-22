// question no 5
package labreport;

import java.util.Scanner;

public class squareNumber {

    void squareNum(int num) {
        System.out.println("Square value is " + num * num);

    }

    void squareNum(double num) {
        System.out.println("Square value is " + num * num);

    }

    public static void main(String args[]) {
        squareNumber num = new squareNumber();
        num.squareNum(4.45);

    }

}
