package com.FITE.GCLPSystem.Controler;

import com.FITE.GCLPSystem.Controler.Enum.Location;

public class Lecture {
    private Subject subject;
    private Time time;
    private Location location;
    private int num;
    private int MaxNum;

    public Lecture(Lecture lecture) {

    }

    public Lecture() {
        num = 0;

    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
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

