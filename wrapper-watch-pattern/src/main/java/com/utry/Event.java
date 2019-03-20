package com.utry;

/**
 * 作 者 名    :@Author Akang He
 * <p>
 * 开发日期    :2019-03-20-16:31
 */
public class Event {
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public GPer getgPer() {
        return gPer;
    }

    public void setgPer(GPer gPer) {
        this.gPer = gPer;
    }

    private Question question;

    private GPer gPer;


}
