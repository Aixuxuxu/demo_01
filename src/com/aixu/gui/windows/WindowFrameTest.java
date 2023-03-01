package com.aixu.gui.windows;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.RoundRectangle2D;

/**
 * @author aixu
 * @ClassName WindowFrameTest
 * @Date 2023/3/1 11:23
 * 窗口框架的修饰和自定义形状
 */
public class WindowFrameTest {

    public static void main(String[] args) {
        // 创建框架
        Frame frame = new Frame("窗口"){
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(0, 0, this.getWidth(), 30);   //先绘制标题栏
                g.setColor(Color.BLACK);
                g.drawString(getTitle(), getWidth() / 2 - 15, 20);   //绘制标题名称
                super.paint(g);   // 原本的绘制别覆盖了，该怎么做还要怎么做
            }
        };
        // 设置框架
        frame.setUndecorated(true);
        frame.setSize(300,200);
        frame.setShape(new RoundRectangle2D.Double(0,0,300,200,20,20));
        frame.setVisible(true);

        // 添加鼠标拖动事件，改变窗口的位置
        frame.addMouseMotionListener(new MouseMotionAdapter() {
            int oldx,oldy;
            @Override
            public void mouseDragged(MouseEvent e) {
                if (e.getY()<=30) {
                    frame.setLocation(e.getXOnScreen() - oldx,e.getYOnScreen() - oldy);
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                oldy = e.getY();
                oldx = e.getX();
            }
        });
    }
}
