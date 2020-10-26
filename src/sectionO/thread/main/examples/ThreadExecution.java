package sectionO.thread.main.examples;

import javax.swing.*;

public class ThreadExecution {
    public static void main(String[] args) {

        CustomThread1 thread1 = new CustomThread1();
        CustomThread2 thread2 = new CustomThread2("T2");

        Runnable thread3 = () -> {
            JOptionPane.showMessageDialog(
                    null,
                    "Running a thread with Lambda Expression!",
                    "Title",
                    JOptionPane.PLAIN_MESSAGE
            );
        };

        // JavaFX: GUI (Graphical User Interface) Building Library

        try {
            thread1.getThread().setPriority(Thread.MAX_PRIORITY);
            thread1.getThread().start();
            thread2.start();
            thread3.run();
            for (int index = 0; index < 20; index++) {
                System.out.println(Thread.currentThread().getName() + ": " + index);
                Thread.sleep(2000L);
                System.out.println(thread1.getThread().getName());
                System.out.println(thread1.getThread().getPriority());
                System.out.println(thread1.getThread().getState());
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }




        System.out.println(Thread.currentThread() + " has stopped!");
    }
}
