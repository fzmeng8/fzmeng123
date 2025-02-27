package ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        // 初始化界面
        initJFrame();
        // 初始化菜单
        initJMenuBar();

        //
        initImage();
        this.setVisible(true);
    }
    private void initJFrame() {
        // 设置大小
        this.setSize(603, 680);
        // 设置界面标题
        this.setTitle("拼图单机版");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 取消默认居中，按XY轴模式添加组件
        this.setLayout(null);
    }
    private void initJMenuBar(){
        // 菜单
        // 创建整个的菜单对象
        JMenuBar JMenuBar = new JMenuBar();

        // 创建菜单上面两个选项的对象 （功能 关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        // 创建菜单选项
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");
        JMenuItem accountItem = new JMenuItem("公众号");

        // 将每一个选项的条目归类
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountItem);

        // 然后统一添加到整个菜单当中
        JMenuBar.add(functionJMenu);
        JMenuBar.add(aboutJMenu);

        // 把菜单放进界面中
        this.setJMenuBar(JMenuBar);
    }
    private void initImage(){

        for (int i = 0; i < 4; i++) {
            int number = 1;
            for (int j = 0; j < 4; j++) {
                // 创建JLabel的对象 （管理容器）
                JLabel jLabel = new JLabel(new ImageIcon("E:\\JavaDevelop\\javademo\\puzzlegame\\image\\animal\\"+ number +".png"));
                // 指定图片位置
                jLabel.setBounds(105 * i,105 * j,105,105);
                // 把管理容器添加到界面中
                this.getContentPane().add(jLabel);
                // 下一次加载后面的图片
                number++;
            }
        }
    }

}
