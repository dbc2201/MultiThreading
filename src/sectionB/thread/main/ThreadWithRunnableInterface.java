/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 12:14 PM
 *  File Name : ThreadWithRunnableInterface.java
 * */
package sectionB.thread.main;

import javax.swing.*;

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
        JOptionPane.showMessageDialog(
                null,
                "Thread using Runnable Interface.\n" +
                        "Thread Priority: " + thread.getPriority() + ".\n" +
                        "Thread State: " + thread.getState() + ".",
                "Thread using Runnable Interface",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
