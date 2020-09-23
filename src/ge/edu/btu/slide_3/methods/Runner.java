package ge.edu.btu.slide_3.methods;

public class Runner {

    public static void main(String[] args) {
        Box box = new Box();
        box.width = 10;
        box.length = 15;
        box.height = 5;
        System.out.println("ყუთში ჩაეტევა " + box.capacity(1000) + " წყალი");
        box.printInfo();
    }
}


