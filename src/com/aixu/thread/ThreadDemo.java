package com.aixu.thread;

/**
 * @author aixu
 * @ClassName ThreadDemo
 * @Date 2023/2/19 20:36
 */
public class ThreadDemo {
    public static void main(String[] args) {

        new Thread(()->{
            for (int i=0; i<50; i++){
                System.out.println("笨蛋");
                if (i==30){
                    System.out.println(Thread.currentThread().getName()); // Thread.currentThread() 返回当前线程对象
                    Thread thread = Thread.currentThread();
                    long id = thread.getId();

                }
            }
        }).start();

        // 打印主线程名字
        System.out.println(Thread.currentThread().getName()); // Thread.currentThread() 返回当前线程对象

    }
}
