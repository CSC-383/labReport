// question no 9
package labreport;

public class stringReverse {

    public static void main(String[] args) {
        String string = "reverse";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("String before reverse: " + string);
        System.out.println("String after reverse: " + reverse);
    }

}
