package com.aixu.gui.Compone;

import com.aixu.gui.CreateFrame;

import java.awt.*;

/**
 * @author aixu
 * @ClassName TextFieldTest
 * @Date 2023/2/27 11:05
 * 文本框组件
 */
public class TextFieldTest {
    public static void main(String[] args) {
        CreateFrame frame = new CreateFrame("hello", 300, 200);

        frame.setLayout(null);

        // “用户名”字段
        Label label = new Label("用户名：");
        label.setBounds(10,50,50,20);
        frame.add(label);

        // 用户名文本框
        TextField textField = new TextField();
        textField.setBounds(60,50,100,20);
        frame.add(textField);

        // “密码”字段
        Label password = new Label("密码：");
        password.setBounds(10,70,50,20);
        frame.add(password);

        // 密码文本框
        TextField textField2 = new TextField();
        textField2.setBounds(60,70,100,20);
        textField2.setEchoChar('*');
        frame.add(textField2);


        // “登录成功”字段
        Label ok = new Label();
        ok.setBounds(120,100,50,20);
        ok.setForeground(Color.PINK);
        frame.add(ok);


        // 登录按钮
        Button button = new Button("登录");
        button.setBounds(70,100,50,20);
        button.addActionListener(e ->{
            ok.setText("登录成功");
        });
        frame.add(button);

    }
}
