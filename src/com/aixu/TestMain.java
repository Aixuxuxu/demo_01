package com.aixu;

import com.aixu.gui.CreateFrame;
import com.aixu.gui.paint.ImageView;

/**
 * @author aixu
 * @ClassName TestMain
 * @Date 2023/3/1 11:13
 */
public class TestMain {
    public static void main(String[] args) {
        CreateFrame frame = new CreateFrame("hello", 500, 500);
        frame.setAlwaysOnTop(true);
//        frame.setLayout(null);

        ImageView imageView = new ImageView("acg.png");
        imageView.setBounds(20,20,100,50);

        frame.add(imageView);
    }
}
