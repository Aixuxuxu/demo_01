package com.aixu.gui.menu;

import com.aixu.gui.CreateFrame;

import java.awt.*;

/**
 * @author aixu
 * @ClassName MenuBarTest
 * @Date 2023/3/1 9:19
 * 菜单栏组件测试
 */
public class MenuBarTest {
    public static void main(String[] args) {
        // 创建框架
        CreateFrame frame = new CreateFrame("Hello", 500, 500);

        // 创建菜单栏
        MenuBar menuBar = new MenuBar();
        // 创建菜单栏选项
        Menu menu = new Menu();
        menu.setLabel("文件");

        // 创建菜单栏中的选项
        MenuItem create = new MenuItem("新建");
        MenuItem open = new MenuItem("打开");
        // 创建可勾选的菜单栏选项
        CheckboxMenuItem checkboxMenuItem = new CheckboxMenuItem("自动保存");

        // 为选项绑定事件
        create.addActionListener(e -> System.out.println("新建文件"));
        open.addActionListener(e -> System.out.println("打开文件"));
        checkboxMenuItem.addItemListener(e -> {
//                System.out.println(e.getItem());
//                System.out.println(e.getStateChange());
            System.out.println(checkboxMenuItem.getLabel()+"的状态为：" + checkboxMenuItem.getState());
        });

        // 为菜单栏绑定快捷键
        create.setShortcut(new MenuShortcut('N'));  // ctrl + n
        open.setShortcut(new MenuShortcut('O'));    // ctrl + o
        checkboxMenuItem.setShortcut(new MenuShortcut('S',true)); // ctrl + shift + s

        // 添加组件
        menu.add(create);
        menu.add(open);
        menu.add(checkboxMenuItem);
        menuBar.add(menu);
        frame.setMenuBar(menuBar);
    }
}
