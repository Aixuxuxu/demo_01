package com.aixu.gui.paint;

import com.aixu.gui.CreateFrame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author aixu
 * @ClassName ImageView
 * @Date 2023/3/1 10:53
 * 自定义背景组件
 */
public class ImageView extends Component {
    private Image image;

    public ImageView(String imagePath) {
        try(FileInputStream fileInputStream = new FileInputStream(imagePath)){
            image = ImageIO.read(fileInputStream);     // 使用ImageIO类来快速将图片文件读取为Image对象
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
       //绘制图片需要提供Image对象
        g.drawImage(image,0,0,this.getWidth(),this.getHeight(),null);

    }

    public static void main(String[] args) throws IOException {
        // 创建框架
        CreateFrame frame = new CreateFrame("hello", 500, 500);

        // 创建图片组件
        ImageView imageView = new ImageView("acg.png");
        imageView.setBounds(20,20,100,50);

        // 添加
        frame.add(imageView);
    }
}
