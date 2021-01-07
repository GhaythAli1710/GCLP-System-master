package com.FITE.GCLPSystem.View.Console;

import com.FITE.GCLPSystem.Controler.Algorithm.Algorithm;
import com.FITE.GCLPSystem.Controler.University;
import com.FITE.GCLPSystem.Model.Model;

import java.io.FileNotFoundException;

public class Console {
    public static void main(String[] args) throws FileNotFoundException {
        University university = new University();
        university.addData(Model.getLecturesDataList(),Model.getStudentDataList());
        Algorithm.AStar(university);
    }
}
