package com.java.test6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Test06 {
    public static void main(String[] args) {
        File file = new File("D:\\IOTest\\calcCharNum.txt");
        Map<Character,Integer> map = new HashMap<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            int c = 0;
            while ((c = br.read()) != -1){
                char ch = (char) c;
                if(ch >= 'A' && ch <= 'z'){
                    if(map.get(ch) == null){
                        map.put(ch,1);
                    }else {
                        map.put(ch,map.get(ch) + 1);
                    }
                }
            }
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                System.out.print(entry.getKey() + "(" + entry.getValue() + "),");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
