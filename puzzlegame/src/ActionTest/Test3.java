package ActionTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(603, 680);
        jFrame.setTitle("事件演示");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);// 界面居中
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        JButton jbt = new JButton("点我啊");
        jbt.setBounds(0, 0, 100, 30);
        // 给jbt添加动作监听
        // jbt：组件对象，表示对哪个组件添加时间
        // addActionListener：表示我要给组件哪个时间监听（动作监听鼠标左键点击，空格）
        // 参数：事件被触发之后要执行的代码
        // 匿名内部类
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        });
        jFrame.getContentPane().add(jbt);
        jFrame.setVisible(true);
    }
}
