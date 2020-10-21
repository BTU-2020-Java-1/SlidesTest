package ge.edu.btu.slide_8.wrapper;

public class WrapperTest {

    public static void main(String[] args) {
        int a = 7;
        Integer b = 15;
        Integer c = a + b;
        String s = c.toString();
        Integer d = Integer.parseInt(s);
        System.out.println(d);
    }
}

