package ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener , ActionListener {
    int[][] data = new int[4][4];
    int x = 0, y = 0; // 记录空白方块在数值中的位置
    String path = "puzzlegame/image/animal/";
    int[][] win =  {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    int step = 0;

    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");

    public GameJFrame() {
        // 初始化界面
        initJFrame();
        // 初始化菜单
        initJMenuBar();
        //
        initData();
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
        this.addKeyListener(this);
    }
    private void initJMenuBar(){
        // 菜单
        // 创建整个的菜单对象
        JMenuBar JMenuBar = new JMenuBar();

        // 创建菜单上面两个选项的对象 （功能 关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        // 创建菜单选项


        // 将每一个选项的条目归类
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountItem);

        // 给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        // 然后统一添加到整个菜单当中
        JMenuBar.add(functionJMenu);
        JMenuBar.add(aboutJMenu);

        // 把菜单放进界面中
        this.setJMenuBar(JMenuBar);
    }

    private void initData(){
        // 定义一个一维数组
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // 遍历数组，找到每一个元素，拿着每一个元素跟速记索引上的数据进行交换
        Random rand = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            // 获取随机索引
            int index = rand.nextInt(tempArr.length);
            // 拿着遍历到的每一个数据，跟随机索引进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // 找出空白方块的位置
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            } else {
                data[i / 4][i % 4] = tempArr[i];
            }
        }
    }
    private void initImage(){
        this.getContentPane().removeAll();
        if (victory()){
            System.out.println("win");
        }

        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50,30,100,100);
        this.getContentPane().add(stepCount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 获取当前要加载图片的序号
                int num = data[i][j];
                // 创建JLabel的对象 （管理容器） 相对位置——当前项目
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".png"));
                // 指定图片位置
                jLabel.setBounds(105 * i + 83,105 * j + 134,105,105);
                // 添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                // 把管理容器添加到界面中
                this.add(jLabel);
                // 下一次加载后面的图片
            }
        }
        this.getContentPane().repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ALT) {
            this.getContentPane().removeAll();
            JLabel labelAll = new JLabel(new ImageIcon(path + "1.png"));
            labelAll.setBounds(83,134,420,420);
            this.getContentPane().add(labelAll);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()){
            return;
        }
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (x == 3){return;}
                // 把空白方块下方的数字赋值给空白方块
                data[x][y] = data[x + 1][y];
                data[x + 1][y] = 0;
                x++;
                step++;
                initImage();
                break;
            case KeyEvent.VK_DOWN:
                if (x == 0){return;}
                data[x][y] = data[x - 1][y];
                data[x - 1][y] = 0;
                x--;
                step++;
                break;
            case KeyEvent.VK_LEFT:
                if (y == 3){return;}
                data[x][y] = data[x][y + 1];
                data[x][y + 1] = 0;
                y++;
                step++;
                break;
            case KeyEvent.VK_RIGHT:
                if (y == 0){return;}
                data[x][y] = data[x][y - 1];
                data[x][y - 1] = 0;
                y--;
                step++;
                break;
            case KeyEvent.VK_ALT:
                initImage();
                break;
            case KeyEvent.VK_W:
                data = new int[][]{
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,0}
                };
                initImage();
                break;
            default:
                System.out.println("other key pressed");
                break;
        }
    }

    // 判断data数值是否与win相同
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem) {
            step = 0;
            initData();
            initImage();

        }else if (obj == reLoginItem) {
            System.out.println("重新登录");
            this.setVisible(false);
            new LoginJFrame();
        }else if (obj == closeItem) {
            System.out.println("关闭游戏");
            System.exit(0);
        }else if (obj == accountItem) {
            System.out.println("公众号");
            // 弹窗
            JDialog jDialog = new JDialog();
            // 管理图片的容器对象
            JLabel label = new JLabel(new ImageIcon(path + "1.png"));
            label.setBounds(0,0,258,258);
            jDialog.getContentPane().add(label);
            jDialog.setSize(344,344);
            jDialog.setLocationRelativeTo(null);
            jDialog.setAlwaysOnTop(true);
            jDialog.setModal(true);
            jDialog.setVisible(true);

        }
    }
}
