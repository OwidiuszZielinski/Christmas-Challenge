import model.Envelope;
import model.Gift;
import model.Size;

import java.util.*;

public class Day11_ChooseEnvelope {

    /**
     * Mikołaj pakuje prezenty w koperty. Zakupił trzy rozmiary: 10x15, 20x30, 30x30.
     * Dopasuj najmniejszą możliwą kopertę do każdego prezentu z listy.
     * Wypisz na ekranie, która koperta najlepiej pasuje do każdego prezentu.
     */

    public static void main(String[] args) {
        List<Gift> gifts = prepareGifts();

        Envelope small = new Envelope(10, 15,Size.SMALL);
        Envelope medium = new Envelope(20, 30,Size.MEDIUM);
        Envelope big = new Envelope(30, 30,Size.BIG);

        List<Envelope> envelopes = List.of(small,medium,big);


        showEnvelopeForGift(createHashmapValues(envelopes,gifts));


        }



    private static HashMap<Gift,Envelope> createHashmapValues(List<Envelope> envelopes, List<Gift> gifts) {
        HashMap<Gift, Envelope> giftsWithEnvelope = new HashMap<>();

        for (Gift x : gifts) {
            for (Envelope y : envelopes) {
                if (x.getHeight() <= y.getHeight() && x.getWidth() <= y.getWidth()) {
                    giftsWithEnvelope.put(x ,y);
                    break;
                }

            }
        }
        return giftsWithEnvelope;
    }

    private static void showEnvelopeForGift(HashMap<Gift,Envelope> envelopeGiftHashMap){
        for(Map.Entry<Gift,Envelope> x : envelopeGiftHashMap.entrySet()){
            System.out.println("The gift: " +x.getKey().getName() +
                    " must have envelope size " + x.getValue().getHeight() +
                    " height " + x.getValue().getWidth() + " width and it's a " + x.getValue().getSize() + " envelope" );
        }

    }

    private static List<Gift> prepareGifts() {
        return List.of(
                new Gift("Parfum", 12, 30),
                new Gift("Socks", 10, 10),
                new Gift("Book", 30, 25),
                new Gift("Clock", 15, 15),
                new Gift("Wallet", 5, 10)
        );
    }
}