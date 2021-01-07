package com.FITE.GCLPSystem.Test;

import com.FITE.GCLPSystem.Model.Model;
import com.FITE.GCLPSystem.Controler.University;

import java.io.FileNotFoundException;

public class Tester {
    public static void main(String[] args) throws FileNotFoundException {
        University university = new University();
        university.addData(Model.getLecturesDataList(),Model.getStudentDataList());
        university.Print();
    }
}
