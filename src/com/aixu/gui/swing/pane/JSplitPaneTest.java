package com.aixu.gui.swing.pane;

import com.aixu.gui.swing.CreateJFrameTest;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

/**
 * @author aixu
 * @ClassName JSplitPaneTest
 * @Date 2023/3/1 20:22
 * 分割面板
 */
public class JSplitPaneTest {
    public static void main(String[] args) {
        CreateJFrameTest frame = new CreateJFrameTest("helo", 800, 500);

        JSplitPane pane = new JSplitPane();
        pane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);  //设定为横向分割
        pane.setBounds(0, 0, 600, 300);


        JTextArea area = new JTextArea();   //右边就是我们需要编辑的文本域
        File file = new File(".idea");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(file);
        File[] files = Optional.ofNullable(file.listFiles()).orElseGet(() -> new File[0]);
        for (File f : files)
            root.add(new DefaultMutableTreeNode(f.getName()));
        JTree tree = new JTree(root);   //左边就是我们的文件树
        tree.addTreeSelectionListener(e -> {   //点击文件之后，我们需要变换编辑窗口中的文本内容，这里加个监听器
            area.setText("");   //先清空
            try (FileReader reader = new FileReader(".idea/"+e.getPath().getLastPathComponent().toString())){
                char[] chars = new char[128];   //直接开始读取内容
                int len;
                while ((len = reader.read(chars)) > 0)
                    area.setText(area.getText() + new String(chars, 0, len));   //开始写入到编辑窗口中
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        pane.setLeftComponent(new JScrollPane(tree));   //文件树和编辑区域都套一个滚动面板，因为有可能会撑得很大
        pane.setRightComponent(new JScrollPane(area));

        frame.add(pane);
        frame.setVisible(true);
    }
}
