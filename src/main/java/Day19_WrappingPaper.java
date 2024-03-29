import model.Box;

import java.util.HashMap;
import java.util.Map;

public class Day19_WrappingPaper {

    /**
     * Mikołaj zapakował już prezenty w pudełka i potrzebuje Twojej pomocy!
     * Ma 5 pudełek o wielkości 10cmx13cmx15cm, 10 o wielkości 20cmx15cmx10cm i 3 o wielkości 30cmx25cmx20cm.
     * Pomoż Mikołajowi! Oblicz i wypisz na ekranie, ile metrów kwadratowych papieru do pakowania prezentów musi kupić Mikołaj.
     * Wynik zaokrglij do pełnego metra w górę.
     * Załóż dla uproszczenia, że dla każdego prezentu musi kupić pole powierzchni pudełka, nie uwględniaj strat i zakładek.
     * Przygotuj funkcje liczaca ilosc potrzebnego papieru dla pudelka i uzyj jej dla kazdego pudeka.
     */

    public static void main(String[] args) {

        Box small = new Box(10 ,13 ,15);
        Box medium = new Box(20 ,15 ,10);
        Box big = new Box(30 ,25 ,20);

        Map<Box, Integer> boxes = new HashMap<>();
        boxes.put(small ,5);
        boxes.put(medium ,15);
        boxes.put(big ,3);

        System.out.println("We need : " + calculatePaper(boxes) + " [m2]");


        // TODO: calculate needed wrapping paper
    }

    private static double calculatePaper(Map<Box, Integer> boxes) {
        return  Math.ceil((boxes.entrySet()
                .stream()
                .mapToDouble(
                        box -> 2 * (box.getKey().getX() * box.getKey().getY() * box.getValue())
                                + 2 * (box.getKey().getX() * box.getKey().getZ() * box.getValue())
                                + 2 * (box.getKey().getY() * box.getKey().getZ()) * box.getValue())
                .sum() / 10000));
        
    }
}
