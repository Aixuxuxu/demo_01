package com.aixu.gui.swing.menu;

import com.aixu.gui.CreateFrame;
import com.aixu.gui.swing.CreateJFrameTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author aixu
 * @ClassName JPopMenuTest
 * @Date 2023/3/1 17:14
 */
public class JPopMenuTest {
    public static void main(String[] args) {
        // 创建框架
        CreateJFrameTest frame = new CreateJFrameTest("hello", 500, 500);
        // 创建弹出菜单和菜单选项
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem copy = new JMenuItem("复制");
        JMenuItem paste = new JMenuItem("粘贴");
        JMenuItem run = new JMenuItem("运行");
        JMenuItem debug = new JMenuItem("调试");

        // 为鼠标绑定右击事件
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3){
                    System.out.println("鼠标右击了");
                    popupMenu.show(frame,e.getX(),e.getY());
                }
            }
        });

        // 组件添加
        popupMenu.add(copy);
        popupMenu.add(paste);
        popupMenu.add(run);
        popupMenu.add(debug);
        frame.add(popupMenu);
        frame.setVisible(true);
    }
}
