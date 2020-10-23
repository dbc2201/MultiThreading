/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 1:03 PM
 *  File Name : Main.java
 * */
package sectionF.thread.main;

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
    }
}
