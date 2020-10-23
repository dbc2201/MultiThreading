/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 10:16 AM
 *  File Name : RunnableThread.java
 * */
package sectionK.thread.main;

public class RunnableThread implements Runnable {

    private static final int LIMIT = 10;
    private final Thread thread;

    public RunnableThread() {
        thread = new Thread(this, "T1");
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        System.out.println("The thread \"" + thread.getName() + "\" has started.");
        for (int index = 0; index < LIMIT; index++) {
            System.out.println(thread.getName() + ": " + index);
            // Pausing the thread for some time.
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("The thread \"" + thread.getName() + "\" has stopped.");
    }
}
