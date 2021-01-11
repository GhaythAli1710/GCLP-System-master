package com.FITE.GCLPSystem.Controler;

import com.FITE.GCLPSystem.Controler.Lecture;
import com.FITE.GCLPSystem.Controler.Setting;

import java.util.ArrayList;

public class University {

    private ArrayList[] schedule = new ArrayList[Setting.getNumberSubjects()*2];
    private ArrayList<Student> students= new ArrayList();

    public University() {
        for(int i=0;i<this.schedule.length;i++) {
            this.schedule[i]= new ArrayList<Lecture>();
        }
    }

    private void addLecture(Lecture lecture){
        this.schedule[lecture.getId()].add(lecture);
    }

    public void addData(ArrayList<Lecture> lectures ,ArrayList<Student> students){
        for (int i=0;i<lectures.size();i++) {
            this.addLecture(lectures.get(i));
        }
        for (int i=0;i<students.size();i++) {
            this.addStudent(students.get(i));
        }
    }

    private void addStudent(Student student) {
        this.students.add(student);
    }

    public void Print(){
        this.printSchedule();
        this.printStudentsList();
    }

    private void printSchedule(){
        for (int i=0;i<Setting.getNumberSubjects()*2;i++){
            for (int j=0;j<this.schedule[i].size();j++){
                Lecture lecture = (Lecture) this.schedule[i].get(j);
                lecture.print();
            }
        }
    }

    private void printStudentsList(){
        for (int i=0;i<this.students.size();i++){
            this.students.get(i).print();
        }
    }

    public ArrayList<Lecture> getLecturesById(int id){
        return this.schedule[id];
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }

//    University(f.University university) {
//        for(int i=0;i<university.t.length;i++) {
//            this.t[i]= new ArrayList<Lecture>();
//            for(int j=0;j<university.t[i].size();j++) {
//                this.t[i].add(new Lecture((Lecture)university.t[i].get(j)));
//            }
//        }
//        for(int i=0;i<university.students.size();i++) {
//            this.students.add(new stud(university.students.get(i)));
//        }
//    }

//    boolean finalState()
//    {
//        for (int i=0;i<students.size();i++)
//        {
//            if(!students.get(i).finalState())
//            {
//                return false;
//            }
//        }
//        return true;
//    }

//    void add_lecture(Lecture lecture)
//    {
//        t[lecture.getSubject().getId()].add(lecture);
//    }

//    f.University getNextState()
//    {
//        return null;
//    }
//
//    List<f.University> getAllNextState(f.University university)
//    {
//        return null;
//    }

}
