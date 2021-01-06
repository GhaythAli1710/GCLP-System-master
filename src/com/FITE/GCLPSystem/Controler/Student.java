package com.FITE.GCLPSystem.Controler;

import com.FITE.GCLPSystem.Controler.Enum.Essential;
import com.FITE.GCLPSystem.Controler.Enum.NotEssential;

import java.util.ArrayList;

public class Student {
    private ArrayList<Subject> subjects= new ArrayList();
    private ArrayList<Desire> desires= new ArrayList<>();
    private ArrayList<Condition> conditions=new ArrayList<>();
    private Subject[][] sechdule= new Subject[Setting.getDaysNumber()][Setting.getLecturesNumberInDay()];

    public Student() {
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Desire> getDesires() {
        return desires;
    }

    public void setDesires(ArrayList<Desire> desires) {
        this.desires = desires;
    }

    public ArrayList<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(ArrayList<Condition> conditions) {
        this.conditions = conditions;
    }

    public Subject[][] getSechdule() {
        return sechdule;
    }

    public void setSechdule(Subject[][] sechdule) {
        this.sechdule = sechdule;
    }

    // private Getter ??
    Student(Student student) {
        for(int i=0;i<student.subjects.size();i++) {
            this.subjects.add(new Subject(student.subjects.get(i)));
        }
        for(int i=0;i<student.desires.size();i++) {
            this.desires.add(new Desire(student.desires.get(i)));
        }
        for(int i=0;i<student.conditions.size();i++) {
            this.conditions.add(new Condition(student.conditions.get(i)));
        }
        for(int i=0;i<5;i++) {
            for (int j=0;j<4;j++) {
                this.sechdule[i][j]=new Subject(student.sechdule[i][j]);
            }
        }
    }

    boolean finalState() {
        if(subjects.isEmpty()) {
            return true;
        }
        return false;
    }

    private class Checkers{

        boolean two_lec_in_same_time(int time, int day) {//first strong constraint
            if(sechdule[day][time]!=null) {
                return true;
            }
            return false;
        }

        boolean pass_Max(Lecture lecture) {//second strong constraint
            Setting s= new Setting();
            if(lecture.getNum()>=lecture.getMaxNum()) {
                return true;
            }
            return false;
        }

        boolean all_on_table() {//third strong constraint
            if(subjects.size()==0) {
                return true;
            }
            return false;
        }

        boolean time_break_condition(Time time) {//fourth strong constraint
            for (int i=0;i<conditions.size();i++) {
                if(conditions.get(i).getType()== Essential.Can_not ) {
                    if(conditions.get(i).getTime().getDay()!=null && conditions.get(i).getTime().getDay()==time.getDay()) {
                        if(conditions.get(i).getTime().getClock()!=-1 && conditions.get(i).getTime().getClock()== time.getClock()) {
                            return true;
                        } else if(conditions.get(i).getTime().getClock()==-1) {
                            return true;
                        }
                    } else if(conditions.get(i).getTime().getDay()==null && conditions.get(i).getTime().getClock()==time.getClock()) {
                        return true;
                    }
                }
                //else if it was in a period i can present in it
            }
            return false;
        }

        boolean spare_time(int time, int day) {//second weak constraint
            if(time-1>-1 && sechdule[day][time-1]==null && time-2>-1 &&sechdule[day][time-2]!= null) {
                return true;
            }
            if(time+1<4 && sechdule[day][time+1]==null && time+2<4 && sechdule[day][time+2]!= null) {
                return true;
            }
            return false;
        }

        void time_break_desire(Time time) {//third weak constraint
            int check=0;
            for (int i=0;i<desires.size();i++) {
                if(desires.get(i).getType()== NotEssential.Do_not_prefer) {
                    if(desires.get(i).getTime().getDay()!=null && desires.get(i).getTime().getDay()== time.getDay()) {
                        if(desires.get(i).getTime().getClock()!=-1 && desires.get(i).getTime().getClock()== time.getClock()) {
//                            weight++;
                        } else if(desires.get(i).getTime().getClock()==-1) {
//                            weight++;
                        }
                    } else if(desires.get(i).getTime().getDay()==null && desires.get(i).getTime().getClock()== time.getClock()) {
//                        weight++;
                    }
                }
            }
        }

        boolean three_in_day(int day) {//fourth weak constraint
            int counter=0;
            for(int i=0;i<4;i++) {
                if(sechdule[day][i]!=null) {
                    counter++;
                }
            }
            if(counter<=3) {
                return true;
            }
            return false;
        }

        boolean empty_day_or_more() {//sixth weak constraint
            for(int i=0;i<5;i++) {
                int check=0;
                for(int j=0;j<4;j++) {
                    if(sechdule[i][j]!=null) {
                        check=1;
                        j=4;
                    }
                }
                if(check==0) {
                    return true;
                }
            }
            return false;
        }
    }
}
