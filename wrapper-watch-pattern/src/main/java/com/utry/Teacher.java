package com.utry;

import com.google.common.eventbus.Subscribe;

import java.util.Observable;
import java.util.Observer;


public class Teacher  {
    private String name;
    public Teacher(String name){
        this.name = name;
    }


    @Subscribe
    public void update(Event event) {
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
        "您收到了一个来自“" + event.getgPer().getName() + "”的提问，希望您解答，问题内容如下：\n" +
        event.getQuestion().getContent() + "\n" +
        "提问者：" + event.getQuestion().getUserName());
    }


}
