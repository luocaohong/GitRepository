package com.java.test7;

import java.io.*;
import java.util.Scanner;

public class Test07 {
        static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.next();
        if("type".equals(s)){
            DosType();
        }
    }
    public static void DosType(){
        String s = sc.next();
        File file = new File(s);
        int line = 0;
        String len = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            while ((len = br.readLine()) != null){
                System.out.println("#" + ++line+ " " + len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
