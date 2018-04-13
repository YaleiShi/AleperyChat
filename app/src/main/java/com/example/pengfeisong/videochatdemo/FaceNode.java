package com.example.pengfeisong.videochatdemo;

import com.affectiva.android.affdex.sdk.detector.Face;

/**
 * Created by shiya on 2018/3/11.
 */



public class FaceNode {
    private Face face;
    private FaceNode next;

    public FaceNode(Face face, FaceNode next){
        this.face = face;
        this.next = next;
    }

    public FaceNode getNext(){
        return next;
    }

    public Face getFace(){
        return face;
    }

    public void setNext(FaceNode newNode){
        next = newNode;
    }
}
