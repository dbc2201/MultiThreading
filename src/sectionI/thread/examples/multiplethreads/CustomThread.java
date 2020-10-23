/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 4:12 PM
 *  File Name : Thread1.java
 * */
package sectionI.thread.examples.multiplethreads;

public class CustomThread implements Runnable {
    private final Thread thread;
    private String threadName;
    private long sleepDurationMill;
    private static final int LIMIT = 20;

    public CustomThread(String threadName) {
        this.thread = new Thread(this, threadName);
    }

    public CustomThread(String threadName, long sleepDurationMill) {
        this.thread = new Thread(this, threadName);
        this.sleepDurationMill = sleepDurationMill;
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        System.out.println(this.thread.getName() + " has started.");
        for (int i = 0; i < LIMIT; i++) {
            System.out.println(this.thread.getName() + ": " + i);
            try {
                Thread.sleep(sleepDurationMill > 0L ? sleepDurationMill : 1000L);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println(this.thread.getName() + " has stopped.");
    }
}
