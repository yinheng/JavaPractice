import java.io.*;

/**
 * Created by 尹恒 on 2017/5/19.
 */
public class ReplaceTest {
    public static void main(String[] arg) {
        ReplaceTest r = new ReplaceTest();

        r.replace("f:\\test\\test.txt", "java", "hello");
    }

    public void replace(String path, String oldstr, String newstr) {
        File f = new File(path);
        if(f.exists() && f.isFile() && f.canWrite()) {
            try {
                FileReader fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr);
                BufferedWriter bw = new BufferedWriter(new FileWriter("f:\\test\\tmp.txt"));

                while (br.readLine() != null) {
                    String s = br.readLine();
                    System.out.println(s);
                    String ss = s.replace(oldstr, newstr);
                    bw.write(ss);
                    bw.newLine();
                    bw.close();
                    bw.flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
