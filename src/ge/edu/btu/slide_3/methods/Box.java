package ge.edu.btu.slide_3.methods;

public class Box {
    double width;
    double length;
    double height;

    double volume() {
        return width * length * height;
    }

    double capacity(double r) {
        return volume() * r;
    }

    void printInfo() {
        System.out.println("პარამეტრები: " + width + "X" + length + "X" + height);
    }
}





