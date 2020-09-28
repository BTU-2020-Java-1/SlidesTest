package ge.edu.btu.slide_4.trycatch;

public class TryCatch {

    public static void main(String[] args) {
        try {
            System.out.println("1");
            int x = 15 / 0;
            System.out.println("2");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("3");
            System.out.println("დაფიქსირდა შეცდომა: " + ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("4");
            System.out.println("დაფიქსირდა შეცდომა: " + ex.getMessage());
        }
        System.out.println("5");
    }
}


