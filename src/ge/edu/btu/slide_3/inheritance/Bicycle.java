package ge.edu.btu.slide_3.inheritance;

public class Bicycle {
    private String name;
    private int maxSpeed;

    public Bicycle() {

    }
    public Bicycle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

