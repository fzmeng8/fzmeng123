package IterDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class bufferDemo {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("text"))) {
            bis.mark(Integer.MAX_VALUE);
            System.out.print((char) bis.read());
            System.out.print((char) bis.read());
            System.out.print((char) bis.read());
            System.out.println((char) bis.read());
            bis.reset();
            System.out.print((char) bis.read());
            System.out.println((char) bis.read());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
