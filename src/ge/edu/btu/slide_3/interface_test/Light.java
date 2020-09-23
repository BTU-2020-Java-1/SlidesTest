package ge.edu.btu.slide_3.interface_test;

public class Light implements ILight {
    private boolean on;

    @Override
    public void on() {
        on = true;
    }
    @Override
    public void off() {
        on = false;
    }
    @Override
    public boolean isOn() {
        return on;
    }
}

