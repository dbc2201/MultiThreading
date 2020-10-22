/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 22/10/20
 *  Time: 3:15 PM
 *  File Name : Example1.java
 * */
package sectionI.thread.examples;

public class Example1 {
    private static final int LIMIT = 10;
    public static void main(String[] args) {
        for (int index = 0; index < LIMIT; index++) {
            System.out.println(index);
            try {
                Thread.sleep(1000L); // wait for 300 ms
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
