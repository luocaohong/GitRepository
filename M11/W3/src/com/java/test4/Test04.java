package com.java.test4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        String s = "HelloJavaWorld你好世界";
        File file = new File("D:\\IOTest\\Hello.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(s);
        fileWriter.close();
    }
}
