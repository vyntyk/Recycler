package com.example.recycler;

public class Get {
    private String title;
    private String body;

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Get(String confirmed, String deaths) {
        this.title = confirmed;
        this.body = deaths;
    }

}
