package com.aixu.gui.swing.component;

import com.aixu.gui.CreateFrame;
import com.aixu.gui.swing.CreateJFrameTest;

import javax.swing.*;
import java.awt.*;

/**
 * @author aixu
 * @ClassName JLableTest
 * @Date 2023/3/1 16:16
 * 基于 JFrame 的文本标签组件
 */
public class JLableTest {
    public static void main(String[] args) {

        CreateJFrameTest frame = new CreateJFrameTest("hello", 300, 300);


        // “用户名”字段
        JLabel label = new JLabel("用户名：");
        label.setBounds(10,50,50,20);
        frame.add(label);

        // 用户名文本框
        JTextField textField = new JTextField();
        textField.setBounds(60,50,100,20);
        frame.add(textField);

        // “密码”字段
        JLabel password = new JLabel("密码：");
        password.setBounds(10,70,50,20);
        frame.add(password);

        // 密码文本框
        JPasswordField textField2 = new JPasswordField();
        textField2.setBounds(60,70,100,20);
        frame.add(textField2);


        // “登录成功”字段
        JLabel ok = new JLabel();
        ok.setBounds(120,100,50,20);
        ok.setForeground(Color.PINK);
        frame.add(ok);


        // 登录按钮
        JButton button = new JButton("登录");
        button.setBounds(70,100,50,20);
        button.addActionListener(e ->{
            ok.setText("登录成功");
        });
        frame.add(button);
    }
}
