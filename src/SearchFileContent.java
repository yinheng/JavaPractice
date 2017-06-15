import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created @2017/5/20 15:48
 */
public class SearchFileContent {
    public static void  main(String[] arg) {
        SearchFileContent ss = new SearchFileContent();
        ss.searchFileContent("d:\\test", "hello");

    }

    public void searchFileContent(String path, String str) {
        File file = new File(path);
        if(!file.exists()) {
            System.out.println("file not found");
        }else {
            File filename[] = file.listFiles();
            for(int i = 0; i <filename.length; i ++ ) {
                File f = filename[i];
                System.out.println(f);
                if(f.isFile() && f.canRead()) {
                    try {
                        BufferedReader br = new BufferedReader(new FileReader(f.getPath()));
                        String s = null;
                        int n = 1;
                        while ((s = br.readLine()) != null) {
                            n ++;
                            if(s.contains(str)) {
                                System.out.println("文件路径是：" + f.getPath());
                                System.out.println("包含字符串的行号是：" +  n);
                            }
                        }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
                if(f.isDirectory()) {
                    searchFileContent(f.getPath(), str);
                }
            }
        }
    }
}
