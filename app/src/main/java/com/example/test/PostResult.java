package com.example.test;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class PostResult {

    @SerializedName("items")
    private ArrayList items;

//    @SerializedName("type")
//    private String type;
//    // @SerializedName으로 일치시켜 주지않을 경우엔 클래스 변수명이 일치해야함
//
//    @SerializedName("job")
//    private String job;
//
//    @SerializedName("age")
//    private int age;


    // toString()을 Override 해주지 않으면 객체 주소값을 출력함
//    @Override
//    public String toString() {
//        return "PostResult{" +
//                "name=" +  name +
//                ", type=" + type +
//                ", job='" + job + '\'' +
//                ", age'" + age + '\'' +
//                '}';
//    }
    @Override
    public String toString(){
        return "PostResult{" +
                "items" + items + '}';
    }
}
