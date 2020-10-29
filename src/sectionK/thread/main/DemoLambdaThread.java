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

class Main1 {
    public static void main(String[] args) {
        DemoLambdaThread object1 = new DemoLambdaThread();
        object1.createLambdaThread();
    }
}
