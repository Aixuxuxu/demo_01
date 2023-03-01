package com.aixu.gui.dialog;

import com.aixu.gui.CreateFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author aixu
 * @ClassName dialogTest
 * @Date 2023/3/1 10:01
 * 弹出对话框窗口测试
 */
public class dialogTest {
    public static void main(String[] args) {
        // 创建框架
        CreateFrame frame = new CreateFrame("hello",500,500);

        // 创建弹出对话框以及弹出对话框上的组件
        Dialog dialog = new Dialog(frame,"",true);  // 对话框的所有者，标题，是否允许操作其它窗口
        Label label = new Label("代码还没有保存，是否退出？");
        Button exit = new Button("退出");
        Button cancel = new Button("取消");

        // 设置对话框的大小
        dialog.setSize(200,100);

        // 绑定事件
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dialog.setVisible(true);
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });

        // 添加组件
        dialog.add(label,BorderLayout.NORTH);
        dialog.add(exit,BorderLayout.EAST);
        dialog.add(cancel,BorderLayout.WEST);

    }
}
