package kata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodeSix {

    public static void main(String[] args) {

        System.out.println(sequence(new int[]{ -2 ,1 ,-3 ,4 ,-1 ,2 ,1 ,-5 ,4 ,6,7}));

    }

    public static String toJadenCase(String phrase) {
        if (phrase == null) {
            return null;
        }
        if (phrase.isEmpty()) {
            return "";
        }
        String[] split = phrase.split(" ");
        List<String> strings = Arrays.stream(split).map(s -> s.replaceFirst(s.substring(0 ,1) ,s.substring(0 ,1).toUpperCase())).collect(Collectors.toList());
        return strings.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }

    public static int sequence(int[] arr) {
        int sum = 0;
        int sumT = 0;
        for (int i = 0; i < arr.length; i++) {
            sumT = 0;
            for (int j = i; j < arr.length; j++) {
                sumT += arr[j];
                if (sumT > sum) {
                    sum = sumT;

                }
            }

        }
        return sum;
    }

}
