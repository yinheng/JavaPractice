import java.io.File;

/**
 * Created @2017/5/20 8:22
 */
public class SearchFilesTest {

    public static void main(String[] args) {
        SearchFilesTest s = new SearchFilesTest();
        s.searchFile("d:\\test", "hello.txt");
        // D://test/
        // D://test/Hello, Java.
        // D://test/dir/Hello.
        float f = 3.4f;
        short sh = 1;

        boolean res = a() & b();
        System.out.println("res =" + res);

        int resInt = 1006 & 9;
        System.out.println("resInt=" + resInt);
    }


    private static boolean a() {
        System.out.println("a");
        return false;
    }

    private static boolean b() {
        System.out.println("b");
        return true;
    }

    public void searchFile(String path, String filename) {
        File files = new File(path);
        if (!files.exists() || files.isFile()) {
            System.out.println("file not found");
            return;
        }

        if (files.isDirectory()) {
            File listfiles[] = files.listFiles();
            for (int i = 0; i < listfiles.length; i++) {
                File f = listfiles[i];
                System.out.println("Checking:" + f);
                if (f.isFile()) {
                    String filesname = f.getName();
                    System.out.println("filesmane:" + filesname);
                    if (filesname.equalsIgnoreCase(filename)) {
                        System.out.println("-------------------" + f);
                    }
                } else {
                    searchFile(listfiles[i].getAbsolutePath(), filename);
                }

            }
        }
    }


}
