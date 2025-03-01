package IterDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class demo2 {
    public static void main(String[] args) {

        try (FileOutputStream stream = new FileOutputStream("text",true)){
            stream.write("hello".getBytes());
            stream.write('w');
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (FileInputStream stream = new FileInputStream("text")){
            byte[] buffer = new byte[stream.available()];
            System.out.println(stream.read(buffer));//一次性读取全部内容（返回值是读取的字节数）
            System.out.println(new String(buffer));//通过String(byte[])构造方法得到字符串
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
