package com.aixu.gui.swing.menu;

import com.aixu.gui.swing.CreateJFrameTest;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author aixu
 * @ClassName JMenuTest
 * @Date 2023/3/1 16:29
 * 基于Swing的菜单栏组件
 */
public class JMenuTest {


    public static void main(String[] args) {
        CreateJFrameTest frame = new CreateJFrameTest("hello", 500, 500);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu menu = new JMenu("文件");
        JMenuItem create = new JMenuItem("创建");
        JMenuItem open = new JMenuItem("打开");
        JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("自动保存");

        // 绑定监听器
        create.addActionListener(e -> System.out.println("新建文件"));
        open.addActionListener(e -> System.out.println("打开文件"));
        checkBoxMenuItem.addActionListener(e -> {
            System.out.println(checkBoxMenuItem.getText()+"的状态为：" + checkBoxMenuItem.getState());
        });

        // 绑定快捷键
        create.setAccelerator(KeyStroke.getKeyStroke("ctrl N"));
        open.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        checkBoxMenuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl shift S"));

        menu.add(create);
        menu.add(open);
        menu.add(checkBoxMenuItem);
        jMenuBar.add(menu);

        frame.setJMenuBar(jMenuBar);
        frame.setVisible(true);

    }
}
