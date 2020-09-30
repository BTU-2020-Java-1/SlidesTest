package ge.edu.btu.slide_5.innerclasses;

public class Runner {

    public static void main(String[] args) {
        OuterClass.NonStaticInnerClass nonStaticInnerClass = new OuterClass().new NonStaticInnerClass();

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
    }
}

