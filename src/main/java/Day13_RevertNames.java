import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day13_RevertNames {

    /**
     * Chochliki nie ułatwiają życia Mikołajowi. Tym razem poodwracały imiona dzieci na liście…
     * Napraw co popsuły chochliki i odwróć imiona.
     * Zwróć uwagę na duże litery i zamień je, tak, żeby imiona były poprawne.
     * Na koniec wypisz listę w terminalu żeby sprawdzić, czy wszystko jest ok!
     */

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Uisaj");
        names.add("Aisak");
        names.add("Aisa");
        names.add("Kemot");
        names.add("Lahcim");
        System.out.println(names);
        // TODO: correct names from list, with modifying or not modifying list
        List<String> strings = names.stream()
                .map(name -> new StringBuilder(name)
                        .reverse()
                        .toString())
                .map(name->name.substring(0,1)
                        .toUpperCase()+name.substring(1)
                        .toLowerCase()).toList();

        System.out.println(strings);

    }
}