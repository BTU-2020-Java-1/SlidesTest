package ge.edu.btu.slide_2;

public class BreakAndContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 13) {
                break;
            }
            System.out.println(i);
        }
    }
}


