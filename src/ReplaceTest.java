import java.io.*;
import java.util.Random;

/**
 * Created by 尹恒 on 2017/5/19.
 */
public class ReplaceTest {
    public static void main(String[] arg) {
        ReplaceTest r = new ReplaceTest();

        r.replace("D:\\android\\workspace\\test.txt", "java", "hello");
    }

    public void replace(String path, String oldstr, String newstr) {
        File f = new File(path);
        if (f.exists() && f.isFile() && f.canWrite()) {
            try {
                FileReader fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr);
                File ff = new File(f.getParentFile() + File.separator + "tmp_" + new Random().nextDouble());
                BufferedWriter bw = new BufferedWriter(new FileWriter(ff));
                String s = null;
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                    String ss = s.replace(oldstr, newstr);
                    bw.write(ss);
                    bw.newLine();
                    bw.flush();
                }

                bw.close();
                br.close();

                f.delete();
                ff.renameTo(f);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("File not found");
        }
    }
}
