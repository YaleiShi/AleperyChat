package com.example.pengfeisong.videochatdemo;

import com.affectiva.android.affdex.sdk.detector.Face;

/**
 * Created by shiya on 2018/3/30.
 */

public class SynchronySystem {
    FaceList faceList1;
    FaceList faceList2;
    int count;
    double exyAttention = 0, exyEye = 0, exyCheek = 0, exyBrowRaise = 0, exyBrowFurrow = 0;
    double exAttention = 0, exEye = 0, exCheek = 0, exBrowRaise = 0, exBrowFurrow = 0;
    double eyAttention = 0, eyEye = 0, eyCheek = 0, eyBrowRaise = 0, eyBrowFurrow = 0;
    double ex2Attention = 0, ex2Eye = 0, ex2Cheek = 0, ex2BrowRaise = 0, ex2BrowFurrow = 0;
    double ey2Attention = 0, ey2Eye = 0, ey2Cheek = 0, ey2BrowRaise = 0, ey2BrowFurrow = 0;


    public SynchronySystem(){
        faceList1 = new FaceList();
        faceList2 = new FaceList();
        count = 0;
    }

    public void add(Face face1, Face face2){
        Face faceX;
        Face faceY;
        if(count >= 100){
            count --;
            faceX = faceList1.getHead().getFace();
            faceY = faceList2.getHead().getFace();

            exyAttention = exyAttention - (faceX.expressions.getAttention() * faceY.expressions.getAttention());
            exyEye = exyEye - (faceX.expressions.getEyeWiden() * faceY.expressions.getEyeWiden());
            exyCheek = exyCheek - (faceX.expressions.getCheekRaise() * faceY.expressions.getCheekRaise());
            exyBrowRaise = exyBrowRaise - (faceX.expressions.getBrowRaise() * faceY.expressions.getBrowRaise());
            exyBrowFurrow = exyBrowFurrow - (faceX.expressions.getBrowFurrow() * faceY.expressions.getBrowFurrow());

            exAttention = exAttention - faceX.expressions.getAttention();
            exEye = exEye - faceX.expressions.getEyeWiden();
            exCheek = exCheek - faceX.expressions.getCheekRaise();
            exBrowRaise = exBrowRaise - faceX.expressions.getBrowRaise();
            exBrowFurrow = exBrowFurrow - faceX.expressions.getBrowFurrow();
            
            eyAttention = eyAttention - faceY.expressions.getAttention();
            eyEye = eyEye - faceY.expressions.getEyeWiden();
            eyCheek = eyCheek - faceY.expressions.getCheekRaise();
            eyBrowRaise = eyBrowRaise - faceY.expressions.getBrowRaise();
            eyBrowFurrow = eyBrowFurrow - faceY.expressions.getBrowFurrow();

            ex2Attention = ex2Attention - (faceX.expressions.getAttention() * faceX.expressions.getAttention());
            ex2Eye = ex2Eye - (faceX.expressions.getEyeWiden() * faceX.expressions.getEyeWiden());
            ex2Cheek = ex2Cheek - (faceX.expressions.getCheekRaise() * faceX.expressions.getCheekRaise());
            ex2BrowRaise = ex2BrowRaise - (faceX.expressions.getBrowRaise() * faceX.expressions.getBrowRaise());
            ex2BrowFurrow = ex2BrowFurrow - (faceX.expressions.getBrowFurrow() * faceX.expressions.getBrowFurrow());

            ey2Attention = ey2Attention - (faceY.expressions.getAttention() * faceY.expressions.getAttention());
            ey2Eye = ey2Eye - (faceY.expressions.getEyeWiden() * faceY.expressions.getEyeWiden());
            ey2Cheek = ey2Cheek - (faceY.expressions.getCheekRaise() * faceY.expressions.getCheekRaise());
            ey2BrowRaise = ey2BrowRaise - (faceY.expressions.getBrowRaise() * faceY.expressions.getBrowRaise());
            ey2BrowFurrow = ey2BrowFurrow - (faceY.expressions.getBrowFurrow() * faceY.expressions.getBrowFurrow());
        }
        faceList1.insert(new FaceNode(face1, null));
        faceList2.insert(new FaceNode(face2, null));
        if(count < 100) count++;

        faceX = face1;
        faceY = face2;
        exyAttention = exyAttention + (faceX.expressions.getAttention() * faceY.expressions.getAttention());
        exyEye = exyEye + (faceX.expressions.getEyeWiden() * faceY.expressions.getEyeWiden());
        exyCheek = exyCheek + (faceX.expressions.getCheekRaise() * faceY.expressions.getCheekRaise());
        exyBrowRaise = exyBrowRaise + (faceX.expressions.getBrowRaise() * faceY.expressions.getBrowRaise());
        exyBrowFurrow = exyBrowFurrow + (faceX.expressions.getBrowFurrow() * faceY.expressions.getBrowFurrow());

        exAttention = exAttention + faceX.expressions.getAttention();
        exEye = exEye + faceX.expressions.getEyeWiden();
        exCheek = exCheek + faceX.expressions.getCheekRaise();
        exBrowRaise = exBrowRaise + faceX.expressions.getBrowRaise();
        exBrowFurrow = exBrowFurrow + faceX.expressions.getBrowFurrow();

        eyAttention = eyAttention + faceY.expressions.getAttention();
        eyEye = eyEye + faceY.expressions.getEyeWiden();
        eyCheek = eyCheek + faceY.expressions.getCheekRaise();
        eyBrowRaise = eyBrowRaise + faceY.expressions.getBrowRaise();
        eyBrowFurrow = eyBrowFurrow + faceY.expressions.getBrowFurrow();

        ex2Attention = ex2Attention + (faceX.expressions.getAttention() * faceX.expressions.getAttention());
        ex2Eye = ex2Eye + (faceX.expressions.getEyeWiden() * faceX.expressions.getEyeWiden());
        ex2Cheek = ex2Cheek + (faceX.expressions.getCheekRaise() * faceX.expressions.getCheekRaise());
        ex2BrowRaise = ex2BrowRaise + (faceX.expressions.getBrowRaise() * faceX.expressions.getBrowRaise());
        ex2BrowFurrow = ex2BrowFurrow + (faceX.expressions.getBrowFurrow() * faceX.expressions.getBrowFurrow());

        ey2Attention = ey2Attention + (faceY.expressions.getAttention() * faceY.expressions.getAttention());
        ey2Eye = ey2Eye + (faceY.expressions.getEyeWiden() * faceY.expressions.getEyeWiden());
        ey2Cheek = ey2Cheek + (faceY.expressions.getCheekRaise() * faceY.expressions.getCheekRaise());
        ey2BrowRaise = ey2BrowRaise + (faceY.expressions.getBrowRaise() * faceY.expressions.getBrowRaise());
        ey2BrowFurrow = ey2BrowFurrow + (faceY.expressions.getBrowFurrow() * faceY.expressions.getBrowFurrow());
    }

    public double getSynchrony(){
        double rxyAttention;
        double rxyEye;
        double rxyCheek;
        double rxyBrowRaise;
        double rxyBrowFurrow;

        rxyAttention = (count * exyAttention - exAttention * eyAttention) / (Math.sqrt(count * ex2Attention - exAttention * exAttention)* Math.sqrt(count * ey2Attention - eyAttention * eyAttention));
        rxyEye = (count * exyEye - exEye * eyEye) / (Math.sqrt(count * ex2Eye - exEye * exEye)* Math.sqrt(count * ey2Eye - eyEye * eyEye));
        rxyCheek = (count * exyCheek - exCheek * eyCheek) / (Math.sqrt(count * ex2Cheek - exCheek * exCheek)* Math.sqrt(count * ey2Cheek - eyCheek * eyCheek));
        rxyBrowRaise = (count * exyBrowRaise - exBrowRaise * eyBrowRaise) / (Math.sqrt(count * ex2BrowRaise - exBrowRaise * exBrowRaise)* Math.sqrt(count * ey2BrowRaise - eyBrowRaise * eyBrowRaise));
        rxyBrowFurrow = (count * exyBrowFurrow - exBrowFurrow * eyBrowFurrow) / (Math.sqrt(count * ex2BrowFurrow - exBrowFurrow * exBrowFurrow)* Math.sqrt(count * ey2BrowFurrow - eyBrowFurrow * eyBrowFurrow));
        return (rxyAttention + rxyEye + rxyCheek + rxyBrowRaise + rxyBrowFurrow) / 5;
    }

}
