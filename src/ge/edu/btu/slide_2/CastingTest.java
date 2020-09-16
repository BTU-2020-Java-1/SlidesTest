package ge.edu.btu.slide_2;

public class CastingTest {

    public static void main(String[] args) {
        int x = 1_000_000;
        int y = 1__000__000;
        System.out.println(x * y);            //არასწორიპასუხი
        System.out.println((long) x * y);    //სწორიპასუხი
        System.out.println((char) 4304 + " სიმბოლოს კოდია 4304");
    }
}


