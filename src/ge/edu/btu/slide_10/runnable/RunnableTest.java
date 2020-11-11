package ge.edu.btu.slide_10.runnable;

public class RunnableTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new CustomRunnable("Message 1"));
        Thread thread2 = new Thread(new CustomRunnable("Message 2"));
        Thread thread3 = new Thread(new CustomRunnable("Message 3"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

