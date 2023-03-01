package com.aixu.gui.Compone;

import com.aixu.gui.CreateFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author aixu
 * @ClassName ButtonText
 * @Date 2023/2/27 10:53
 * 按钮组件测试
 */
public class ButtonText {
    public static void main(String[] args) {
        CreateFrame frame = new CreateFrame("Hello", 300, 200);

        frame.setLayout(null);

        // 创建文本组件
        Label label = new Label();
        label.setBounds(50,80,100,40);
        frame.add(label);

        // 创建按钮组件
        Button button = new Button("按钮");
        button.setBounds(50,50,50,30);
        // 当按钮按下时改变文本内容
        button.addActionListener(e -> label.setText("按钮被点击了"));
        frame.add(button);

    }
}
