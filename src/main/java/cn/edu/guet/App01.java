package cn.edu.guet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App01 {
    public static void main(String[] args) {
        int port=1025;
        boolean flag=true;
        while(flag) {
            try {
                ServerSocket ss = new ServerSocket(port);//程序默认端口是1688
                flag=false;
                System.out.println("kkkkk: "+port);
                //只要第18行可以执行，就证明第17行没有异常（说明port可以使用）
                System.out.println("AAAAA");
            } catch (IOException e) {
                port = port + 1;
                System.out.println("sssssssss: "+port);
                //e.printStackTrace();//给程序员
            }
            System.out.println("BBBBB");
        }
    }
    public static void WordCounter(String sentence){

    }
}
