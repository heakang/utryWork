package com.utry;


import com.google.common.eventbus.EventBus;

public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");


        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        Event event = new Event();
        event.setgPer(gper);
        event.setQuestion(question);



        EventBus eventbus = new EventBus();
        eventbus.register(tom);
        eventbus.register(mic);
        eventbus.post(event);

    }

}
