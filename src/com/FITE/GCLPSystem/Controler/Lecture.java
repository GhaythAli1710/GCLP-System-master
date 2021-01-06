package com.FITE.GCLPSystem.Controler;

import com.FITE.GCLPSystem.Controler.Enum.Location;
import com.FITE.GCLPSystem.Controler.Enum.Section;
import com.FITE.GCLPSystem.Controler.Enum.SubjectName;

public class Lecture {
//    private Subject subject;
    private int id;
    private SubjectName name;
    private Section section;
    private Time time;
    private Location location;
    private int num;
    private int MaxNum;

    public Lecture() {
        num = 0;
    }

    public void print(){
        System.out.print(this.id);
        System.out.print(this.name);
        System.out.print(this.section);
        System.out.print(this.time.getDay());
        System.out.print(this.time.getClock());
        System.out.print(this.location);
        System.out.print(this.num);
        System.out.print(this.MaxNum);
        System.out.println();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SubjectName getName() {
        return name;
    }

    public void setName(SubjectName name) {
        this.name = name;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMaxNum() {
        return MaxNum;
    }

    public void setMaxNum(int maxNum) {
        MaxNum = maxNum;
    }
}

