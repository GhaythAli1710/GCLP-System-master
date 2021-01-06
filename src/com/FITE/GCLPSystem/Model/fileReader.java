package com.FITE.GCLPSystem.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class fileReader {

    public static ArrayList<String> getData() throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader(new File("DataBase.txt")));
        while (sc.hasNext()) {
            list.add(sc.nextLine());
        }
        return list;
    }
}