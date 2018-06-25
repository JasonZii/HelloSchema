package com.jason.schema.danli;

/**
 * @Author : jasonzii @Author
 * @Description : 单例设计模式，懒汉式(延迟加载)
 * @CreateDate : 18.3.8  22:03
 */
public class Singlelanhan {

    private static Singlelanhan s = null;

    private Singlelanhan(){}

    public static Singlelanhan getInstance(){

        if(s == null){
            s = new Singlelanhan();
        }

        return s;
    }
}
