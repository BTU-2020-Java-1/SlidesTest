package ge.edu.btu.slide_5.innerclasses;

public class OuterClass {
    private int x;

    public class NonStaticInnerClass {
        public void method() {
            OuterClass.this.x = 5;
        }
    }

    public static class StaticInnerClass {
        public void method() {
            // OuterClass.this.x = 5;
        }
    }
}

