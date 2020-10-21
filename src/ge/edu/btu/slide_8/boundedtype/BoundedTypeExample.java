package ge.edu.btu.slide_8.boundedtype;

public class BoundedTypeExample {

    public static void main(String[] args) {
        Exception[] exceptions = new Exception[] {
                new RuntimeException("Message 1"),
                new ArithmeticException(("Message 2"))
        };

        printExceptionMessages(exceptions);
    }

    private static <T extends Exception> void printExceptionMessages(T[] exceptions) {
        for (T t : exceptions) {
            System.out.println(t.getMessage());
        }
    }
}

