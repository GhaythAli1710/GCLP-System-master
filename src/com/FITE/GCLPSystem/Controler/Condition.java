package com.FITE.GCLPSystem.Controler;

import com.FITE.GCLPSystem.Controler.Enum.Essential;

public class Condition {
    private Time time;
    private Essential type;

    Condition(Time time, Essential type)
    {
        this.time=time;
        this.type=type;
    }

    Condition(Condition condition)
    {

    }

    public Time getTime() {
        return time;
    }

    public Essential getType() {
        return type;
    }
}
