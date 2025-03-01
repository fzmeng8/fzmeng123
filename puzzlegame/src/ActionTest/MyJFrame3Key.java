package ActionTest;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3Key extends JFrame implements KeyListener {
    public MyJFrame3Key() {
        this.setSize(603, 680);
        this.setTitle("拼图单机版");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);// 界面居中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        // 给整个窗体添加键盘监听
        // 调用者this：本类对象，当前的界面对象，表示我要给整个界面添加监听
        // addKeyListener：表示要给本界面添加键盘监听
        // 参数this：事件触发以后，会执行本类代码
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Released");
        switch (e.getKeyCode()) {
            case 65:
                System.out.println("A");
                break;
            case 66:
                System.out.println("B");
                break;
        }
    }
}
