package com.example.demo;

import java.util.Date;

public class Student {
    private String name;
    private int age;
    private Date birthday;
    private Student bestFriend;
    private float money;

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Student getBestFriend() {
        return bestFriend;
    }

    public void setBestFriend(Student bestFriend) {
        this.bestFriend = bestFriend;
    }
}
