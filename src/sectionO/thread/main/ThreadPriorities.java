package sectionO.thread.main;

import javax.swing.*;

public class ThreadPriorities {
    public static void main(String[] args) {
        Runnable lambdaExpressionThread = () -> {
            final Thread thread = new Thread("T1");
            thread.setPriority(Thread.MAX_PRIORITY);
            JOptionPane.showMessageDialog(
                    null,
                    String.format(
                            "%s\n%s\n%s",
                            "The Thread has started!",
                            "Thread Priority: " + thread.getPriority(),
                            "Thread State: " + thread.getState()
                    ),
                    "Lambda Expression Thread",
                    JOptionPane.PLAIN_MESSAGE
            );
        };
        lambdaExpressionThread.run();
        // State of the Thread
        // Priority of the Thread
        // an integer number from 1 to 10
        // 1 -> Minimum Priority
        // 5 -> Normal Priority (Default Priority)
        // 10 -> Maximum Priority
    }
}
