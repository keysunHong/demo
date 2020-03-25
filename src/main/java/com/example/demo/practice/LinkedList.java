package com.example.demo.practice;

import org.w3c.dom.NodeList;

public class LinkedList {
    LinkedNode head = new LinkedNode(0);

    public void addNodeAsc(LinkedNode node) {
        LinkedNode nodeTmp = head;
        while (nodeTmp.next != null) {
            nodeTmp = nodeTmp.next;
        }
        nodeTmp.next = node;
    }

    public void addNodeDesc(LinkedNode node) {
        LinkedNode nodeTmp = head.next;
        head.next = node;
        node.next = nodeTmp;
    }


    public void deleteNodeDescByO1(LinkedNode node){
        if(node.next == null){
            LinkedNode tmp = head;
            while(!node.equals(tmp.next)){
                    tmp = tmp.next;
            }
            tmp.next = null;
        }else{
            LinkedNode nodeNext = node.next;
            node.data = nodeNext.data;
            node.next = nodeNext.next;
        }
    }

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();
        LinkedNode nodeTmp = head;
        while (nodeTmp.next != null) {
            nodeTmp = nodeTmp.next;
            sb.append(nodeTmp.data + "->");
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }
}
