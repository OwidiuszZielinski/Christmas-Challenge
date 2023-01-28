package mylearning;

import java.util.Arrays;
import java.util.HashMap;

public class TheDuckRecrut {

    public static void main(String[] args) {
        String[] letters = new String[]{ "a" ,"b" ,"a" ,"b" ,"a" ,"b" };
        System.out.println(countLetters(letters));

    }

    private static HashMap<String, Integer> countLetters(String[] letters) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String x : letters) {
            Integer integer = map.containsKey(x) ? map.put(x ,map.get(x) + 1) : map.put(x ,1);


        }
        return map;
    }
}
