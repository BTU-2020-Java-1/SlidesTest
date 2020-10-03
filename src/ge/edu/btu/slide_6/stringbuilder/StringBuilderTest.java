package ge.edu.btu.slide_6.stringbuilder;

public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Test");
        for (int i = 0; i < 2; i++) {
            sb.append(sb);
        }
        System.out.println(sb);
    }
}

