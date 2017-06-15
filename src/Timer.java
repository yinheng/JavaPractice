/**
 * Created @2017/6/11 15:42
 */
public class Timer {

    private Timer() {

    }

    private static Timer timer = new Timer();

    public static Timer getTimer() {
        return timer;
    }
}
