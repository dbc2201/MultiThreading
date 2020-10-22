/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 22/10/20
 *  Time: 3:09 PM
 *  File Name : MainThreadDemo.java
 * */
package sectionI.thread.main;

public class MainThreadDemo {
    public static void main(String[] args) {
        // We can store a reference to the main thread
        // inside a reference variable of the Thread class.
        Thread mainThread = Thread.currentThread();
        // The above reference variable stores a reference to the main thread.
    }
}
