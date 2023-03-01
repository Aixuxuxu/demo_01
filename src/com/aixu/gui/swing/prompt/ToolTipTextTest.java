package com.aixu.gui.swing.prompt;

import com.aixu.gui.swing.CreateJFrameTest;

import javax.swing.*;

/**
 * @author aixu
 * @ClassName ToolTipTextTest
 * @Date 2023/3/1 18:04
 * swing的组件提示
 */
public class ToolTipTextTest {
    public static void main(String[] args) {
        CreateJFrameTest frame = new CreateJFrameTest("hello", 500, 500);

        JButton button = new JButton("鼠标放我这来看看？");
        button.setBounds(20,20,100,50);
        button.setToolTipText("😘");

        frame.add(button);

    }
}
