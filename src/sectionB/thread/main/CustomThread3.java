package sectionB.thread.main;

public class CustomThread3 {

    private final String threadName;
    private final long sleepTime;
    private final ThreadType threadType;

    public CustomThread3(String threadName) {
        this.threadName = threadName;
        sleepTime = 0;
        threadType = ThreadType.IDLE_THREAD;
    }

    public CustomThread3(String threadName, long sleepTime) {
        this.threadName = threadName;
        this.sleepTime = sleepTime;
        threadType = ThreadType.IDLE_THREAD;
    }

    public CustomThread3(String threadName, long sleepTime, ThreadType threadType) {
        this.threadName = threadName;
        this.sleepTime = sleepTime;
        this.threadType = threadType;

    }

    public String getThreadName() {
        return threadName;
    }

    public long getSleepTime() {
        return sleepTime;
    }

    public Runnable createThread(String threadName) {
        return () -> {
            System.out.println(threadName + " is created!");
            switch (this.threadType) {
                case APP_THREAD :
                case GAME_THREAD:
                case IDLE_THREAD:
                case WORKER_THREAD:
            }
        };
    }

    public Runnable createThread(String threadName, long sleepTime) {
        return () -> {
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            System.out.println(threadName + " is created!");
        };
    }

    enum ThreadType {
        IDLE_THREAD,
        WORKER_THREAD,
        GAME_THREAD,
        APP_THREAD;
    }

}
