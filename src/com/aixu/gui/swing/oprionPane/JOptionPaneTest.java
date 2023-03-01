package com.aixu.gui.swing.oprionPane;

import com.aixu.gui.swing.CreateJFrameTest;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author aixu
 * @ClassName JOptionPaneTest
 * @Date 2023/3/1 20:34
 * 对话框组件
 */
public class JOptionPaneTest {
//    选择对话框组件
//    public static void main(String[] args) {
//        CreateJFrameTest frame = new CreateJFrameTest("hello", 500, 500);
//        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//
//                // 可选择的消息对话框
////                int value = JOptionPane.showConfirmDialog(frame,"真的要离开吗?");
//                int value = JOptionPane.showConfirmDialog(frame,"真的要离开吗?","退出",JOptionPane.YES_NO_OPTION);
//                if(value == JOptionPane.OK_OPTION){
//                    System.exit(0);
//                }
//                // 单纯的消息提示框
////                JOptionPane.showMessageDialog(frame,"提个醒");
//
//            }
//        });
//
//    }

    //    文本输入对话框组件
    public static void main(String[] args) {
        CreateJFrameTest frame = new CreateJFrameTest("hello", 500, 500);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                String s = JOptionPane.showInputDialog("毕业即进厂");
                System.out.println(s);

            }
        });

    }
}
