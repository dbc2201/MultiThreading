/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 3:33 PM
 *  File Name : Main.java
 * */
package sectionO.thread.main;

public class Main {
    public static void main(String[] args) {
        // The compiler will automatically
        // generate a thread to run this main() method.
        // The thread will be aptly called "main".
        // 1. All the other threads will be created from the main thread.
        // 2. It is the last thread to stop execution because the compiler
        // uses it for cleanup operations.
        // To interact with the main thread, we have to create a reference
        // variable of the Thread type.
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread);
        // Thread[1,2,3]
        // 1 -> name of the thread
        // 2 -> priority of the thread (int)
        // 3 -> name of the method that is executing the thread
        mainThread.setName("GLA");
        System.out.println(mainThread);
    }
}
