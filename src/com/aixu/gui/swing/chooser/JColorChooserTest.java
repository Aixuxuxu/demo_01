package com.aixu.gui.swing.chooser;

import com.aixu.gui.swing.CreateJFrameTest;

import javax.swing.*;

/**
 * @author aixu
 * @ClassName JColorChooserTest
 * @Date 2023/3/1 17:53
 * Swing的颜色选择器
 */
public class JColorChooserTest {
    public static void main(String[] args) {
        CreateJFrameTest frame = new CreateJFrameTest("hello", 500, 500);
        JColorChooser color = new JColorChooser();
        color.setBounds(0,0,500,300);

        frame.add(color);
        frame.setVisible(true);
    }
}
