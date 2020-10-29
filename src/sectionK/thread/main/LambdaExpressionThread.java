package sectionK.thread.main;

import javax.swing.*;

public class LambdaExpressionThread {
    public static void main(String[] args) {
        // Create a reference variable of the Runnable Functional Interface type.
        // Anonymous Class (Anonymous: with no name) -> A class with no name!
        Runnable anonymousClassThread = new Runnable() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(
                        null,
                        "The Anonymous Class Thread is running!",
                        "Anonymous Class Thread",
                        JOptionPane.QUESTION_MESSAGE
                );
            }
        } ;
        anonymousClassThread.run();
        Runnable lambdaThread = () -> JOptionPane.showConfirmDialog(
                null,
                "The Lambda Thread is running!",
                "Lambda Thread",
                JOptionPane.DEFAULT_OPTION
        );
        lambdaThread.run();
    }
}
