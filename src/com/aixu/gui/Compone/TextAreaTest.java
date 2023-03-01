package com.aixu.gui.Compone;

import com.aixu.gui.CreateFrame;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author aixu
 * @ClassName TextAreaTest
 * @Date 2023/2/27 11:28
 * 文本域组件
 */
public class TextAreaTest {
    public static void main(String[] args) {
        CreateFrame frame = new CreateFrame("hello", 300, 200);
        frame.setLayout(null);

        Label label = new Label();
        label.setBounds(10,110,200,20);
        frame.add(label);

        TextArea area = new TextArea("",10,10);
//        area.setText("");
//        area.setColumns(10);
//        area.setRows(10);
        area.setBounds(10,50,200,50);
        area.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                label.setText(area.getText());
            }
        });

        frame.add(area);
    }
}
