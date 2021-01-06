//package f;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Univ {
//
//    private ArrayList[] t = new ArrayList[Setting.getNumberSubjects()];
//    List<stud> students= new ArrayList();
//
//    Univ()
//    {
//        for(int i=0;i<t.length;i++)
//        {
//            t[i]= new ArrayList<Lecture>();
//        }
//    }
//
//    Univ(Univ university)
//    {
//        for(int i=0;i<university.t.length;i++)
//        {
//            this.t[i]= new ArrayList<Lecture>();
//            for(int j=0;j<university.t[i].size();j++)
//            {
//                this.t[i].add(new Lecture((Lecture)university.t[i].get(j)));
//            }
//        }
//        for(int i=0;i<university.students.size();i++)
//        {
//            this.students.add(new stud(university.students.get(i)));
//        }
//    }
//
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
//
//    void add_lecture(Lecture lecture)
//    {
//        t[lecture.getSubject().getId()].add(lecture);
//    }
//
//    Univ getNextState()
//    {
//        return null;
//    }
//
//    List<Univ> getAllNextState(Univ university)
//    {
//        return null;
//    }
//
//}
