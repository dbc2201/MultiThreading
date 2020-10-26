package sectionO.thread.main.examples;

import java.lang.Runnable;

/**
 * We can create a custom thread in Java
 * by implementing the java.lang.Runnable interface
 * in our definition class for the Custom Thread.
 * */
public class CustomThread1 implements Runnable {
 // CustomThread1 is a TYPE of Runnable
    // Object of a Child class can be passed in place of
    // a reference type of the parent class (Dynamic Method Dispatch)
    private final Thread thread;

    public CustomThread1() {
        thread = new Thread(this, "T1");
    }

    public Thread getThread() {
        return thread;
    }

    private static final int LIMIT = 10;

    @Override
    public void run() {
        // The task for the Thread
        System.out.println(thread.getName() + " has started!");
        for (int index = 0; index < LIMIT; index++) {
            System.out.println(thread.getName() + ": " + index);
            // pause the thread for a little while
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println(thread.getName() + " has stopped!");
    }

}
