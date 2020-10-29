package sectionK.thread.main;

import javax.swing.*;

public class DemoLambdaThread {

    public void createLambdaThread() {
        Runnable lambdaThread = () -> {
            final Thread thread = new Thread("T1");
            thread.setPriority(Thread.MAX_PRIORITY);
            JOptionPane.showMessageDialog(
                    null,
                    "This thread was created inside a method of a definition class!\n"
                            + "Thread State: " + thread.getState() + "\n"
                            + "Thread Priority: " + thread.getPriority(),
                    "Lambda Thread",
                    JOptionPane.WARNING_MESSAGE
                    /*
                    * Thread Priorities
                    * Minimum Priority: 1
                    * Maximum Priority: 10
                    * Normal Priority: 5 (Default Priority)
                    * */
            );
        };
        lambdaThread.run();
    }

}

class Main1 {
    public static void main(String[] args) {
        DemoLambdaThread object1 = new DemoLambdaThread();
        object1.createLambdaThread();
    }
}
