import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created @2017/5/20 16:46
 */
public class FileCopyTest {
    public static void main(String[] arg) {
        FileCopyTest f = new FileCopyTest();
        f.fileCopy("D:\\test\\XQW.mp3", "D:\\test\\abc\\XQW.mp3");
        f.fileCopy("D:\\test\\p.jpg", "D:\\test\\abc\\p.jpg");

    }

    public void fileCopy(String spath, String dpath) {
        try {
            FileInputStream fis = new FileInputStream(spath);
            FileOutputStream fos = new FileOutputStream(dpath);
            int totalByte = fis.available();
            int read = 0;
            int n = 0;
            byte[] buffer = new byte[4096];
            while ((n = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, n);
                fos.flush();
                read += n;
                float per = (float) read / (float) totalByte;
                System.out.println((per * 100) + "%");
            }

            fos.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
