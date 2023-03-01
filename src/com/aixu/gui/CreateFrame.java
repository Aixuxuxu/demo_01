package com.aixu.gui;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * @author aixu
 * @ClassName CreateFrame
 * @Date 2023/2/26 16:57
 * 创建框架
 */
public class CreateFrame extends Frame{

    // 窗口宽度
    private Integer width ;
    // 窗口高度
    private Integer height ;
    // 窗口标题
    private String title;

    public CreateFrame(String title,Integer width,Integer height) {
        this.title = title;
        this.height = height;
        this.width = width;

        this.setSize(width,height);
        // 屏幕中间 = 屏幕的一半减去窗口的一半
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (screenSize.getWidth() / 2 - this.getWidth() / 2);
        int y = (int) (screenSize.getHeight() / 2 - this.getHeight() / 2);
        this.setLocation(x,y);
        // this.setBounds(x,y,width,height); // setBounds 相当于 setLocation(x,y) 和 setSize(width,height)
        this.setBackground(new Color(135,206,250));
        this.setVisible(true);

        // 设置框架图标
        try{
            Image image = ImageIO.read(new File("D:\\Temporary Files\\漫图\\预处理\\16x16_tou.png"));
            this.setIconImage(image);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        CreateFrame f = new CreateFrame("hello word",500,500);
    }


    /**
     * 修改光标样式
     * @param cursor ：鼠标对象
     */
    @Override
    public void setCursor(Cursor cursor) {
        super.setCursor(cursor);
    }
}
