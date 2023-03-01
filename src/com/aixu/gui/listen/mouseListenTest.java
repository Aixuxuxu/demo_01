package com.aixu.gui.listen;

import com.aixu.gui.CreateFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 * @author aixu
 * @ClassName mouseListenTest
 * @Date 2023/2/26 20:26
 * 鼠标监听事件
 */
public class mouseListenTest {
    public static void main(String[] args) {
        CreateFrame frame = new CreateFrame("Hello" , 500,500);
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                super.mouseClicked(e);
                System.out.println(e.getX()+","+e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e.getButton());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
            }
        });
    }

}
