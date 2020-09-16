package ge.edu.btu.slide_2;

public class OperatorsTest {
    public static void main(String[] args) {
        int x = 10, y = 7;
        int z = x + y;
        System.out.println(z);  // 17
        y++;
        System.out.println(y);  // 8
        z *= 2;
        System.out.println(z);  // 34
        int p = z % y;
        System.out.println(p);  // 2
        boolean b = z == y;
        System.out.println(b);  // false
    }
}


