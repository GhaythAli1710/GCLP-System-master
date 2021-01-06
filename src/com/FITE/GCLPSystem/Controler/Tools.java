package com.FITE.GCLPSystem.Controler;

import com.FITE.GCLPSystem.Controler.Enum.Day;
import com.FITE.GCLPSystem.Controler.Enum.SubjectName;

public class Tools {

    public static int getIndexOfDay(Day day){
//        if(Sa)
//            return 0;
//        if(Su)
//            return 1;
//        if(Mo)
//            return 2;
//        if(Tu)
//            return 3;
//        if(We)
//            return 4;
        return 2;
        //-1
    }

    public static int getIdOfSubject(String subjectName){
        if (SubjectName.Aa.equals(SubjectName.valueOf(subjectName)))
            return 0;
        if (SubjectName.Bb.equals(SubjectName.valueOf(subjectName)))
            return 2;
        if (SubjectName.Cc.equals(SubjectName.valueOf(subjectName)))
            return 4;
        if (SubjectName.Dd.equals(SubjectName.valueOf(subjectName)))
            return 6;
        if (SubjectName.Ee.equals(SubjectName.valueOf(subjectName)))
            return 8;
        return -1;
    }



//    public static int getIndexOfTime(int time){
//        if (Setting.getFIL() == time)
//            return 0;
//        if (Setting.getSL() == time)
//            return 1;
//        if (Setting.getTHL() == time)
//            return 2;
//        if (Setting.getFOL() == time)
//            return 3;
//        return -1;
//    }
}
