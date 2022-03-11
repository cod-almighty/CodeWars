package com.codalmighty.codewars;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {

        if (seconds > 359999) {
            seconds = 359999;
        }

        int HH = seconds / 3600;
        int MM = seconds % 3600 / 60;
        int SS = seconds % 60;

        return String.format("%s:%s:%s", pad(HH), pad(MM), pad(SS));
    }

    public static String pad(int num) {

        String strNum;
        if (num < 10) {
            strNum = "0" + num;
        } else {
            strNum = Integer.toString(num);
        }

        return strNum;
    }
    public static void main(String[] args) {

        System.out.println(makeReadable(86399));

    }
}

/*
public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
  }
}
 */
