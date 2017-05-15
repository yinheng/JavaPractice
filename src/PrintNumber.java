import java.util.Random;

/**
 * Created @2017/5/13 11:47
 */
public class PrintNumber {

    public static void main(String[] arg) {
        PrintNumber no = new PrintNumber();
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            no.printNumber(r.nextInt(9999));
        }
    }


    public void printNumber(int no) {
        String str = String.valueOf(no);

        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                System.out.print(str.charAt(i));
            } else System.out.print(str.charAt(i) + ",");
        }

        System.out.println();
    }
}
