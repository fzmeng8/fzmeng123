package ActionTest;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2Mouse extends JFrame implements MouseListener {
    JButton jbt1 = new JButton("点我啊");
    public MyJFrame2Mouse() {
        this.setSize(603, 680);
        this.setTitle("拼图单机版");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);// 界面居中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        jbt1.setBounds(0, 0, 100, 30);
        jbt1.addMouseListener(this);

        this.add(jbt1);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("entered 划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exited 划出");
    }
}
