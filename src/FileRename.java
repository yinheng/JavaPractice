import java.io.File;
import java.util.ArrayList;

/**
 * Created by 尹恒 on 2017/5/16.
 */
public class FileRename {
    public static void main(String[] args) {
        FileRename f = new FileRename();
        f.filename(args[0], args[1], args[2]);
    }

    public void filename(String filepath, String prefix, String suffix) {
        File files = new File(filepath);
        String filename[] = files.list();
        if(filename.length == 0 || filename == null)
            System.out.println("无效路径");
        for(int i = 0; i < filename.length; i ++) {
            System.out.println(filename[i]);
            Boolean b = null;
            File oldfile = new File(filepath + File.separator + filename[i]);
            if (!oldfile.isFile()) {
                filename(oldfile.getAbsolutePath(), prefix, suffix );
            }
            else {
                File newfile = new File(filepath + File.separator + prefix + i + suffix);

                System.out.println("previous file:" + oldfile.getAbsolutePath());
                b = oldfile.renameTo(newfile);
                if (!b) {
                    System.out.println("rename failed");
                } else
                    System.out.println("new file:" + newfile.getAbsolutePath());
            }
        }
    }
}
