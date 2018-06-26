package com.jason.lambda;


import org.junit.jupiter.api.Test;

/**
 * @Author : jasonzii @Author
 * @Description : 匿名内部类
 * @CreateDate : 18.6.25  21:07
 */
public class RunnableT {

    @Test
    public void test() {
        //java8之前
        new Thread(new java.lang.Runnable() {
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }

        }).start();

        //java8方式,方法没有参数，单写一个括号就可以
        new Thread(()-> System.out.println("in java8,Lambda expression rocks !!")).start();
    }


}
