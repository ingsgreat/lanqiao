package cn.edu.guet;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class App09 {
    public static void main(String[] args) {
        Map<String,Integer> map=new LinkedHashMap<String, Integer>();
        String string = "this is a test, and that is also a test!";
        String str[] = string.split(",|\\s|!");
        for(String s:str) {
            if (s.length() != 0) {
                Integer count = map.get(s);
                if (count == null) {
                    map.put(s, 1);
                } else {
                    count++;
                    map.put(s, count);
                }
            }
        }
        Set<String> set=map.keySet();
        Iterator<String> iter=set.iterator();
        while(iter.hasNext()){
            String word=iter.next();
            System.out.println(word+":"+map.get(word));
        }
    }
}
