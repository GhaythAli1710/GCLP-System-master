package com.FITE.GCLPSystem.Controler.Algorithm;

import com.FITE.GCLPSystem.Controler.University;

public class State {
    private University university;
    private int G = 0;
    private int H = 0;
    private int F = 0;

    public void refresh_H(){
        H=0;
//        for (int iP=0;iP<numPieces;iP++){
//            if (pieces[iP]!=null)
//                H++;
//        }
    }

    public int getF(){
        return G+H;
    }

    public void setG(int g){
        G=g;
    }

    public int getG(){
        return G;
    }
}
