package kata;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class CodeWarsTwo {
    public static void main(String[] args) {

//        System.out.println(sumTwo(Arrays.asList(1 ,"5")));
//        System.out.println(Arrays.toString(minMax(new int[]{ 1 ,2 ,3 ,4 ,5 })));
//        System.out.println(powerRecur(2));
//        System.out.println(Arrays.toString(powersOfTwo(0)));
        System.out.println(order("Empty input should return empty string"));
        System.out.println(validatePin("123456"));
        System.out.println(decrypt(" Tah itse sits!", 3));


    }

    /*
     * Assume input will be only of Integer o String type
     */
    public static int sum(List<?> mixed) {
        int sum = 0;
        for (int i = 0; i < mixed.size(); i++) {
            sum += Integer.parseInt(String.valueOf(mixed.get(i)));
        }

        return sum;
    }

    public static int sumTwo(List<?> mixed) {
        return mixed.stream().map(e -> Integer.parseInt(String.valueOf(e))).reduce(Integer::sum).orElse(0);
    }

    public static int[] minMax(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        int min = Arrays.stream(arr).min().orElse(0);
        return new int[]{ min ,max };
    }

    public static long[] powersOfTwo(int n) {
        final long THE_BASIS_OF_POWER = 2;
        long[] list = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = ((long) Math.pow(THE_BASIS_OF_POWER ,i));
        }
        return list;
    }

    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.substring(0 ,1));

    }

    public static int powerRecur(int n) {
        final int THE_BASIS_OF_POWER = 2;
        if (n == 0) {
            return 1;
        } else
            return THE_BASIS_OF_POWER * powerRecur(n - 1);
    }

    public static String order(String words) {
        final String[] strings = words.split(" ");
        final String[] result = new String[strings.length];
        String answer = "";
        for (String x : strings) {
            if (checkInt(x) == 0) {
                return "";
            }
            result[checkInt(x) - 1] = x;
        }
        for (String x : result) {
            answer += x + " ";
        }


        return answer.substring(0 ,answer.length() - 1);
    }

    public static int checkInt(String word) {

        for (int i = 0; i < word.length(); i++) {
            if (Character.getName(word.charAt(i)).contains("DIGIT")) {
                return Character.getNumericValue(word.charAt(i));
            }

        }
        return 0;
    }

    public static boolean validatePin(String pin) {
        int count = 0;
        for (int i = 0; i < pin.length(); i++) {
            if (Character.isDigit(pin.charAt(i))) {
                count++;
            } else return false;
        }

        return count == 4 || count == 6;
    }

    public static boolean validatePinTwo(String pin) {

        return pin.matches("\\d{4}|\\d{6}");
    }

    public static String encrypt(final String text ,final int n) {
        String result = text;
        for (int j = 0; j < n; j++) {
            StringBuilder odd = new StringBuilder();
            StringBuilder even = new StringBuilder();
            for (int i = 0; i < result.length(); i++) {
                if (i % 2 != 0) {
                    odd.append(result.charAt(i));
                    continue;
                }
                even.append(result.charAt(i));

            }
            result = odd.append(even).toString();
        }
        return result;
    }

    public static String decrypt(final String encryptedText ,final int n) {
        if(encryptedText == null){
            return null;
        }
        String result = encryptedText;
        int odd = result.length() / 2;
        int countOdd = 1;
        int countEven = 0;
        for (int j = 0; j < n; j++) {
            char[] chars = new char[encryptedText.length()];
            for (int i = 0; i < result.length(); i++) {
                if (i < odd) {
                    chars[i + countOdd] = result.charAt(i);
                    countOdd++;
                    continue;
                }
                chars[countEven] = result.charAt(i);
                countEven += 2;


            }
            countOdd = 1;
            countEven = 0;
            result = String.valueOf(chars);

        }

        return result;
    }


}

