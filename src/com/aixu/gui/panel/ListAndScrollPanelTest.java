package com.aixu.gui.panel;

import com.aixu.gui.CreateFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author aixu
 * @ClassName ListAndScrollPanelTest
 * @Date 2023/2/28 13:05
 * 列表加上滚动面板
 */
public class ListAndScrollPanelTest {
    public static void main(String[] args) {
        // 创建框架
        CreateFrame frame = new CreateFrame("hello", 300, 200);

        // 创建滚动面板
        ScrollPane scrollPane = new ScrollPane();
        List list = new List();
        // 开启多选
        list.setMultipleMode(true);
        list.add("列表1");
        list.add("列表2");
        list.add("列表3");
        list.add("列表4");

        list.addActionListener(System.out::println);

        scrollPane.add(list);
        frame.add(scrollPane);
    }
}
