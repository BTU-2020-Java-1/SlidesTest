package ge.edu.btu.slide_4.customexception;

public class ThrowTest {

    public static void method() throws CustomException {
        if (true) {
            throw new CustomException("Custom error");
        }
    }
}

