package com.aixu.gui.layout;

import com.aixu.gui.CreateFrame;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author aixu
 * @ClassName LayoutTest
 * @Date 2023/2/27 11:47
 * 布局测试
 */
public class LayoutTest {
    public static void main(String[] args) throws InterruptedException {
        CreateFrame frame = new CreateFrame("hello", 300, 200);
//        frame.setLayout(new BorderLayout());
//        frame.setLayout(new FlowLayout());
        CardLayout cardLayout = new CardLayout();
        frame.setLayout(cardLayout);
        Button button1 = new Button("按钮1");
        Button button2 = new Button("按钮2");
        Button button3 = new Button("按钮3");
        Button button4 = new Button("按钮4");
        Button button5 = new Button("按钮5");

//        frame.add(button1,BorderLayout.WEST);
//        frame.add(button2,BorderLayout.EAST);
//        frame.add(button3,BorderLayout.SOUTH);
//        frame.add(button4,BorderLayout.NORTH);
//        frame.add(button5,BorderLayout.CENTER);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        while (true){
            Thread.sleep(3000);
            cardLayout.next(frame);
        }
    }
}
