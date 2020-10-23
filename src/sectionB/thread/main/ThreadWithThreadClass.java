/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 12:37 PM
 *  File Name : ThreadWithThreadClass.java
 * */
package sectionB.thread.main;

public class ThreadWithThreadClass extends Thread {

    private static final int LIMIT = 10;

    // 1. create a public constructor
    public ThreadWithThreadClass() {
        // call the super constructor
        super("T2");
    }

    // 2. override the run method from the Thread class
    @Override
    public void run() {
        System.out.println("T2 has started.");
        for (int index = 0; index < LIMIT; index++) {
            System.out.println("T2: " + index);
        }
        System.out.println("T2 has stopped.");
    }
}
