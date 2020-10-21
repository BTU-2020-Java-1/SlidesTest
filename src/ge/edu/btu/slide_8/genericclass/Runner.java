package ge.edu.btu.slide_8.genericclass;

public class Runner {

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setT(10);
        printBox(box);
    }

    public static void printBox(Box<?> box) {
        System.out.println(box.getT());
    }
}


