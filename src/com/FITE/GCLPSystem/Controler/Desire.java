package com.FITE.GCLPSystem.Controler;

import com.FITE.GCLPSystem.Controler.Enum.NotEssential;

public class Desire {
    private Time time;
    private NotEssential type;

    Desire(Time time, NotEssential type)
    {
        this.time=time;
        this.type=type;
    }

    Desire(Desire desire)
    {

    }

    public Time getTime() {
        return time;
    }

    public NotEssential getType() {
        return type;
    }
}
