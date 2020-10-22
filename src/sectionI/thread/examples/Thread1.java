/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 22/10/20
 *  Time: 3:22 PM
 *  File Name : CreateThread.java
 * */
package sectionI.thread.examples;

public class Thread1 implements Runnable {

    private static final int LIMIT = 10;
    private final Thread thread;

    public Thread1() {
        thread = new Thread(this, "T1");
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        for (int index = 0; index < LIMIT; index++) {
            System.out.println(thread.getName() + ": " + index);
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("The task for the " + thread.getName() + " thread has finished.");
    }
}
