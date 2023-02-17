package com.aixu;

import com.aixu.testError.TestError;

/**
 * @author aixu
 * @ClassName MainApplication
 * @Date 2023/2/8 19:51
 */
public class MainApplication {
    public static void main(String[] args) {

        B b = new B("张三",12);
        int a = 9;
        assert a > 10 : "a不大于10";
        b.runTest();
        b.xie();

        Job s = Job.valueOf("RUN");
        System.out.println(s.getCode());
        System.out.println("爱好是" + Job.DAJIAO);

        String test = "Kill";
        StringBuilder sb = new StringBuilder();
        sb.append("s");

        // 创建成员内部类对象
        B.Test test1 = b.new Test();
        test1.test(); //成员内部类

        D d = Integer::compare;



        // 测试自定义异常
        b.testError(1,0);
    }
}

class B extends A implements C{

    public B(String name, int age) {
        super(name, age);
    }
    class Test{
        public void test(){
            System.out.println("成员内部类");
        }
    }


    public void runTest(){
        super.test();
        System.out.println(super.name);
    }

    @Override
    public void xie() {
        System.out.println("实现C接口中的 xie 方法");
    }

    public int testError(int a,int b){
        if (b==0) throw new TestError("除数不能为0");
        return a / b;
    }
}


abstract class A{
     String name;
     int age;


    public A(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void test(){
        System.out.println("A test");
    }

    // abstract void a();
}


interface C{
    default public void c() {
        System.out.println("C接口中的默认实现");
    }

    void xie();
}

interface D{
    int sum(int a, int b);
}

enum Job{
    RUN(1,"跑步"),DAJIAO(2,"打胶"),SHUIJIAO(3,"睡觉");
    private final Integer code ;
    private final String str;
    Job(Integer code, String str){
        this.code = code;
        this.str = str;
    }

    public Integer getCode(){
        return this.code;
    }
}
