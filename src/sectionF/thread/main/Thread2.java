/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 1:35 PM
 *  File Name : Thread2.java
 * */
package sectionF.thread.main;

import javax.swing.*;

public class Thread2 extends Thread {

    private static final int LIMIT = 10;

    // 1 create a public constructor
    public Thread2() {
        // we will call the super constructor
        super("T2");
    }

    @Override
    public void run() {
        System.out.println("T2 has started.");
//        for (int index = 0; index < LIMIT; index++) {
//            System.out.println("T2: " + index);
//            try {
//                Thread.sleep(1000L);
//            } catch (InterruptedException e) {
//                System.err.println(e.getMessage());
//            }
//        }
        JOptionPane.showMessageDialog(
                null,
                "T2 has started",
                "Thread with Thread Class",
                JOptionPane.PLAIN_MESSAGE
        );
        System.out.println("T2 has stopped.");
    }
}
