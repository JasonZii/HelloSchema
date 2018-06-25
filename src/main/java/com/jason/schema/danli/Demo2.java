package com.jason.schema.danli;

/**
 * @Author : jasonzii @Author
 * @Description : 单例应用测试
 * @CreateDate : 18.3.8  22:16
 */
public class Demo2 {

    public static void main(String[] args) throws Exception {

        Single s1 = Single.getInstance();
        System.out.println(s1.getName());

        Single s2 = Single.getInstance();
        s2.setName("hahaha");
        System.out.println(s2.getName());

    }

}
