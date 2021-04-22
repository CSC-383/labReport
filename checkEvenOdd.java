// question no 3
package labreport;

import java.util.Scanner;

public class checkEvenOdd {

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = userInput.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

    }

}
