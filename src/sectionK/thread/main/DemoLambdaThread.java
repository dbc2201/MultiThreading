package sectionK.thread.main;

import javax.swing.*;

public class DemoLambdaThread {

    public void createLambdaThread() {
        Runnable lambdaThread = () -> JOptionPane.showMessageDialog(
                null,
                "This thread was created inside a method of a definition class!",
                "Lambda Thread",
                JOptionPane.WARNING_MESSAGE
        );
        lambdaThread.run();
    }

}
