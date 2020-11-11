package ge.edu.btu.slide_10.synchronizedtest;

public class Runner {

    public static void main(String[] args) {
        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();
        new Thread() {
            @Override
            public void run() {
                synchronizedCounter.increment();
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                synchronizedCounter.decrement();
            }
        }.start();
    }
}

