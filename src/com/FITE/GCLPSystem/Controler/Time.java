package com.FITE.GCLPSystem.Controler;

import com.FITE.GCLPSystem.Controler.Enum.Day;

public class Time {
    private Day day;
    private int clock;

    public Time() {
    }

    public Time(Day day, int clock) {
        this.day = day;
        this.clock = clock;
    }

    public Day getDay() {
        return day;
    }

    public int getClock() {
        return clock;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }
}
