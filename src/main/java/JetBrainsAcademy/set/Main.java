package JetBrainsAcademy.set;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Set<Integer> linkedHash = new LinkedHashSet<>(Set.of(11 ,23 ,55 ,33 ,21 ,41 ,37 ,24 ,88));

        Set<Integer> set = new HashSet<>(Set.of(11 ,23 ,55 ,33 ,21 ,41 ,37 ,24 ,88 ,54 ,53 ,52));

        System.out.println(linkedHash);
        System.out.println(set);

        linkedHash.remove(23);
        set.remove(23);

        linkedHash.add(150);
        set.add(150);

        TreeSet<Integer> treeSet = new TreeSet<>(set);


        System.out.println(linkedHash);
        System.out.println(set);
        set.retainAll(linkedHash);
        System.out.println(set + "Retains");
        List<Integer> collect = new ArrayList<>(treeSet.stream().sorted(Comparator.reverseOrder()).toList());
        System.out.println(treeSet);
        System.out.println(collect);

        Set<Integer> setOne = new HashSet<>(Set.of(3 ,2 ,1));
        Set<Integer> setTne = new HashSet<>(Set.of(1 ,2 ,3));
        System.out.println(setOne.equals(setTne));

    }
}
