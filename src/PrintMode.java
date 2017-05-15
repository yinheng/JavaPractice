
/**
 * Created @2017/5/13 12:16
 */
public class PrintMode {

    public static void main(String[] arg) {
        for (int i = 0; i <= 7; i++) {
            new PrintMode().printMode(i);
        }
    }

    public void printMode(int num) {

    }

    enum Mode implements Cursor<Mode> {
        R {
            @Override
            public Mode getNext() {
                return W;
            }

            @Override
            public Mode getPrev() {
                return null;
            }

            @Override
            public int getValue() {
                return 4;
            }
        },

        W {
            @Override
            public Mode getNext() {
                return X;
            }

            @Override
            public Mode getPrev() {
                return R;
            }

            @Override
            public int getValue() {
                return 2;
            }
        },

        X {
            @Override
            public Mode getNext() {
                return null;
            }

            @Override
            public Mode getPrev() {
                return W;
            }

            @Override
            public int getValue() {
                return 1;
            }
        }
    }

    interface Cursor<T> {
        T getNext();

        T getPrev();

        int getValue();
    }
}
