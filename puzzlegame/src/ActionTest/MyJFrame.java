package ActionTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    JButton jbt1 = new JButton("点我啊");
    JButton jbt2 = new JButton("再点我");

    public MyJFrame() {
        this.setSize(603, 680);
        this.setTitle("拼图单机版");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);// 界面居中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);


        jbt1.setBounds(0, 0, 100, 30);
        jbt1.addActionListener(this); // this 表示本类的对象，事件被触发，就会执行本类的actionPerformed

        jbt2.setBounds(0, 100, 100, 30);
        jbt2.addActionListener(this);

        // 将按钮添加到整个界面
        this.add(jbt1);
        this.add(jbt2);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("actionPerformed");
        // 获取当前被操作的那个按钮对象
        Object source = e.getSource();
        // 对当前的按钮进行判断
        if (source == jbt1) {
            jbt1.setSize(200,200);
        } else if (source == jbt2) {
            Random r = new Random();
            jbt2.setLocation(r.nextInt(500), r.nextInt(500));
        }
    }
}
