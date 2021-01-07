package com.FITE.GCLPSystem.Model;

import com.FITE.GCLPSystem.Controler.*;
import com.FITE.GCLPSystem.Controler.Enum.*;

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
        /***/
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        /***/
        ArrayList<SubjectName> subjects1 = new ArrayList<>();
        subjects1.add(SubjectName.Aa);
        subjects1.add(SubjectName.Bb);
        subjects1.add(SubjectName.Cc);
        /***/
        ArrayList<Desire> desires1 = new ArrayList<>();
        Time timeS1 = new Time();
        timeS1.setDay(Day.Sunday);
        desires1.add(new Desire(timeS1, NotEssential.prefer));
        /***/
        ArrayList<Condition> conditionsS1 = new ArrayList<>();
        Time time1S1 = new Time();
        time1S1.setDay(Day.Thursday);
        conditionsS1.add(new Condition(time1S1, Essential.Can_not));
        /***/
        for (SubjectName s:subjects1) {
            student1.addSubject(s);
        }
        for (Desire d:desires1) {
            student1.addDesire(d);
        }
        for (Condition c:conditionsS1) {
            student1.addCondition(c);
        }
        /***/
        Time time1 = new Time();
        Time time2 = new Time();
        Time time3 = new Time();
        Time time4 = new Time();
        /***/
        time1.setClock(8);
        time2.setClock(10);
        time3.setClock(12);
        time4.setClock(2);

        /***/



        ArrayList<SubjectName> subjects2 = new ArrayList<>();
        subjects2.add(SubjectName.Bb);
        subjects2.add(SubjectName.Cc);
        subjects2.add(SubjectName.Ee);

        ArrayList<Desire> desires2 = new ArrayList<>();
        desires2.add(new Desire(time1, NotEssential.prefer));
        desires2.add(new Desire(time2, NotEssential.prefer));
        ArrayList<Condition> conditionsS2 = new ArrayList<>();
        Time time3S2 = new Time();
        time3S2.setDay(Day.Monday);
        conditionsS2.add(new Condition(time3S2,Essential.Can_not));

        for (SubjectName s:subjects2) {
            student2.addSubject(s);
        }
        for (Desire d:desires2) {
            student2.addDesire(d);
        }
        for (Condition c:conditionsS2) {
            student2.addCondition(c);
        }

        ArrayList<SubjectName> subjects3 = new ArrayList<>();
        subjects3.add(SubjectName.Bb);
        subjects3.add(SubjectName.Ee);

        for (SubjectName s:subjects3) {
            student3.addSubject(s);
        }

        ArrayList<SubjectName> subjects4 = new ArrayList<>();
        subjects4.add(SubjectName.Aa);
        subjects4.add(SubjectName.Cc);
        subjects4.add(SubjectName.Dd);

        ArrayList<Desire> desires4 = new ArrayList<>();
        desires4.add(new Desire(time2, NotEssential.prefer));
        desires4.add(new Desire(time3, NotEssential.prefer));
        ArrayList<Condition> conditionsS4 = new ArrayList<>();
        conditionsS4.add(new Condition(time4,Essential.Can_not));

        for (SubjectName s:subjects4) {
            student4.addSubject(s);
        }
        for (Desire d:desires4) {
            student4.addDesire(d);
        }
        for (Condition c:conditionsS4) {
            student4.addCondition(c);
        }

        ArrayList<SubjectName> subjects5 = new ArrayList<>();
        subjects5.add(SubjectName.Aa);
        subjects5.add(SubjectName.Dd);
        subjects5.add(SubjectName.Ee);

        ArrayList<Condition> conditionsS5 = new ArrayList<>();
        conditionsS5.add(new Condition(time1,Essential.Can));
        conditionsS5.add(new Condition(time2,Essential.Can));
        conditionsS5.add(new Condition(time3,Essential.Can_not));
        conditionsS5.add(new Condition(time4,Essential.Can_not));


        for (SubjectName s:subjects5) {
            student5.addSubject(s);
        }
        for (Condition c:conditionsS5) {
            student5.addCondition(c);
        }
        /***/
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        return studentList;
    }
//    public static void main(String[] args) throws FileNotFoundException {
//        ArrayList<Lecture> l = Model.getLecturesDataList();
//        for (int i=0;i<l.size();i++){
//            System.out.print(l.get(i).getId());
//            System.out.print(l.get(i).getName());
//            System.out.print(l.get(i).getSection());
//            System.out.print(l.get(i).getTime().getDay());
//            System.out.print(l.get(i).getTime().getClock());
//            System.out.print(l.get(i).getLocation());
//            System.out.print(l.get(i).getMaxNum());
//            System.out.println();
//        }
//    }

}
