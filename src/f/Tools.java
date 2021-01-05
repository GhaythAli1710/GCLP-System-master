package f;

import f.setting;

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

    public static int getTimeIndex(int time){
        if (setting.getFIL() == time)
            return 0;
        if (setting.getSL() == time)
            return 1;
        if (setting.getTHL() == time)
            return 2;
        if (setting.getFOL() == time)
            return 3;
        return -1;
    }
}
