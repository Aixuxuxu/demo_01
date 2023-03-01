package com.aixu.gui.swing.progressBar;

import com.aixu.gui.swing.CreateJFrameTest;

import javax.swing.*;
import java.io.*;

/**
 * @author aixu
 * @ClassName JProgressBarTest
 * @Date 2023/3/1 17:21
 * Swing的进度条组件
 */
public class JProgressBarTest {
    public static void main(String[] args) {
        CreateJFrameTest frame = new CreateJFrameTest("hello", 500, 500);
        JProgressBar jProgressBar = new JProgressBar();
        JButton button = new JButton("开始拷贝");

        jProgressBar.setMaximum(1000);
        jProgressBar.setBounds(0,455,500,5);
        button.setBounds(50,50,100,50);

        button.addActionListener(event -> new Thread(()->{
            File file = new File("D:\\百度网盘\\BaiduNetdiskDownload\\爱上火车lrbgm全集\\まいてつ Last Run!! Vocal Collection.rar  ");
            try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\lenovo\\Desktop\\まいてつ Last Run!! Vocal Collection.rar"))){

                // 定义车
                byte[] b = new byte[1024 * 1024];
                // 每次装载的数据长度
                int length;
                // 文件总大小
                long total = file.length(),sum = 0;

                while ((length = inputStream.read(b)) > 0){
                    sum += length;
                    jProgressBar.setValue((int) ( jProgressBar.getMaximum() * (double)sum / total)); // 每次拷贝都更新进度条
                    jProgressBar.repaint(); // 重新绘制
                    outputStream.write(b,0,length);
//                    System.out.println("考");
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }).start());

        frame.add(button);
        frame.add(jProgressBar);
        frame.setVisible(true);

    }
}
