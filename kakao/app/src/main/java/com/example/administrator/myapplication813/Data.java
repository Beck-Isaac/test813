package com.example.administrator.myapplication813;

public class Data {

    //field
    private String title;
    private String data;
    private Boolean sender;


    public Data(String title, String data) {
        this.title = title;
        this.data = data;
        this.sender= sender;
    }

    public String getTitle() {
        return title;
    }

    public String getData() {
        return data;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setData(String data) {
        this.data = data;
    }
}
