package com.aixu.gui.swing.pane;

import com.aixu.gui.swing.CreateJFrameTest;

import javax.swing.*;
import java.awt.*;

/**
 * @author aixu
 * @ClassName JTabbedPaneTest
 * @Date 2023/3/1 20:13
 * 多面板窗口
 */
public class JTabbedPaneTest {
    public static void main(String[] args) {
        CreateJFrameTest frame = new CreateJFrameTest("hello", 500, 500);

        JTabbedPane pane = new JTabbedPane();
        pane.setBounds(0, 0, 600, 300);
        // 添加文件选择器作为第一个面板
        pane.addTab("文件选择", new JColorChooser());
        // 添加颜色选择器作为第二个面板
        pane.addTab("颜色选择", new JFileChooser());

        frame.add(pane);
        frame.setVisible(true);

    }
}
