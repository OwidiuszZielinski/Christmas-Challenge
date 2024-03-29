import java.util.*;
import java.util.stream.Collectors;

public class Day14_SplitPresentsList {
    /**
     * Lista prezentów od dzieci przychodzi w jednym długim napisie.
     * Napis zawiera dane w formacie: imię dziecka, spacja, prezenty rozdzielone spacjami, przecinek.
     * Pomóż Mikołajowi! Podziel napis na ciągi: imię dziecka => prezenty po przecinku.
     * Po ostatnim prezencie w linii nie powinno byc przecinka.
     */

    public static void main(String[] args) {

        String giftsList = "Kuba klocki klawiatura dron quad, Alicja komputer samochod mysz, "
                + "Janina ksiazka traktor, Tomek kuchenka koparka flamastry, ";

        System.out.println(mapChildGifts(giftsList));

    }

    private static void printBasicForm(String giftsList) {
        String[] result = giftsList.split(", ");
        for (int i = 0; i < result.length; i++) {
            String name = result[i].substring(0 ,result[i].indexOf(" "));
            System.out.print(name + " => ");

            String gifts = result[i].substring(result[i].indexOf(" ") + 1).replace(" " ," ,");
            System.out.println(gifts);

        }

    }

    private static Map<String, List<String>> mapChildGifts(String giftsList) {

        List<String> strings = List.of(giftsList.split(", "));
        Map<String, List<String>> map = new HashMap<>();
        Queue<String> queue = new LinkedList<>();

        for (String x : strings) {
            String[] array = x.split(" ");
            for (int i = 0; i < array.length; i++) {
                queue.offer(array[i]);

            }
        }
        System.out.println(queue);
        return map;

    }


}
