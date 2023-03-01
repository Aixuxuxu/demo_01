package com.aixu.gui.swing.chooser;

import com.aixu.gui.swing.CreateJFrameTest;

import javax.swing.*;
import java.io.File;

/**
 * @author aixu
 * @ClassName JFileChooserTest
 * @Date 2023/3/1 17:56
 * Swing的文件选择器
 */
public class JFileChooserTest {
    public static void main(String[] args) {
        CreateJFrameTest frame = new CreateJFrameTest("frame", 800, 500);
        // 设置初始目录
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setBounds(0,0,600,300);
        // 设置初始目录
        fileChooser.setCurrentDirectory(new File("."));
        frame.add(fileChooser);
        frame.setVisible(true);
    }
}
