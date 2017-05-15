import java.util.Arrays;
import java.util.Random;

/**
 * Created @2017/5/13 15:01
 */
public class NumberTest {

    public final static void main(String[] args) {

        int[] nums = new int[4];

        System.out.println("Num: before=" + Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {

            System.out.println("Num: For enter=" + Arrays.toString(nums));

            nums[i] = getUnContain(nums);

            System.out.println("Num: After=" + Arrays.toString(nums));
        }

        System.out.println("----------------  " + Arrays.toString(nums));

        String result = "";

        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }

        System.out.println("Res = " + result);
    }

    public static int getUnContain(int[] exp) {

        System.out.println("Get: exp=" + Arrays.toString(exp));

        int r = new Random().nextInt(10);

        System.out.println("Random = " + r);

        for (int i = 0; i < exp.length; i++) {
            if (r == exp[i]) {
                return getUnContain(exp);
            }
        }

        return r;
    }
}
