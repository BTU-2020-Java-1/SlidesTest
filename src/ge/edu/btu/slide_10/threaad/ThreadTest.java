package ge.edu.btu.slide_10.threaad;

public class ThreadTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            public void run() {
                System.out.println("Message 1");
            }
        };
        Thread thread2 = new Thread() {
            public void run() {
                System.out.println("Message 2");
            }
        };

        thread1.start();
        thread2.start();
    }
}

