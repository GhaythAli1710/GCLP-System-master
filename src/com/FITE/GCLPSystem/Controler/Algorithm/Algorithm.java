package com.FITE.GCLPSystem.Controler.Algorithm;

import com.FITE.GCLPSystem.Controler.Setting;
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

    public void getPossibleState_AStar(University university){
        for (int i = 0; i< Setting.getNumberSubjects()*2; i++){
            for (int j=0;j<university.getLecturesById(i).size();j++){
                for (int s=0;s<university.getStudents().size();s++){
                    //if True create state , add state to proQueue
                    university.getStudents().get(s).put(university.getLecturesById(i));
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
                }
            }
        }
    }
}
