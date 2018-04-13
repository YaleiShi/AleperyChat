package com.example.pengfeisong.videochatdemo;

/**
 * Created by shiya on 2018/3/21.
 */

public class FaceList {
    private FaceNode head;
    private FaceNode tail;
    int count;

    public FaceList(){
        head = null;
        tail = null;
        count = 0;
    }

    public FaceNode getHead(){
        return head;
    }

    public void insert(FaceNode newNode){
        if(count >= 100) removeFirst();
        if(head == null){
            head = newNode;
            tail = newNode;
            count++;
            return;
        }
        tail.setNext(newNode);
        tail = newNode;
        count++;
    }

    public void removeFirst(){
        head = head.getNext();
        if(head == null){
            tail = null;
        }
    }
}
