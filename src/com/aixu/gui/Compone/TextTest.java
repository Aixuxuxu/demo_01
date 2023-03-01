package com.aixu.gui.Compone;

import com.aixu.gui.CreateFrame;

import java.awt.*;

/**
 * @author aixu
 * @ClassName TextTest
 * @Date 2023/2/27 10:29
 * 文本组件
 */
public class TextTest {
    public static void main(String[] args) {

        CreateFrame frame = new CreateFrame("Test", 200, 300);
        frame.setLayout(null);

        // 打印系统支持的所有字体
        for (Font font : GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts()) {
            System.out.println(font);
        }

        Label label = new Label();
        label.setText("我是标签");
        // 修改字体
        label.setFont(new Font("微软雅黑",Font.BOLD,16));
        // 修改字体背景色
        label.setBackground(Color.GRAY);
        // 修改字体颜色
        label.setForeground(Color.PINK);

        label.setBounds(50,50,100,40);

        // 将文本标签添加到框架中
        frame.add(label);
    }
}
