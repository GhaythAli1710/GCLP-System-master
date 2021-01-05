package f;

import java.util.ArrayList;

public class Univ {

    private ArrayList[] t = new ArrayList[1];

    public void init(){
        this.t[0] = new ArrayList<Lecture>();
        this.t[0].add(0,new Lecture());
        Lecture g = (Lecture) this.t[0].get(0);
    }

    public static void main(String[] args) {
        new Univ().init();
    }
}
