/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 1:03 PM
 *  File Name : Main.java
 * */
package sectionF.thread.main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // to interact with the main thread
        // first, we have to store the reference to the main thread
        // in a reference variable of the Thread type.
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread);
        // Thread[1,2,3]
        // 1. the name of the thread,
        // 2. the priority of the thread,
        // 3. the name of the method which is executing the current thread.
        mainThread.setName("GLA");
        System.out.println(mainThread);
        Thread1 t1 = new Thread1();
        t1.getThread().start();
        Thread2 t2 = new Thread2();
        t2.start();
        // Anonymous Class (Anonymous: No Name) -> A class with no name!
        Runnable runnableThread = new Runnable() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(
                        null,
                        "Thread with Anonymous class",
                        "Anonymous class",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        };
        runnableThread.run();
        // By using a lambda expression,
        // we are able to use code as data for a variable.
        int number = 4;
        Runnable lambdaThread = () -> {
            JOptionPane.showMessageDialog(
                    null,
                    "Thread with Lambda Expression",
                    "Lambda Thread",
                    JOptionPane.INFORMATION_MESSAGE
            );
        };
        lambdaThread.run();
    }
}
