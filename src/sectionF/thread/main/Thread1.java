/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 1:16 PM
 *  File Name : Thread1.java
 * */
package sectionF.thread.main;

public class Thread1 implements Runnable {

    private static final int LIMIT = 10;
    // 1. a private final field of the Thread type
    private final Thread thread;

    public Thread1() {
        thread = new Thread(this, "T1");
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        // here we can specify the task for our thread.
        System.out.println(thread.getName() + " has started.");
        for (int index = 0; index < LIMIT; index++) {
            System.out.println(thread.getName() + ": " + index);
        }
        System.out.println(thread.getName() + " has stopped.");
    }
}
