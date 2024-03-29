import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Day18_SongPrompter {
    /**
     * W świeta lubimy śpiewać koledy i świąteczne piosenki. Przygotuj prompter dla koledy lub piosenki.
     * Niech tekst linijka po linijce wyświetla sie co 3 sekunde w terminalu.
     * Przykladowy tekst znajdziesz ponizej, ale mozesz zamienić go na tekst Twojej ulubionej piosenki lub koledy!
     */

    public static void main(String[] args) {

        String lyrics = "Bog sie rodzi, moc truchleje\n"
                + "Pan niebiosow obnazony!\n"
                + "Ogien krzepnie, blask ciemnieje.\n"
                + "Ma granice Nieskonczony\n"
                + "Wzgardzony, okryty chwala\n"
                + "Smiertelny Krol nad wiekami!\n"
                + "A Slowo Cialem sie stalo\n"
                + "I mieszkalo miedzy nami";

        prompter(lyrics);
        // TODO: prepare song prompter


    }

    private static void prompter(String lyrics) {
        String[] lines = lyrics.split("\n");
        try {
            for (String s : lines) {
                for (int i = 0; i < s.length(); i++) {
                    TimeUnit.MILLISECONDS.sleep(3000/ s.length());
                    System.out.print(s.charAt(i));
                }
                System.out.println();




            }


        } catch (InterruptedException e) {
            throw new RuntimeException("exception");
        }

    }


}
