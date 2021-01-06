package com.FITE.GCLPSystem.Controler;

import com.FITE.GCLPSystem.Controler.Enum.Section;
import com.FITE.GCLPSystem.Controler.Enum.SubjectName;

public class Subject {
    private int id;
    private SubjectName name;
    private Section section;

    public Subject(Subject subject) {

    }

    public Subject() {

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
}
