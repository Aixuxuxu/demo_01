package com.aixu.gui.swing;

import com.formdev.flatlaf.FlatLightLaf;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * @author aixu
 * @ClassName CreateJFrameTest
 * @Date 2023/3/1 15:57
 */
public class CreateJFrameTest extends JFrame {

    // 窗口宽度
    private Integer width ;
    // 窗口高度
    private Integer height ;
    // 窗口标题
    private String title;

    static {
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    public CreateJFrameTest(String title,Integer width,Integer height){
        try{
            // 设置框架主题

            this.title = title;
            this.width = width;
            this.height = height;
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) (screenSize.getWidth() / 2 - this.getWidth() / 2);
            int y = (int) (screenSize.getHeight() / 2 - this.getHeight() / 2);

            // 设置框架标题
            this.setTitle(title);
            // 设置框架定位和大小
            this.setBounds(x,y,width,height);
            // 设置框架图标
            Image image = ImageIO.read(new File("D:\\Temporary Files\\漫图\\预处理\\32x32_tou.png"));
            this.setIconImage(image);
            // 设置框架布局为null
            this.setLayout(null);
            // 设置框架默认显示
            this.setVisible(true);
            // 设置关闭窗口事件为结束程序
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        CreateJFrameTest hello = new CreateJFrameTest("hello", 500, 500);

        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("1111");
        menu.add(new JMenuItem("klkl"));
        bar.add(menu);
        hello.setJMenuBar(bar);
    }

}
