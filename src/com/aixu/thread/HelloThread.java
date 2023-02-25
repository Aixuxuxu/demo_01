package com.aixu.thread;

/**
 * @author aixu
 * @ClassName HelloThread
 * @Date 2023/2/20 19:53
 *
 * 延时主线程打印 Hello Word
 */
public class HelloThread {
    public static void main(String[] args) throws InterruptedException {

        String str = "Hello Word!!!";
        char[] chars = str.toCharArray();
        Thread t = new Thread(()->{
            try {
                for (char c : chars){
                    Thread.sleep(10000);
                    System.out.print(c);
                    if (Thread.currentThread().isInterrupted()){
                        break;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print(123);
        });
        t.start();
        Thread.sleep(3000);
        // t.interrupt();
        t.setPriority(Thread.MAX_PRIORITY);


    }
}
