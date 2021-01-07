package com.FITE.GCLPSystem.Controler;

import com.FITE.GCLPSystem.Controler.Enum.Essential;

public class Condition {
    private Time time;
    private Essential type;

    public Condition() {
    }

    public Condition(Time time, Essential type) {
        this.time=time;
        this.type=type;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setType(Essential type) {
        this.type = type;
    }

    public Time getTime() {
        return time;
    }

    public Essential getType() {
        return type;
    }
}
