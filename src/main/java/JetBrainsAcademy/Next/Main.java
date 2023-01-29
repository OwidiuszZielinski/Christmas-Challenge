package JetBrainsAcademy.Next;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {


    /* Do not change code below */
    public static void main(String[] args) {

//        final Scanner scanner = new Scanner(System.in);
//
//        final List<String> values = Arrays
//                .stream(scanner.nextLine().split("\\s+")).toList();
//
//        List<Integer> list = new ArrayList<>(values.stream().map(Integer::parseInt).toList());
//        list.removeIf(e -> list.indexOf(e) % 2 == 0);
//        Collections.reverse(list);
//
//        for (Integer x : list) {
//
//                System.out.print(x + " ");
//
//        }
        final String hello = "Hello, ";
        Function<Integer,String>helloFunction = (name) -> hello + name;

        System.out.println(helloFunction.apply(333));
        System.out.println(helloFunction.apply(444));

    }
}
