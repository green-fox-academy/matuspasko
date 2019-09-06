package com.company;

public class Main {

    public static void main(String[] args) {

        getDurationString(65, 45);
        getDurationString(123);

//        System.out.println(getDurationString(65, 45));
//        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid value");
        } else {
            int hours = (minutes / 60);
            int minuteFromHours = minutes % 60;
            System.out.println(hours + " h  " + minuteFromHours + " m  " + seconds + " s");
        }
        return "done";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
        } else {
            int minutes = seconds / 60;
            int restSeconds = seconds % 60;
            return getDurationString(minutes, restSeconds);
        }
        return "done";
    }


    /////////////////////////////////////////////////////////////
    //                Tim Buchala Solution                    //
    ////////////////////////////////////////////////////////////

//    public static String getDurationString(int minutes, int seconds) {
//        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
//            return "Invalid value";
//        } else {
//            int hours = (minutes / 60);
//            int minuteFromHours = minutes % 60;
//
//            String hoursString = hours + "h";
//            if (hours < 10) {
//                hoursString = "0" + hoursString;
//            }
//
//            String minutesString = minuteFromHours + "m";
//            if (minuteFromHours < 10) {
//                minutesString = "0" + minutesString;
//            }
//
//            String secondsString = seconds + "s";
//            if (seconds < 10) {
//                secondsString = "0" + secondsString;
//            }
//
//            return (hoursString + " " + minutesString + " " + secondsString);
//        }
//    }
//
//    public static String getDurationString(int seconds) {
//        if (seconds < 0) {
//            return ("Invalid value");
//        }
//        int minutes = seconds / 60;
//        int restSeconds = seconds % 60;
//
//        return getDurationString(minutes, restSeconds);
//    }
}




