/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 22/10/20
 *  Time: 3:36 PM
 *  File Name : THread2.java
 * */
package sectionI.thread.examples;

public class Thread2 extends Thread {
    private static final int LIMIT = 10;

    Thread2() {
        super("T2");
        // this is calling the constructor of the Thread class
        // and we are passing the name of the thread we want to create.
    }

    @Override
    public void run() {
        for (int index = 0; index < LIMIT; index++) {
            System.out.println(Thread.currentThread().getName() + ": " + index);
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
