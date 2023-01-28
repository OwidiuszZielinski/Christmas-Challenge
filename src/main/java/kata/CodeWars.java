package kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CodeWars {
    public static void main(String[] args) {
        Boolean[] array1 = { null ,true ,true ,false ,
                true ,true ,true ,true ,
                true ,false ,true ,false ,
                true ,false ,false ,true ,
                true ,true ,true ,true ,
                false ,false ,true ,true };


        System.out.println(countSheeps(array1));
        System.out.println(century(2000));

        System.out.println(squareDigits(9191));
        System.out.println(number(Arrays.asList("a","b","c")));
        System.out.println(Arrays.toString(sortArray(new int[]{ 5, 3, 2,0,0, 8, 1, 4 })));
        System.out.println(boolToWord(true));
        double precision = 1e-10;
        System.out.println(Arrays.toString(tribonacci(new double[]{ 1 ,1 ,1 } ,10)));

    }

    public static int squareDigits(int n) {
        final String nToString = String.valueOf(n);
        String add = "";
        for (int i = 0; i < nToString.length(); i++) {
            String result = String.valueOf(nToString.charAt(i));
            String str = String.valueOf((int) Math.pow(Double.parseDouble(result) ,2));
            add = add.concat(str);

        }

        return Integer.parseInt(add);
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        if (arrayOfSheeps == null) {
            return 0;
        }
        for (Boolean b : arrayOfSheeps) {
            if (b == null) {
                continue;
            }
            if (b) {
                count++;

            }
        }
        return count;
    }

    public static String rps(String p1 ,String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }
        if (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        }
        if (p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        }
        if (p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        } else
            return "Player 2 won!";
    }

    public static int century(int number) {
        int count = 0;
        for (int i = 0; i < number; i += 100) {
            count++;
        }
        return count;
    }

    public static int areaOrPerimeter(int l ,int w) {
        return l == w ? l * l : (2 * l) + (2 * w);

    }

    public static List<String> number(List<String> lines) {
        List<String> result = new ArrayList<>();
        if (lines == null || lines.isEmpty()) {
            return result;
        }

        int counter = 1;
        for (String x : lines) {

            result.add(counter + ": " + x);
        }
        return result;
    }

    public static int[] sortArray(int[] array) {
        int[] result = new int[array.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[i] = array[i];
            } else
                list.add(array[i]);

        }
        list.sort(Comparator.comparing(Integer::intValue));
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0 && array[i] == 0) {
                continue;
            }
            if (result[i] == 0 && !list.isEmpty()) {
                result[i] = list.get(0);
                list.remove(0);
            }
        }

        return result;
    }

    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

    public static double[] tribonacci(double[] s ,int n) {
        if (s == null || s.length < 3) {
            return new double[0];
        }
        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            if (i < s.length) {
                result[i] = s[i];
                continue;
            }
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];

        }
        return result;
    }

}
