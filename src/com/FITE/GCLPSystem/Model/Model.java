package com.FITE.GCLPSystem.Model;

import com.FITE.GCLPSystem.Controler.*;
import com.FITE.GCLPSystem.Controler.Enum.Day;
import com.FITE.GCLPSystem.Controler.Enum.Location;
import com.FITE.GCLPSystem.Controler.Enum.Section;
import com.FITE.GCLPSystem.Controler.Enum.SubjectName;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Model {

    public static ArrayList<Lecture> getLecturesDataList() throws FileNotFoundException {
        String[][] sData = Parser.getData();
        ArrayList<Lecture> lData = new ArrayList<>();
        for (int i=0;i<sData.length;i++){
            Lecture lecture = new Lecture();
            for (int j=0;j<6;j++){
                Time time = new Time();
                switch (j){
                    case 0:
                        lecture.setId(Tools.getIdOfSubject(sData[i][j]));
                        lecture.setName(SubjectName.valueOf(sData[i][j]));
                        break;
                    case 1:
                        lecture.setSection(Section.valueOf(sData[i][j]));
                        if (Section.Practical.equals(Section.valueOf(sData[i][j])))
                            lecture.setId(lecture.getId()+1);
                        break;
                    case 2:
                        time.setDay(Day.valueOf(sData[i][j]));
                        lecture.setTime(time);
                        break;
                    case 3:
                        lecture.getTime().setClock(Integer.parseInt(sData[i][j]));
                        break;
                    case 4:
                        lecture.setLocation(Location.valueOf(sData[i][j]));
                        break;
                    case 5:
                        lecture.setMaxNum(Integer.parseInt(sData[i][j]));
                        break;
                    default:
                        break;
                }
            }
            lData.add(lecture);
        }
        return lData;
    }

    public static ArrayList<Student> getStudentDataList(){
        ArrayList<Student> studentList = new ArrayList<>();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        /*
        *
        * */
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        return studentList;
    }
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Lecture> l = Model.getLecturesDataList();
        for (int i=0;i<l.size();i++){
            System.out.print(l.get(i).getId());
            System.out.print(l.get(i).getName());
            System.out.print(l.get(i).getSection());
            System.out.print(l.get(i).getTime().getDay());
            System.out.print(l.get(i).getTime().getClock());
            System.out.print(l.get(i).getLocation());
            System.out.print(l.get(i).getMaxNum());
            System.out.println();
        }
    }

}
