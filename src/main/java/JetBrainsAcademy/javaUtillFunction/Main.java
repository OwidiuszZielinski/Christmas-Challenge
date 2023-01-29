package JetBrainsAcademy.javaUtillFunction;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, String> myFuc = (integer ,integer2) -> integer + ":" + integer2;
        System.out.println(myFuc.apply(5 ,5));

        BinaryOperator<Integer> myFuc1 = (integer ,integer2) -> integer * integer2 / 2;
        System.out.println(myFuc1.apply(5 ,10));

        BiFunction<Integer, Integer, String> x = myFuc1.andThen(Integer::toBinaryString);
        System.out.println(x.apply(5 ,10));

        BiPredicate<Integer, Integer> myFuc2 = (integer ,integer2) -> integer >= integer2;
        System.out.println(myFuc2.test(14 ,14));

        BooleanSupplier booleanSupplier = () -> false;
        boolean asBoolean = booleanSupplier.getAsBoolean();
        System.out.println(!asBoolean);

        Function <Integer,String> myFunc3 = integer -> integer + "xD";
        System.out.println(myFunc3.apply(15));

        Predicate<Integer> myFunc4 = integer -> integer < 5;
        System.out.println(myFunc4.test(6));
        final String PREFIX = "__pref__";
        final String SUFFIX = "__suff__";

        UnaryOperator<String> operator = s-> PREFIX + s.replaceAll("[\t\n\r\f\s]","") + SUFFIX;
        UnaryOperator<String> operatorT = s-> PREFIX + s.trim() + SUFFIX;


        System.out.println(operatorT.apply("\n x d "));


    }

}
