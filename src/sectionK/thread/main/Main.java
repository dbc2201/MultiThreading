/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 10:28 AM
 *  File Name : Main.java
 * */
package sectionK.thread.main;

public class Main {
    public static void main(String[] args) {
        // When the main() method starts executing,
        // the compiler will automatically create a thread called the
        // 'main' thread.
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());
        RunnableThread thread1 = new RunnableThread();
        thread1.getThread().start(); // <- Preferable Choice for running the thread.
//        thread1.getThread().run();
//        thread1.run();
    }
}
