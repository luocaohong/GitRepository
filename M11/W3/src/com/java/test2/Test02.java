package com.java.test2;

import java.io.File;

public class Test02 {
    static int level;
    public static void main(String[] args) {
        File file = new File("D:\\IOTest");
        showFile(file);

    }
    public static void showFile(File file){
        if(file == null || !file.exists()){
            return;
        }
        level++;
        File[] files = file.listFiles();
        for(File f : files){
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(f.getName());
            if (f.isDirectory()){
                showFile(f);
            }
        }
        level--;
    }
}
