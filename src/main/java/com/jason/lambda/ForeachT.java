package com.jason.lambda;

import org.junit.Test;

import java.util.*;

/**
 * @Author : jasonzii @Author
 * @Description : 遍历map和List集合
 * @CreateDate : 18.4.26  20:21
 */
public class ForeachT {

    //遍历list   参数设置一个
    @Test
    public void testList(){
        List list = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");

        //java 8之前
        for(Object feature : list){
            System.out.println(feature);
        }

        // Java 8之后：(str),这个小括号不加也可
        list.forEach((str)-> System.out.println(str));

        // 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
        // 看起来像C++的作用域解析运算符
        list.forEach(System.out::println);
    }

    //遍历Map  参数要是设置两个
    @Test
    public void testMap(){

        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        //java 8之前
        for (Map.Entry<String,Integer> entry : items.entrySet()){
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }

        //java 8
        items.forEach((k,v)-> System.out.println("Item : " + k + " Count : " + v));
        //如果想对代码进行处理加{}
        items.forEach((k,v)->{
            System.out.println("Item : " + k + " Count : " + v);
            if ("E".equals(k)){
                System.out.println("Hello E");
            }
        });
    }


}
