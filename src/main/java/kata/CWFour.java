package kata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CWFour {
    public static void main(String[] args) {

////        System.out.println(String.valueOf(shouldReturnString(1.555)));
////        System.out.println(prime(5));
////        System.out.println();
////        System.out.println();
////        System.out.println(primeTwo(5));
////        System.out.println(trainPrime(5));
//        System.out.println(myPrime(10));
////        System.out.println(declareWinner(new Fighter("Lew" ,10 ,2) ,new Fighter("Harry" ,5 ,4) ,"Lew"));
////        System.out.println(declareWinner(new Fighter("Lew" ,10 ,2) ,new Fighter("Harry" ,5 ,4) ,"Harry"));
////        System.out.println(declareWinner(new Fighter("Harald" ,20 ,5) ,new Fighter("Harry" ,5 ,4) ,"Harry"));
////        System.out.println(declareWinner(new Fighter("Harald" ,20 ,5) ,new Fighter("Harry" ,5 ,4) ,"Harald"));
//        System.out.println(declareWinner(new Fighter("Jerry" ,30 ,3) ,new Fighter("Harald" ,20 ,5) ,"Jerry"));
//        //       System.out.println(declareWinner(new Fighter("Jerry" ,30 ,3) ,new Fighter("Harald" ,20 ,5) ,"Harald"));
//
//        System.out.println(quarterOf(5));
        System.out.println(incrementStringT(""));
        System.out.println(incrementStringT("8947856276582501461319936210139"));
        System.out.println(incrementStringT("foo99bar99"));
        System.out.println(incrementStringT("foo99bar"));

        System.out.println(incrementStringT(""));

    }

    public static String expandedForm(int num) {
        String s = String.valueOf(num);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '0') {
                continue;
            }
            if (s.charAt(i) != '0') {
                result.append(s.charAt(i));
                for (int j = 0; j < s.length() - i - 1; j++) {
                    result.append("0");

                }
                if (s.length() > i + 1 && s.charAt(s.length() - 1) != '0') {
                    result.append(" + ");
                }

            }
        }
        return result.toString();
    }

    public static <T> T shouldReturnString(T type) {
        return type;
    }

    public static int prime(int n) {

        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        for (int i = 0; i < 1000; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && i % 2 != 0) {
                    count++;
                }

            }
            if (count == 2) {
                primes.add(i);

            }
        }
        System.out.println(primes);
        return primes.get(n - 1);
    }

    public static int primeTwo(int n) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i < 1000; i++) {
            boolean prime = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }

            }
            if (prime) {
                primes.add(i);

            }

        }
        System.out.println(primes);
        return primes.get(n - 1);
    }

    public static int trainPrime(int n) {
        List<Integer> listPrime = new ArrayList<>();
        int i = 2;
        while (listPrime.size() <= n) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                listPrime.add(i);
            }
            i++;
        }

        return listPrime.get(n - 1);
    }


    public static int myPrime(int n) {
        List<Integer> primeList = new ArrayList<>();
        int i = 2;
        while (primeList.size() <= n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeList.add(i);
            }
            i++;
        }
        System.out.println(primeList);
        return primeList.get(n - 1);
    }

    public static String declareWinner(Fighter fighter1 ,Fighter fighter2 ,String firstAttacker) {
        final Fighter firstFighter = firstAttacker.equals(fighter1.name) ? fighter1 : fighter2;
        final Fighter secondFighter = firstFighter.equals(fighter1) ? fighter2 : fighter1;
        while (firstFighter.health >= 0 && secondFighter.health >= 0) {
            if (firstFighter.health > 0) {
                secondFighter.health -= firstFighter.damagePerAttack;
                if (secondFighter.health <= 0) {
                    break;
                }
            }

            if (secondFighter.health > 0) {
                firstFighter.health -= secondFighter.damagePerAttack;
                if (firstFighter.health <= 0) {
                    break;
                }
            }


        }
        return firstFighter.health > 0 ? firstFighter.name : secondFighter.name;

    }

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name ,int health ,int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static int quarterOf(int month) {
        if (month <= 3) {
            return 1;
        }
        if (month <= 6) {
            return 2;
        }
        if (month <= 9) {
            return 3;
        }
        return 4;
    }


    public static String incrementStringT(String str) {
        int count = 0;
        if (str.isBlank()) {
            return "1";
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
                continue;
            }
            count = 0;
        }
        if (count >= 15) {
            count = 15;
            long number = Long.parseLong(str.substring(str.length() - count)) + 1;
            return str.substring(0 ,str.length() - count) + String.format("%0" + count + "d" ,number);
        }
        if(count == 0){
           return str + 1;
        }
        long number = Long.parseLong(str.substring(str.length() - count)) + 1;
        return str.substring(0 ,str.length() - count) + String.format("%0" + count + "d" ,number);
    }


}
