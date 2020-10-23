/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 12:14 PM
 *  File Name : ThreadWithRunnableInterface.java
 * */
package sectionB.thread.main;

public class ThreadWithRunnableInterface implements Runnable {

    private static final int LIMIT = 10;
    private final Thread thread;

    public ThreadWithRunnableInterface() {
        thread = new Thread(this, "T1");
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " has started.");
        for (int index = 0; index < LIMIT; index++) {
            System.out.println(thread.getName() + ": " + index);
        }
        System.out.println(thread.getName() + " has stopped.");
    }
}
