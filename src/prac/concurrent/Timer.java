package prac.concurrent;

/**
 * Created @2017/6/15 10:03
 */
public class Timer {

    private long timeMills;

    public Timer(long timeMills) {
        this.timeMills = timeMills;
    }

    public void start(Object token) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(timeMills);
                } catch (InterruptedException ignored) {

                }

                synchronized (token) {
                    token.notify();
                }
            }
        }).start();
    }
}
