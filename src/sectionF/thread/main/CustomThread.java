package sectionF.thread.main;

import javax.swing.JOptionPane;

public class CustomThread implements Runnable {

    private final String threadName;
    private final Thread thread;

    public CustomThread(String threadName) {
        this.threadName = threadName;
        this.thread = new Thread(this, threadName);
    }

    public Thread getThread() {
        return thread;
    }

    public String getThreadName() {
        return threadName;
    }

    @Override
    public void run() {
        JOptionPane.showMessageDialog(
                null,
                threadName + " has started!",
                "Custom Thread",
                JOptionPane.WARNING_MESSAGE
        );
    }

    public Runnable createAuxiliaryThread() {
        return () -> {
            JOptionPane.showMessageDialog(
                    null,
                    "Auxiliary Thread",
                    "AUX THR",
                    JOptionPane.INFORMATION_MESSAGE
            );
        };
    }
}
