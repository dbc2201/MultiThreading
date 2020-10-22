/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 22/10/20
 *  Time: 3:30 PM
 *  File Name : ThreadRunner.java
 * */
package sectionI.thread.examples;

public class ThreadRunner {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
//        thread1.run();
//        thread1.getThread().run();
        thread1.getThread().start();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The task of the " + Thread.currentThread().getName()
                + " has finished.");
    }
}
