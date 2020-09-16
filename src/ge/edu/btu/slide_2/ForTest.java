package ge.edu.btu.slide_2;

public class ForTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i *= 2) {
            System.out.println(i);
        }
        System.out.println("----------");

        int x = 130;
        for (; x != 0; ) {
            System.out.println(x);
            x = x / 10;
        }
    }
}




