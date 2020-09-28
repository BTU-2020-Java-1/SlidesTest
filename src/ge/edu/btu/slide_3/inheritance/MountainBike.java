package ge.edu.btu.slide_3.inheritance;

public class MountainBike extends Bicycle {
    private double seatHeight;

    public MountainBike() {
    }
    public MountainBike(String name, int maxSpeed, double seatHeight) {
        super(name, maxSpeed);
        this.seatHeight = seatHeight;
    }

    public double getSeatHeight() {
        return seatHeight;
    }
    public void setSeatHeight(double seatHeight) {
        this.seatHeight = seatHeight;
    }
}

