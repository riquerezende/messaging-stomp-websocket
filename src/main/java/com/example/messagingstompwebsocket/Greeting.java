package com.example.messagingstompwebsocket;

//Class to model the greeting representation
public class Greeting {

    private String content;

    public Greeting() {

    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
