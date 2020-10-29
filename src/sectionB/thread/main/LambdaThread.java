package sectionB.thread.main;

import javax.swing.*;

public class LambdaThread {

}
class LambdaThreadMain {
    public static void main(String[] args) {
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
