package ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame() {
        // this 当前创建对象的地址值
        this.setSize(488, 430);
        // 设置界面标题
        this.setTitle("拼图登录");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }
}
