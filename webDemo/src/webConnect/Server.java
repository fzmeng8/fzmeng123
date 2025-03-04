package webConnect;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8080)) {    //将服务端创建在端口8080上
            Socket socket = server.accept();
            InputStream in = socket.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream("net/data.txt");
            byte[] bytes = new byte[1024];
            int i;
            while ((i = in.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, i);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
