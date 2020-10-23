/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 4:12 PM
 *  File Name : Thread1.java
 * */
package sectionI.thread.examples.multiplethreads;

public class Thread1 implements Runnable {
    private final Thread thread;
    private String threadName;

    public Thread1(String threadName) {
        this.thread = new Thread(this, threadName);
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {

    }
}
