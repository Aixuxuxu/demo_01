package com.aixu.gui.panel;

import com.aixu.gui.CreateFrame;

import java.awt.*;

/**
 * @author aixu
 * @ClassName ScrollPanelTest
 * @Date 2023/2/28 11:50
 * 滚动面板组件测试
 */
public class ScrollPanelTest {
    public static void main(String[] args) {
        // 创建框架
        CreateFrame frame = new CreateFrame("hello", 300, 200);

        // 创建滚动面板
        ScrollPane scrollPane = new ScrollPane();

        // 创建面板
        GridLayout gridLayout = new GridLayout();
        gridLayout.setRows(20);
        Panel panel = new Panel();
        panel.setLayout(gridLayout);
        for (int i=0 ;i<20; i++){
            Button button = new Button("按钮"+ i);
//            设定按钮的建议大小
            button.setPreferredSize(new Dimension(100,50));
            panel.add(button);
        }

        // 将滚动面板添加到框架中
        frame.add(scrollPane);
        // 将面板添加到滚动面板中
        scrollPane.add(panel);
    }

}
