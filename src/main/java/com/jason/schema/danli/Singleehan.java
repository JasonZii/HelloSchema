package com.jason.schema.danli;

/**
 * @Author : jasonzii @Author
 * @Description : 单例设计模式，饿汉式
 * @CreateDate : 18.3.8  21:56
 */
public class Singleehan {

    private static Singleehan s = new Singleehan();

    private Singleehan(){}

    public static Singleehan getInstance(){

        return s;
    }

}

