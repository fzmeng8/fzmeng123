package IterDemo;

import java.io.*;

public class demo2 {
    public static void main(String[] args) {

        try (FileOutputStream stream = new FileOutputStream("text",true)){
            stream.write("hello".getBytes());
            stream.write('w');
            stream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (FileOutputStream outputStream = new FileOutputStream("text",true);
             FileInputStream inputStream = new FileInputStream("test")){
                byte[] buffer = new byte[1024];
                int temp;
                while ((temp = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, temp);
                }
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


        try(FileReader reader = new FileReader("test.txt")){
            char[] str = new char[10];
            reader.read(str); // 读取字符存入str中
            System.out.println(str);   //直接读取到char[]中
        } catch (IOException e){
            e.printStackTrace();
        }

        File file = new File("test.txt");
        System.out.println(file.getAbsolutePath());
    }
}
