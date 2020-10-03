package ge.edu.btu.slide_6.stringpool;

public class StringPoolTest {

    public static void main(String[] args) {
        String s1 = "Test";
        String s2 = "Test";
        System.out.println(s1 == s2);

        String s3 = new String("Test");
        String s4 = new String("Test");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        s3 = s3.intern();
        s4 = s4.intern();
        System.out.println(s3 == s4);
    }
}

