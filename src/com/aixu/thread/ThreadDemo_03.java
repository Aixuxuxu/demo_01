package com.aixu.thread;

/**
 * @author aixu
 * @ClassName ThreadDemo_03
 * @Date 2023/2/25 14:56
 *
 * 线程锁和线程同步
 */
public class ThreadDemo_03 {

    static private int i = 0;
    static ThreadDemo_03 thread = new ThreadDemo_03();

    private synchronized void add(){
        i++;
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            synchronized (thread){
                for (int j=0; j<10000;j++){
                    thread.add();
                }
            }

        }).start();

        new Thread(()->{
            for (int j = 0; j < 10000 ; j++) {
                thread.add();
            }
        }).start();

        new Thread(()->{
            synchronized (thread){
                for (int j=0; j<10000;j++){
                    thread.add();
                }
            }
        }).start();


        // 主线程睡眠
        Thread.sleep(2000);
        System.out.println("i的值为：\t"+ i);
    }
}
