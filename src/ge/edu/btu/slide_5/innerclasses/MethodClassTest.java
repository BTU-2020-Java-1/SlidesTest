package ge.edu.btu.slide_5.innerclasses;

public class MethodClassTest {

    public void method() {
        class MethodLocalClass {

        }
    }
//    MethodLocalClass methodLocalClass = new MethodClassTest();  კომპილაციის შეცდომა

    private SingleMethodInterface singleMethodInterface = new SingleMethodInterface() {
        @Override
        public int method() {
            return 0;
        }
    };
}

