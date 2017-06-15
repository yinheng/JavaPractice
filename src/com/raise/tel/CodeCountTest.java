package com.raise.tel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by 尹恒 on 2017/5/19.
 */
public class CodeCountTest {
    public static void main(String[] args) {
        CodeCountTest c = new CodeCountTest();
        c.codeCount("f:\\cygwin\\home\\尹恒\\JavaPractice\\src\\com");
    }

    public void codeCount(String path) {
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
                    codeCount(files[i].getPath());
                }
            }
            System.out.println("the total code is " + num);
        } else {
            System.out.println("file not found");
        }
    }
}
