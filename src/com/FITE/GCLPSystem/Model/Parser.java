package com.FITE.GCLPSystem.Model;

import com.FITE.GCLPSystem.Model.fileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Parser {

    public static String[][] getData() throws FileNotFoundException {
        ArrayList<String> SL = fileReader.getData();
        String[][] Data = new String[SL.size()][6];
        int rN = 0;
        while (!SL.isEmpty()){
            String string = SL.get(0);
            SL.remove(0);
            String[] sTemp = StringToArray(string);
            for (int i=0;i<6;i++){
                Data[rN][i] = sTemp[i];
            }
            rN++;
        }
        return Data;
    }

    private static String[] StringToArray(String string){
        String[] strings = new String[6];
        String temp = string;
        for (int i=0;i<6;i++){
            if (i == 5)
                strings[i] = temp.substring(0, temp.indexOf("."));
            else
                strings[i] = temp.substring(0, temp.indexOf(","));
            temp = temp.substring(strings[i].length() + 1, temp.length());
        }
        return strings;
    }

//    public static void main(String[] args) throws FileNotFoundException {
//        String[][] s = Parser.getData();
//        for (int i=0;i<s.length;i++){
//            for (int j=0;j<s[i].length;j++){
//                System.out.print(s[i][j]);
//                System.out.print(" g ");
//            }
//            System.out.println();
//        }
//    }
}
