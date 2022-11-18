package com.java.test1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class test01 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/HelloWorld.txt");
        boolean flag1 = file.isFile();
        boolean flag2 = file.isDirectory();
        System.out.println(flag1);
        System.out.println(flag2);
        File file1 = new File("D:/IOTest");
        file1.mkdir();
        File file2 = new File("D:/IOTest/HelloWorld.txt");
        boolean b = file.renameTo(file2);
        String[] list = file1.list();
        System.out.println(b);
        System.out.println(Arrays.toString(list));
    }
}
