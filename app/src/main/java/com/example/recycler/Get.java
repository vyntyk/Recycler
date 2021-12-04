package com.example.recycler;

public class Get {
    private String confirmed;
    private String deaths;

    public String getConfirmed() {
        return confirmed;
    }

    public String getDeaths() {
        return deaths;
    }

    public Get(String confirmed, String deaths) {
        this.confirmed = confirmed;
        this.deaths = deaths;
    }

}
