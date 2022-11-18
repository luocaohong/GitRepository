package com.java.test5;

import java.io.*;

public class Test05 {
    public static void main(String[] args) {
        File file1 = new File("D:\\IOTest\\1.png");
        File file2 = new File("D:\\IOTest\\1\\2.png");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(file1));
            bos = new BufferedOutputStream(new FileOutputStream(file2));
            byte[] buf = new byte[10];
            int len;
            while ((len = bis.read(buf)) != -1){
                bos.write(buf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
