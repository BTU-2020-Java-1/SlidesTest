package ge.edu.btu.slide_10.synchronizedtest;

public class SynchronizedCounter {

    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public synchronized void decrement() {
        counter--;
    }

    public synchronized int getValue() {
        return counter;
    }
}


