/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 1:16 PM
 *  File Name : Thread1.java
 * */
package sectionF.thread.main;

public class Thread1 implements Runnable {

    // 1. a private final field of the Thread type
    private final Thread thread;

    public Thread1() {
        thread = new Thread(this, "T1");
    }

    @Override
    public void run() {
        // here we can specify the task for our thread.
    }
}
