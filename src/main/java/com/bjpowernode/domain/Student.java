package com.bjpowernode.domain;

import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String id;
    private String name;
    private Integer age;
    private String address;
    private String classroom_id;
    private String brithday;

    public Student() {
    }

    public Student(String id, String name, Integer age, String address, String classroom_id,String brithday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.classroom_id = classroom_id;
        this.brithday = brithday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassroom_id() {
        return classroom_id;
    }

    public void setClassroom_id(String classroom_id) {
        this.classroom_id = classroom_id;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String brithdayStr = simpleDateFormat.format(brithday);
        this.brithday = brithdayStr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", classroom_id='" + classroom_id + '\'' +
                ", brithday=" + brithday +
                '}';
    }
}
