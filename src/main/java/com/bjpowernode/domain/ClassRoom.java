package com.bjpowernode.domain;

public class ClassRoom {
    private String id;
    private String name;

    public ClassRoom() {
    }

    public ClassRoom(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
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
}
