package com.aixu.gui.listen;

import com.aixu.gui.CreateFrame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author aixu
 * @ClassName WindowListenTest
 * @Date 2023/2/26 19:53
 * 测试窗口事件监听
 */
public class WindowListenTest {
    public static void main(String[] args) {
        CreateFrame frame = new CreateFrame("Hello Word!!!", 500, 500);

         frame.addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 System.out.println("点击了关闭");
//                 System.exit(0);
                 frame.dispose(); // 关闭窗口
             }

             @Override
             public void windowClosed(WindowEvent e) {
                 System.out.println("窗口被关闭了");
             }

             @Override
             public void windowIconified(WindowEvent e) {
                 System.out.println("窗口被最小化");
             }

             @Override
             public void windowOpened(WindowEvent e) {
                 System.out.println("打开窗口");
             }

             @Override
             public void windowGainedFocus(WindowEvent e) {
                 System.out.println("窗口从最小化恢复");
             }

             @Override
             public void windowDeactivated(WindowEvent e) {
                 System.out.println("窗口变不活跃");
             }

             @Override
             public void windowActivated(WindowEvent e) {
                 System.out.println("窗口处于活跃");
             }
         });
    }
}
