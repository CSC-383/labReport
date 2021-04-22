// question no 2
package labreport;

import java.util.Scanner;

public class celciusToFarenheit {

    public static void main(String arg[]) {
        double fahrenheit, celcius;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your value: ");
        celcius = userInput.nextDouble();
        fahrenheit = ((celcius * 9) / 5) + 32;
        System.out.println("Fahrenheit value is " + fahrenheit);
    }

}
