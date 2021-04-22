// question no 1
package labreport;

import java.util.*;

public class simpleInterest {

    public static void main(String[] args) {
        double P, R, N;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your 3 value: ");
        P = userInput.nextDouble();
        R = userInput.nextDouble();
        N = userInput.nextDouble();
        double SI = (P * R * N) / 100;
        System.out.println(SI);
    }

}
