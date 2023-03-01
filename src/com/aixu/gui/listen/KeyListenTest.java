package com.aixu.gui.listen;

import com.aixu.gui.CreateFrame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author aixu
 * @ClassName KeyListenTest
 * @Date 2023/2/26 20:21
 * 键盘监听事件
 */
public class KeyListenTest {
    public static void main(String[] args) {
        CreateFrame createFrame = new CreateFrame("Hello",500,500);

        createFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.print(e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
            }
        });
    }
}
