package com.aixu.gui.panel;

import com.aixu.gui.CreateFrame;

import java.awt.*;

/**
 * @author aixu
 * @ClassName PanelTest
 * @Date 2023/2/28 11:27
 * 面板组件
 */
public class PanelTest {
    public static void main(String[] args) {
        // 创建框架
        CreateFrame frame = new CreateFrame("Hello", 300, 200);

        // 修改框架布局
        GridLayout layout = new GridLayout();
        // 设定框架只显示两行
        layout.setRows(2);
        frame.setLayout(layout);

        // 创建顶部面板
        Panel top = new Panel();
        top.setBackground(Color.pink);
        top.setLayout(new FlowLayout());    // 将顶部面板中的布局设置为流式布局
        for (int i=0; i<5 ;i++){
            // 往面板中添加按钮
            Button button = new Button("按钮" + i);
            top.add(button);
        }

        // 创建底部面板
        Panel bottom = new Panel();
        bottom.setBackground(Color.yellow);
        bottom.setLayout(new GridLayout()); // 将底部面板中的布局设置为栅格布局
        // 往面板中添加按钮
        for (int i=0; i<5 ;i++){
            Button button = new Button("按钮" + i);
            bottom.add(button);
        }

        // 将面板添加到框架上面
        frame.add(top);
        frame.add(bottom);
    }
}
