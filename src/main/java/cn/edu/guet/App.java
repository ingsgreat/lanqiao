package cn.edu.guet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
        运行时异常
        int a=3;
        int b=0;
        int c=a/b;

        零除异常

        不需要处理，并不是不处理

        System.out.println("C的值: "+c);
         */

        /*
        检查异常：必须在编译的时候进行处理，处理方案有两种：
        1、用try块把有可能发生异常的代码包起来（拆）
        2、抛出（扔的远远的）
        何时需要try处理？何时需要抛出？
         */
        try {
            FileReader fr=new FileReader("F:\\aa.txt");
            fr.read();
            Connection conn= DriverManager.getConnection("dddd");
        } catch (FileNotFoundException e) {
            System.out.println("文件没找到，请检查路径是否正确或文件名是否正确");
            //e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}