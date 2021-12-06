package com.example.recycler;

public class Posts {
    private final String title;
    private final String body;

    public Posts(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

}
