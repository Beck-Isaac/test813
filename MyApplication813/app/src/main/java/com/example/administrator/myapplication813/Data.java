package com.example.administrator.myapplication813;

import java.util.Objects;

public class Data {

    //  Field
    private String title;
    private String data;
//    private Boolean sender;

    //  Constructor
    public Data(String title, String data) {
        this.title = title;
        this.data = data;
        //  생성자는 초기화 목적으로!!
//        this.sender= sender;
    }

    //  Getter & Setter
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

    //  Object Class의 Method 구현
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data1 = (Data) o;
        return Objects.equals(title, data1.title) &&
                Objects.equals(data, data1.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, data);
    }

    @Override
    public String toString() {
        return "Data{" +
                "title='" + title + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
