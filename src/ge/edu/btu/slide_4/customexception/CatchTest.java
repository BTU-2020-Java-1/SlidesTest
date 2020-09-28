package ge.edu.btu.slide_4.customexception;

public class CatchTest {
    public static void main(String[] args) {
        try {
            ThrowTest.method();
        } catch (CustomException ex) {
            System.out.println("დაფიქსირდა შეცდომა: " + ex.getMessage());
        }
    }
}


