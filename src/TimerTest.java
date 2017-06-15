import org.junit.*;
import org.junit.Test;

/**
 * Created @2017/6/11 15:46
 */
public class TimerTest {
    @Test
    public void timerTest() {
        Assert.assertNotNull(Timer.getTimer());
    }
}
