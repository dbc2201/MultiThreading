/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 10:44 AM
 *  File Name : ThreadClassThread.java
 * */
package sectionK.thread.main;

public class ThreadClassThread extends Thread {

    private static final int LIMIT = 20;

    public ThreadClassThread() {
        super("T2");
    }

    @Override
    public void run() {
        System.out.println("The thread T2 has started.");
        for (int index = 0; index < LIMIT; index++) {
            System.out.println("T2: " + index);
            try {
                Thread.sleep(800L);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("The thread T2 has stopped.");
    }

}
