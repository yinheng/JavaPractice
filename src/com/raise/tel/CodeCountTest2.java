package com.raise.tel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by 尹恒 on 2017/5/19.
 */
public class CodeCountTest2 {
    public static void main(String[] args) {
        CodeCountTest2 c = new CodeCountTest2();
        long lines = c.codeCount("d:\\cygwin\\home\\guohao4\\work\\testcases\\app\\src");
        System.out.println("Count = " + lines);
    }

    public long codeCount(String path) {
        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            File files[] = file.listFiles();
            long num = 0;
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    String end = files[i].getName();
                    if (end.endsWith(".java")) {
                        try {
                            BufferedReader br = new BufferedReader(new FileReader(files[i].getPath()));
                            while (br.readLine() != null) {
                                num++;
                            }
                            br.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    num += codeCount(files[i].getPath());
                }
            }
            return num;
        } else {
            System.out.println("file not found");
            return 0;
        }
    }
}
