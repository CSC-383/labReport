// question no 8
package labreport;

public class stringMethod {

    public static void main(String[] args) {
        String s1 = "I am the owner of the company";
        String s2 = "I love my country";
        StringBuffer b = new StringBuffer(s2);
        // String s3= String.join(" ",s1,s2);
        System.out.println(String.join(" ", s1, s2));
        System.out.println(s1.substring(0, 14));
        System.out.println(b.delete(0, 6));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.replace("owner", "employee"));
        String s = "hello";
        System.out.println(s.concat(" " + s1));

    }

}
