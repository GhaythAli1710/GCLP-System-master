package com.FITE.GCLPSystem.Controler;

public class Setting {
    private static int FirstLecture = 8;
    private static int SecondLecture = 10;
    private static int ThirdLecture = 12;
    private static int FourthLecture = 2;
    private static int NumberSubjects = 5;
    private static int DaysNumber = 5;
    private static int LecturesNumberInDay = 4;

    public static int getFirstLecture() {
        return FirstLecture;
    }

    public static void setFirstLecture(int firstLecture) {
        FirstLecture = firstLecture;
    }

    public static int getSecondLecture() {
        return SecondLecture;
    }

    public static void setSecondLecture(int secondLecture) {
        SecondLecture = secondLecture;
    }

    public static int getThirdLecture() {
        return ThirdLecture;
    }

    public static void setThirdLecture(int thirdLecture) {
        ThirdLecture = thirdLecture;
    }

    public static int getFourthLecture() {
        return FourthLecture;
    }

    public static void setFourthLecture(int fourthLecture) {
        FourthLecture = fourthLecture;
    }

    public static int getNumberSubjects() {
        return NumberSubjects;
    }

    public static void setNumberSubjects(int numberSubjects) {
        NumberSubjects = numberSubjects;
    }

    public static int getDaysNumber() {
        return DaysNumber;
    }

    public static void setDaysNumber(int daysNumber) {
        DaysNumber = daysNumber;
    }

    public static int getLecturesNumberInDay() {
        return LecturesNumberInDay;
    }

    public static void setLecturesNumberInDay(int lecturesNumberInDay) {
        LecturesNumberInDay = lecturesNumberInDay;
    }
}
