package com.example.demo.practice;

public class LinkedNode {
    int data;
    LinkedNode next = null;

    public LinkedNode(int data) {
        this.data = data;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }
}
