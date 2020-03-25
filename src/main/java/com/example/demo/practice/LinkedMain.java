package com.example.demo.practice;

public class LinkedMain {
    public static void main(String[] args) {
        //头插练习
        LinkedList ll = new LinkedList();
        ll.addNodeAsc(new LinkedNode(2));
        ll.addNodeAsc(new LinkedNode(3));
        ll.addNodeAsc(new LinkedNode(4));
        ll.addNodeAsc(new LinkedNode(5));
        ll.addNodeAsc(new LinkedNode(7));
        ll.addNodeAsc(new LinkedNode(9));
        System.out.println(ll.toString());
        //尾插练习
        ll.addNodeDesc(new LinkedNode(1));
        ll.addNodeDesc(new LinkedNode(111));
        ll.addNodeDesc(new LinkedNode(55));
        System.out.println(ll.toString());

        //给定单向链表的头指针和一个节点指针，定义一个函数在 O(1) 内删除这个节点。
        LinkedList ll2 = new LinkedList();
        ll2.addNodeAsc(new LinkedNode(1));
        ll2.addNodeAsc(new LinkedNode(2));
        LinkedNode linkedNode3 = new LinkedNode(3);
        ll2.addNodeAsc(linkedNode3);
        LinkedNode linkedNode4 = new LinkedNode(4);
        ll2.addNodeAsc(linkedNode4);
        System.out.println(ll2.toString());
        ll2.deleteNodeDescByO1(linkedNode3);
        System.out.println(ll2.toString());
        ll2.deleteNodeDescByO1(linkedNode4);
        System.out.println(ll2.toString());


    }
}
