package ge.edu.btu.slide_4.finally_test;

public class FinallyTest {

    public static void main(String[] args) {
        try {
            System.out.println("1");
            if (true) {
                return;
            }
            int x = 15 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("დაფიქსირდა შეცდომა: " + ex.getMessage());
        } finally {
            System.out.println("2");
        }
        System.out.println("3");
    }
}


