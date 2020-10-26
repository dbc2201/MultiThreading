package sectionO.thread.main.examples;

import javax.swing.*;

public class CustomThread2 extends Thread {

    private final String threadName;

    public CustomThread2(String threadName) {
        super(threadName);
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    @Override
    public void run() {
        // The task for the Thread.
        JOptionPane.showMessageDialog(
                null,
                threadName + " has started!",
                "Title",
                JOptionPane.PLAIN_MESSAGE
        );
        System.out.println(threadName + " has started!");
        for (int index = 0; index < 15; index++) {
            System.out.println(threadName + ": " + index);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println(threadName + " has stopped!");
    }
}
