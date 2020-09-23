package ge.edu.btu.slide_3.override;

public class Rectangle extends Figure {
    private double width;
    private double length;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }
}

