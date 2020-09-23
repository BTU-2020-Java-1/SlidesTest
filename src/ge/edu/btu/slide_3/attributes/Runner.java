package ge.edu.btu.slide_3.attributes;

public class Runner {

    public static void main(String[] args) {
        Box box = new Box();
        box.width = 10;
        box.length = 15;
        box.height = 5;
//        box.PROVIDER_COMPANY = "new value";     Compilation error
        System.out.println("ყუთის ფართობია " + (box.width * box.length * box.height));
    }
}



