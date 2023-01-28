package JetBrainsAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class BrainsAcademyOne {
    static int x = 5;
    static String name = "Owi";

    public static void main(String[] args) {


    }

    class Time {

        public Time(int hours ,int minutes ,int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }

        public Time(int hours) {
            this.hours = hours;
        }

        public Time(int hours ,int minutes) {
            this.hours = hours;
            this.minutes = minutes;
        }

        int hours;
        int minutes;
        int seconds;
    }

    public static String concatStrings(String str1 ,String str2) {
        if (str1 == null && str2 == null) {
            return "";
        }
        if (str1 == null) {
            return str2;
        }
        if (str2 == null) {
            return str1;
        }

        return str1.concat(str2);
    }

    private static int counterOfOccur(int[] array ,int value) {
        int result = 0;
        for (int j : array) {
            if (j == value) {
                result++;
            }
        }
        return result;
    }

    private static void addValueByIndex(long[] array ,int index ,long value) {
        array[index] = value;
    }

    private static void change(int toChange) {
        x = toChange;
    }

    private static void change(String toChange) {
        name = toChange;
    }

    private static String changeReturn(String toChange) {
        return toChange;
    }

}
