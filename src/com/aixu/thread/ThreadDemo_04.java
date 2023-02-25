package com.aixu.thread;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author aixu
 * @ClassName ThreadDemo_04
 * @Date 2023/2/25 16:35
 * 生产者和消费者
 */
public class ThreadDemo_04 {
    private static Queue queue = new LinkedList();

    public static void main(String[] args) {
        new Thread(ThreadDemo_04::add,"厨师1").start();
        new Thread(ThreadDemo_04::add,"厨师2").start();
        new Thread(ThreadDemo_04::add,"厨师3").start();

        new Thread(ThreadDemo_04::take,"顾客1").start();
        new Thread(ThreadDemo_04::take,"顾客2").start();
        new Thread(ThreadDemo_04::take,"顾客3").start();
        new Thread(ThreadDemo_04::take,"顾客4").start();


    }

    public static void add(){
        while (true){
            try{
                Thread.sleep(3000);
                synchronized (queue){
                    String name = Thread.currentThread().getName();
                    System.out.println(new Date() + " " + name + "出餐");
                    // 生产
                    queue.offer(new Object());
                    queue.notifyAll();
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static  void take(){
        while (true){
            try{
                synchronized (queue){
                    // 判断队列中是否有元素
                    while (queue.isEmpty())queue.wait();

                    String name = Thread.currentThread().getName();
                    System.out.println(new Date() + " " + name + "拿到了");
                    // 消费
                    queue.poll();
                }
                Thread.sleep(4000);
            }catch (Exception e){
                    e.printStackTrace();
                }
        }
    }

}
