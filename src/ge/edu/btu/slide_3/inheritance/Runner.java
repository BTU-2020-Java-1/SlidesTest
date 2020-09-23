package ge.edu.btu.slide_3.inheritance;

public class Runner {

    public static void main(String[] args) {
        MountainBike bike = new MountainBike("Bike name", 50, 20.0);
        System.out.println(bike.getName() + " - max speed: " +
                bike.getMaxSpeed() + "; Seat height: " + bike.getSeatHeight());
    }
}


