package sectionB.thread.main;

import javax.swing.*;

public class LambdaThread {

    // The State of the thread
    // The Priority of the thread

    public Runnable createThread() {
        return () -> JOptionPane.showMessageDialog(
                null,
                "Simple Lambda Thread",
                "createThread() method",
                JOptionPane.WARNING_MESSAGE
        );
    }

    public void createLambdaExpressionThread() {
        Runnable thread = createThread();
        thread.run();
    }
}
class LambdaThreadMain {
    public static void main(String[] args) {
        LambdaThread t1 = new LambdaThread();
        t1.createLambdaExpressionThread();
        // Anonymous Class (Anonymous: with no name) -> Is a class with no name!
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(
                        null,
                        "The Anonymous Class Thread is running!",
                        "Thread for Anonymous Class",
                        JOptionPane.PLAIN_MESSAGE
                );
            }
        };
        thread.run();
        Runnable lambdaThread = () -> JOptionPane.showConfirmDialog(
                null,
                "The Lambda Thread is running!",
                "Lambda Thread",
                JOptionPane.DEFAULT_OPTION
        );
        lambdaThread.run();
    }
}
