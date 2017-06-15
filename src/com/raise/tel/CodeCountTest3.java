package com.raise.tel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by 尹恒 on 2017/5/19.
 */
public class CodeCountTest3 {

    static class ResultReceiver {
        private long count;

        public long getCount() {
            return count;
        }

        public void add(long count) {
            this.count += count;
        }
    }

    public static void main(String[] args) {
        CodeCountTest3 c = new CodeCountTest3();
        ResultReceiver resultReceiver = new ResultReceiver();
        c.codeCount("d:\\cygwin\\home\\guohao4\\work\\testcases\\app\\src", resultReceiver);
        System.out.println("All count is:" + resultReceiver.getCount());
    }

    public void codeCount(String path, ResultReceiver resultReceiver) {
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
                    codeCount(files[i].getPath(), resultReceiver); // 使用了传入的同一个receiver。
                }
            }
            resultReceiver.add(num);
        } else {
            System.out.println("file not found");
        }
    }
}
