package ge.edu.btu.slide_3.passbyvalue;

public class Runner {
    public static void main(String[] args) {
        int x = 2;
        method1(x);
        System.out.println(x);

        System.out.println("--------------");

        IntegerWrapper integerWrapper = new IntegerWrapper(2);
        method2(integerWrapper);
        System.out.println(integerWrapper.x);
    }

    static void method1(int x) {
        x = 10;
    }
    static void method2(IntegerWrapper integerWrapper) {
        integerWrapper.x = 10;
    }
}


