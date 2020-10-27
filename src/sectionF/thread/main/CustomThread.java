package sectionF.thread.main;

import javax.swing.JOptionPane;

public class CustomThread implements Runnable {

    private final String threadName;
    private final Thread thread;

    public CustomThread(String threadName) {
        this.threadName = threadName;
        this.thread = new Thread(this, threadName);
        this.thread.setPriority(Thread.MAX_PRIORITY);
        // 1 -> Minimum Priority
        // 5 -> Normal Priority (Default Priority)
        // 10 -> Maximum Priority
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
                threadName + " has started!" +
                "\n Thread Priority: " + thread.getPriority() +
                "\n Thread State: " + thread.getState() + ".",
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

class CustomThreadExecution {
    public static void main(String[] args) {
        CustomThread thread = new CustomThread("PUBG");
        thread.getThread().start();
    }
}