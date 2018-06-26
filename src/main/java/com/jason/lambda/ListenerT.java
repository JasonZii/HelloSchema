package com.jason.lambda;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author : jasonzii @Author
 * @Description : 处理事件
 * @CreateDate : 18.6.25  21:18
 */
public class ListenerT {

    @Test
    public void test(){

        //java8之前
        JButton show = new JButton("show");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Event handling without lambda expression is boring");
            }
        });

        //java8方式
        show.addActionListener((e)-> System.out.println());



    }

}
