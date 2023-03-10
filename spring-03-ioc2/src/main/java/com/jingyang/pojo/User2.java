package com.jingyang.pojo;

public class User2 {
    private String name;

    public User2(){
        System.out.println("User2的无参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
