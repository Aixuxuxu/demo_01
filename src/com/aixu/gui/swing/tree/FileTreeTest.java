package com.aixu.gui.swing.tree;

import com.aixu.gui.swing.CreateJFrameTest;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.util.Optional;

/**
 * @author aixu
 * @ClassName FileTreeTest
 * @Date 2023/3/1 18:07
 * Swing中的文件树组件
 */
public class FileTreeTest {
    public static void main(String[] args) {
        CreateJFrameTest frame = new CreateJFrameTest("hello", 500, 500);

        //这里我们让JTree展示.idea目录下所有文件
        File file = new File(".idea");   //这里我们列出.idea目录下所有文件
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(file.getName()); //既然是树形关系，肯定有一个根结点
        //拿到当前目录下所有文件和文件夹
        File[] files = Optional.ofNullable(file.listFiles()).orElseGet(() -> new File[0]);
        for (File f : files)
            root.add(new DefaultMutableTreeNode(f.getName()));    //构造子结点并连接

        JTree tree = new JTree(root);    //设定默认的根结点
        tree.setBounds(0, 0, 200, 200);

        frame.add(tree);
        frame.setVisible(true);
    }
}
