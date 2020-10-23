/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 4:30 PM
 *  File Name : Example1.java
 * */
package sectionI.thread.examples.lambdawithrunnable;

public class Example1 {
    public static void main(String[] args) {
        Runnable thread = () -> {
            System.out.println("The thread has started.");
            for (int index = 0; index < 10; index++) {
                System.out.println("Thread: " + index);
                try {
                    Thread.sleep(1500L);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
            System.out.println("The thread has stopped.");
        };
        thread.run();
    }
}
