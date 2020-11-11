package ge.edu.btu.slide_10.runnable;

public class CustomRunnable implements Runnable {

    private String message;
    public CustomRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}

