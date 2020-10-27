package sectionF.thread.main;

import javax.swing.JOptionPane;

public class CustomThread implements Runnable {
    @Override
    public void run() {
        JOptionPane.showMessageDialog(
                null,
                "The thread has started!",
                "Custom Thread",
                JOptionPane.WARNING_MESSAGE
        );
    }
}
