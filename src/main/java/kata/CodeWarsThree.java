package kata;

import java.net.Inet4Address;
import java.util.*;

public class CodeWarsThree {

    public static void main(String[] args) {


//        System.out.println(howMuchILoveYou(7));
//        System.out.println(stray(new int[]{1,1,2,1}));
        printCounterTwo("aaaabbbbccddss");

    }

    public static <T> void printerList (List<T> list){
        for(T t : list){
            System.out.println(t);
        }
    }

    public static String[] stringToArray(String s) {
        return  s.split(" ");
    }

    public static String howMuchILoveYou(int nb_petals) {
        List<String> phrases = Arrays.asList("I love you","a little","a lot","passionately","madly","not at all");
        int count = -1;
        for (int i = 0; i < nb_petals; i++) {
            count++;
            if(count==phrases.size()){
                count=0;
            }

        }

        return phrases.get(count);
    }
//
//    public static int stray(int[] numbers) {
//        Map<Integer,Integer> integerMap = new HashMap<>();
//        for (int i = 0; i < numbers.length; i++) {
//            if(integerMap.containsKey(numbers[i])){
//                Integer toMap = integerMap.get(numbers[i]);
//                        integerMap.put(numbers[i] ,toMap+1);
//                        continue;
//            }
//            integerMap.put(numbers[i],1);
//        }
//        return integerMap
//                .entrySet()
//                .stream()
//                .filter(integerIntegerEntry -> integerIntegerEntry.getValue()==1)
//                .findFirst()
//                .orElseThrow(null).getKey();
//    }
    public static int stray(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        return numbers[0] == numbers[1] ? numbers[numbers.length-1] : numbers[0];
    }

    public static void printCounter(String toCount){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < toCount.length(); i++) {
            if(map.containsKey(toCount.charAt(i))){
                map.put(toCount.charAt(i),map.get(toCount.charAt(i))+1);
                continue;
            }
            map.put(toCount.charAt(i),1);
        }
        System.out.println(map);
        System.out.println(map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey());
    }
    public static void printCounterTwo(String toCount){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < toCount.length(); i++) {
            map.put(toCount.charAt(i) ,map.getOrDefault(toCount.charAt(i) ,0) + 1);
        }
        System.out.println(map);
        System.out.println(map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey());
    }
    public static<K> void increment(Map<K, Integer> map, K key)
    {
        map.putIfAbsent(key, 0);
        map.put(key, map.get(key) + 1);
    }


}