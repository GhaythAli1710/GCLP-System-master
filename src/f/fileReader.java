package f;

import java.io.*;
import java.util.Scanner;

public class fileReader {

    public static String getDay(int day) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(new File("DataBase.txt")));
        int counter = 0;
        while (sc.hasNext()) {
            if (day == counter)
                return sc.nextLine();
            sc.nextLine();
            counter++;
        }
        return " ";
    }




//    public Place ParseStringToObject() {
//        if (obj[0].equals("Named")) {
//            return new NamedPlace(obj[4], obj[1], Integer.valueOf(obj[2]), Integer.valueOf(obj[3]));
//        } else {
//            return new DiscribedPlace(obj[4], obj[5], obj[1], Integer.valueOf(obj[2]), Integer.valueOf(obj[3]));
//        }
//    }
}
