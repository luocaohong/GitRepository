package com.java.test3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\IOTest\\HelloWorld.txt");
        FileReader fileReader = new FileReader(file);
        char[] buf = new char[5];
        int len;
        while ((len = fileReader.read(buf)) != -1){
            System.out.print(new String(buf, 0, len));
        }
        fileReader.close();
    }
}
