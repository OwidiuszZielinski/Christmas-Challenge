package kata;

import java.util.*;

public class Algorithms {
    public static void main(String[] args) {



        //1
        List<Integer> list = Arrays.asList(1 ,2 ,3 ,4 ,5 ,6);
        sortArrays(list ,new LinkedList<>(list));

        //2
        treeIterator(new TreeSet<>(Arrays.asList("g" ,"z" ,"y" ,"p" ,"e")));

        //3
        System.out.println(fibo(10));

        //4
        System.out.println(mergeTwoListWithoutSorting(Arrays.asList(15 ,40 ,50 ,33 ,11) ,Arrays.asList(2 ,3 ,4 ,5 ,6 ,7)));
        System.out.println(mergeTwoListWithSorting(Arrays.asList(15 ,40 ,50 ,33 ,11) ,Arrays.asList(2 ,3 ,4 ,5 ,6 ,7)));

    }


    public static void sortArrays(List<Integer> list ,LinkedList<Integer> linkedList) {
        Collections.reverse(linkedList);
        Collections.reverse(list);
        System.out.println(linkedList + " LINKEDLIST");
        System.out.println(list + " LIST");

    }

    public static void treeIterator(TreeSet<String> treeSet) {
        for (String x : treeSet) {
            System.out.print(x);
        }
    }

    public static int fibo(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else
            return fibo(n - 1) + fibo(n - 2);
    }

    public static List<Integer> mergeTwoListWithoutSorting(List<Integer> listA ,List<Integer> listB) {
        List<Integer> result = new ArrayList<>();
        result.addAll(listA);
        result.addAll(listB);
        return result;
    }

    public static List<Integer> mergeTwoListWithSorting(List<Integer> listA ,List<Integer> listB) {
        List<Integer> result = new ArrayList<>();
        result.addAll(listA);
        result.addAll(listB);
        return result.stream()
                .sorted(Integer::compareTo)
                .toList();
    }


}
