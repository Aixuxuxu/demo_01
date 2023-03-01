package com.aixu.gui.menu;

import com.aixu.gui.CreateFrame;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author aixu
 * @ClassName PopMenuTest
 * @Date 2023/3/1 9:42
 * 弹出菜单组件
 */
public class PopMenuTest {
    public static void main(String[] args) {
        // 创建框架
        CreateFrame frame = new CreateFrame("hello", 500, 500);
        // 创建弹出菜单和菜单选项
        PopupMenu popupMenu = new PopupMenu();
        MenuItem copy = new MenuItem("复制");
        MenuItem paste = new MenuItem("粘贴");
        MenuItem run = new MenuItem("运行");
        MenuItem debug = new MenuItem("调试");

        // 为鼠标绑定右击事件
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getClickCount() == MouseEvent.BUTTON3){
                    System.out.println("鼠标右击了");
                    popupMenu.show(frame,e.getX(),e.getY());
                }
            }
        });

        // 组件添加
        popupMenu.add(copy);
        popupMenu.add(paste);
        popupMenu.add(run);
        popupMenu.add(debug);
        frame.add(popupMenu);
        frame.setVisible(true);
    }
}
