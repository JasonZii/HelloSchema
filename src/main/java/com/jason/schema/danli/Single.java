package com.jason.schema.danli;

/**
 * @Author : jasonzii @Author
 * @Description : 单例应用
 * @CreateDate : 18.3.8  22:11
 */
public class Single {

    private String name;

    private static Single s = new Single("lalala");

    private Single(String name){
        this.name = name;
    }

    public static Single getInstance(){
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
