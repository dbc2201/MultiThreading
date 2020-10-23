/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 4:24 PM
 *  File Name : PriorityExample.java
 * */
package sectionI.thread.examples.priorities;

import sectionI.thread.examples.multiplethreads.CustomThread;

public class PriorityExample {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread("T1", 2500L);
        t1.getThread().setPriority(Thread.MAX_PRIORITY);
        CustomThread t2 = new CustomThread("T2", 1000L);
        t2.getThread().setPriority(Thread.NORM_PRIORITY);
        CustomThread t3 = new CustomThread("T3", 500L);
        t3.getThread().setPriority(Thread.MIN_PRIORITY);
        t1.getThread().start();
        t2.getThread().start();
        t3.getThread().start();
    }
}
