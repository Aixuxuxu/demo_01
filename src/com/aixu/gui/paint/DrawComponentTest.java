package com.aixu.gui.paint;

import com.aixu.gui.CreateFrame;

import java.awt.*;

/**
 * @author aixu
 * @ClassName DrawComponentTest
 * @Date 2023/3/1 10:32
 * 自定义组件绘制
 */
public class DrawComponentTest extends Component {  // 继承 Component 表示该类是一个可以被使用的组件

    @Override
    public void paint(Graphics g) { // 重写 paint 方法，该方法用来绘制组件
        g.setColor(Color.GRAY);
        g.drawRoundRect(0,0,this.getWidth(),this.getHeight(),20,20);
        g.setColor(Color.PINK);
        g.fillRoundRect(0,0,this.getWidth(),this.getHeight(),20,20);
        super.paint(g);
    }

    public static void main(String[] args) {
        // 创建框架并设置布局
        CreateFrame frame = new CreateFrame("hello", 500, 500);
        frame.setLayout(null);

        // 创建自定义的组件
        DrawComponentTest component = new DrawComponentTest();
        component.setBounds(50,50,100,100);

        // 添加组件
        frame.add(component);
    }
}
