package com.aixu.thread;

/**
 * @author aixu
 * @ClassName ThreadDemo_02
 * @Date 2023/2/20 19:51
 */
public class ThreadDemo_02 {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("线程开始运行！");
            while (true){   //无限循环
                if(Thread.currentThread().isInterrupted()){   //判断是否存在中断标志
                    break;   //响应中断
                }
            }
            System.out.println("线程被中断了！");
        });
        t.start();
        try {
            Thread.sleep(3000);   //休眠3秒，一定比线程t先醒来
            t.interrupt();   //调用t的interrupt方法
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
