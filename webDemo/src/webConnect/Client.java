package webConnect;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    //客户端
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080)){
            FileInputStream fileInputStream = new FileInputStream("text");
            OutputStream outputStream = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int i;
            while ((i = fileInputStream.read(bytes)) != -1){
                outputStream.write(bytes, 0, i);
            }
            outputStream.flush();
            outputStream.close();
        }catch (IOException e){
            System.out.println("服务端连接失败！");
            e.printStackTrace();
        }
    }
}
