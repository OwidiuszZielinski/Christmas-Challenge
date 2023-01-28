package kata;

import java.util.ArrayList;
import java.util.List;

public class CodeFive {
    public static void main(String[] args) {

        method(0);
        method(1,2,3);
        method(new int[]{1,2});
        method();

    }



    public static void method(int... vararg) {
        System.out.println(vararg.length);
    }


    public static int abs(int a) {
        return (a < 0) ? -a : a;

    }

    public static float abs(float a) {
        return (a <= 0.0F) ? 0.0F - a : a;
    }

    public static long getMaxMinusCurrent(long val) {
        return Long.MAX_VALUE - val;
    }

    public static long getMaxMinusCurrent(int val) {
        return Integer.MAX_VALUE - val;
    }

    public static double f(double x) {
        if (x <= 0) {
            return f1(x);
        }
        if (x >= 1) {
            return f3(x);
        }
        return f2(x);
    }

    //implement your methods here
    public static double f1(double x) {
        return Math.pow(x ,2) + 1;
    }

    public static double f2(double x) {
        return 1 / Math.pow(x ,2);
    }

    public static double f3(double x) {
        return Math.pow(x ,2) - 1;
    }

    public static long factorial(long n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static List<Long> sumDigPow(long a ,long b) {
        List<Long> list = new ArrayList<>();
        for (long i = a; i <= b; i++) {

            char[] chars = String.valueOf(i).toCharArray();

            double sum = 0;
            for (int j = 1; j < 10; j++) {
                for (char aChar : chars) {
                    int numericValue = Character.getNumericValue(aChar);
                    sum += Math.pow(numericValue ,j);
                    j++;


                }
                if (i == sum) {
                    list.add(i);
                    break;
                }

            }

        }
        return list;
    }
}
