package prac.concurrent;

/**
 * Created @2017/6/15 10:03
 */
public class WaitAndNotifyDemo {

    public static void main(String[] args) {

        Timer timer = new Timer(3 * 1000);

        Object lock = new Object();

        timer.start(lock);

        try {
            synchronized (lock) {
                lock.wait();
            }
            System.out.println("Time on!!!!");
        } catch (InterruptedException ignored) {

        }

        main2(args);
    }


    public static void main2(String[] args) {

        Timer timer = new Timer(3 * 1000);

        Object lock = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (lock) {
                        lock.wait();
                    }
                    System.out.println("Time on!!!!");
                } catch (InterruptedException ignored) {

                }
            }
        }).start();

        timer.start(lock);
    }

}
