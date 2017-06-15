package com.raise.tel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by 尹恒 on 2017/5/19.
 */
public class CodeCountTest4 {
   static class ResultCount {
        long num ;
        public long getCount() {
            return num;
        }
        public void add(long num) {
            this.num += num;
        }
    }

    public static void main(String[] args) {
        ResultCount rc = new ResultCount();
        CodeCountTest4 c = new CodeCountTest4();
        c.codeCount("d:\\cygwin\\home\\guohao4\\work\\testcases\\app\\src", rc);
        long n = rc.getCount();
        System.out.println("code :" + n);
    }

    public void codeCount(String path, ResultCount resultCount) {
        File file = new File(path);
        long num =0;
        if(file.exists() && file.isDirectory()) {
            File files[] = file.listFiles();
            for(int i = 0; i < files.length; i ++) {
                if(files[i].isFile()) {
                    if(files[i].getName().endsWith(".java")) {
                        System.out.println("Checking file:" + files[i].getPath());
                        try{
                            BufferedReader br = new BufferedReader(new FileReader(files[i].getPath()));
                            while (br.readLine() != null) {
                                num++;
                                resultCount.add(1);
                            }
                        }catch(Exception e) {
                            e.printStackTrace();
                        }
                    }
                }else {
                    codeCount(files[i].getPath(), resultCount);
                }
            }
        }else {
            System.out.println("file not found");
        }
    }
}
