package com.example.recycler;

public class Posts {
    private final String title;
    private final String body;

    protected Posts(String title, String body) {
        this.title = title;
        this.body = body;
    }

    protected String getTitle() {
        return title;
    }

    protected String getBody() {
        return body;
    }

}
