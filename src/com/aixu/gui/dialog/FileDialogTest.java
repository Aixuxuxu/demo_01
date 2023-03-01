package com.aixu.gui.dialog;

import com.aixu.gui.CreateFrame;

import java.awt.*;

/**
 * @author aixu
 * @ClassName FileDialogTest
 * @Date 2023/3/1 10:20
 * 文件对话框窗口测试
 */
public class FileDialogTest {
    public static void main(String[] args) {
        // 创建框架
        CreateFrame frame = new CreateFrame("hello", 500, 500);

        // 创建文件对话框窗口和按钮组件
        FileDialog fileDialog = new FileDialog(frame,"",FileDialog.LOAD);   // 对话框的父类，对话框标题，加载文件/保存文件
        Button button = new Button("文件选择");

        // 为按钮绑定事件
        button.addActionListener(e->{
            fileDialog.setVisible(true);
            System.out.println("选定的文件路径为：" + fileDialog.getDirectory() + fileDialog.getFile());
        });

//        添加
        frame.add(button);
    }
}
