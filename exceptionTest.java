// question no 13
package labreport;

class UserException extends Exception {

    String str;

    UserException(String str) {
        this.str = str;

    }

    void display() throws UserException {
        System.out.println("stored string is : " + str);
        throw new UserException("Another Exception Occured");
    }
}

class ExceptionTest {

    public static void main(String args[]) {
        UserException ob = new UserException("hello");
        try {
            ob.display();
        } 
        catch (UserException e) {
            System.out.println("Error found" + e.getMessage());
        }
    }
}

