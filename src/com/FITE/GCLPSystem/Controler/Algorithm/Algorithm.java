package com.FITE.GCLPSystem.Controler.Algorithm;

import com.FITE.GCLPSystem.Controler.University;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Algorithm {
    private PriorityQueue<State> spaceState = new PriorityQueue<>(Comparator.comparingInt(State::getF));
    public static void AStar(University university){
//        getPossibleState_AStar(puzzle);
//        while (!proQeu.isEmpty()){
//            Puzzle tPuzzle = proQeu.poll();
//            tPuzzle.Print();
//            getPossibleState_AStar(tPuzzle);
//        }
    }

//    public void getPossibleState_AStar(Puzzle puzzle){
//        for (int r=0;r<puzzle.getRow();r++){
//            for (int c=0;c<puzzle.getColumn();c++){
//                for (int iP=0;iP<puzzle.getNumPieces();iP++){
//                    for (int pos=0;pos<3;pos++){
//                        Puzzle copy = puzzle.deepCopy();
//                        if (copy.PutPiece(r,c,iP)){
////                            copy.Print();
//                            copy.setG(copy.getG()+1);
//                            copy.refresh_H();
//                            spaceState.add(copy);
//                            System.out.println(count++);
//                        }
//                        puzzle.RotateRight(puzzle.getPiece(iP));
//                    }
//                }
//            }
//        }
//    }
}