import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Day2_RandomPresent {

    /**
     * Mikołaj postanowił w tym roku skorzystać z pomocy nowoczesnych technologii.
     * Zamiast zastanawiać się, komu jaki prezent dostarczyć postanowił skorzystać z programu.
     * Pomoż Mikołajowi!
     * Przygotuj kod, który z listy dostępnych prezentów wylosuje 3 prezenty i wypisze na ekranie.
     * Odpal program kilka razy - sprawdź, czy na pewno losuje za kazdym razem inne prezenty!
     * Wylosowane prezenty wypisz na ekranie. Zadbaj o to, żeby wylosowane prezenty były unikalne.
     */
    public static final int GIFTS_SIZE = 3;

    public static void main(String[] args) {

        List<String> ideas = List.of(
                "Perfume" ,"Socks" ,"Sweater" ,"Cup" ,
                "Hat" ,"Tea" ,"Coffee" ,"Clock" ,"Bag" ,
                "Book" ,"Wallet" ,"Cream" ,"Earrings");

        System.out.println(giftGenerator(ideas));
    }

    private static Set<String> giftGenerator(List<String> ideas) {
        final Set<String> gifts = new HashSet<>();
        while (gifts.size() < GIFTS_SIZE) {
            gifts.add(ideas.get(new Random().nextInt(0 ,ideas.size())));

        }
        return gifts;

    }
}