/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 4:17 PM
 *  File Name : Main.java
 * */
package sectionI.thread.examples.multiplethreads;

public class Main {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread("T1");
        CustomThread t2 = new CustomThread("T2");
        CustomThread t3 = new CustomThread("T3");

        t1.getThread().start();
        t2.getThread().start();
        t3.getThread().start();
    }
}
